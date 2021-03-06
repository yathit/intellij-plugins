package org.angularjs.index;

import com.intellij.lang.javascript.index.JSEntryIndex;
import com.intellij.lang.javascript.index.JSIndexEntry;
import com.intellij.lang.javascript.index.JSNamedElementProxy;
import com.intellij.lang.javascript.index.JavaScriptIndex;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.Ref;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.*;
import com.intellij.util.CommonProcessors;
import com.intellij.util.ConcurrencyUtil;
import com.intellij.util.containers.ConcurrentHashMap;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.intellij.util.indexing.ID;
import gnu.trove.THashSet;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Dennis.Ushakov
 */
public class AngularIndexUtil {
  public static final int BASE_VERSION = 12;
  private static final ConcurrentHashMap<String, Key<ParameterizedCachedValue<List<String>, Pair<Project, ID<String, Void>>>>> ourCacheKeys = new ConcurrentHashMap<String, Key<ParameterizedCachedValue<List<String>, Pair<Project, ID<String, Void>>>>>();
  private static final AngularKeysProvider PROVIDER = new AngularKeysProvider();

  public static JSNamedElementProxy resolve(final Project project, final ID<String, Void> index, final String lookupKey) {
    final Ref<JSNamedElementProxy> result = Ref.create();
    final GlobalSearchScope scope = GlobalSearchScope.allScope(project);
    for (VirtualFile file : FileBasedIndex.getInstance().getContainingFiles(index, lookupKey, scope)) {
      final int id = FileBasedIndex.getFileId(file);
      if (!FileBasedIndex.getInstance().processValues(JSEntryIndex.INDEX_ID, id, null, new FileBasedIndex.ValueProcessor<JSIndexEntry>() {
        @Override
        public boolean process(VirtualFile file, JSIndexEntry value) {
          final JSNamedElementProxy resolve = value.resolveAdditionalData(JavaScriptIndex.getInstance(project), index.toString(), lookupKey);
          if (resolve != null) result.set(resolve);
          return result.isNull();
        }
      }, scope) && result.get().canNavigate()) {
        break;
      }
    }
    return result.get();
  }

  public static Collection<String> getAllKeys(final ID<String, Void> index, final Project project) {
    final String indexId = index.toString();
    final Key<ParameterizedCachedValue<List<String>, Pair<Project, ID<String, Void>>>> key = ConcurrencyUtil.cacheOrGet(ourCacheKeys, indexId, Key.<ParameterizedCachedValue<List<String>, Pair<Project, ID<String, Void>>>>create("angularjs.index." + indexId));
    return CachedValuesManager.getManager(project).getParameterizedCachedValue(project, key, PROVIDER, false, Pair.create(project, index));
  }

  public static boolean hasAngularJS(final Project project) {
    if (ApplicationManager.getApplication().isUnitTestMode() && "disabled".equals(System.getProperty("angular.js"))) return false;

    if (DumbService.isDumb(project)) return false;
    return CachedValuesManager.getManager(project).getCachedValue(project, new CachedValueProvider<Boolean>() {
      @Nullable
      @Override
      public Result<Boolean> compute() {
        final boolean hasNgModel = resolve(project, AngularDirectivesIndex.INDEX_ID, "ng-model") != null;
        return Result.create(hasNgModel, PsiModificationTracker.OUT_OF_CODE_BLOCK_MODIFICATION_COUNT);
      }
    });
  }

  private static class AngularKeysProvider implements ParameterizedCachedValueProvider<List<String>, Pair<Project, ID<String, Void>>> {
    @Nullable
    @Override
    public CachedValueProvider.Result<List<String>> compute(final Pair<Project, ID<String, Void>> projectAndIndex) {
      Set<String> allKeys = new THashSet<String>();
      final GlobalSearchScope scope = GlobalSearchScope.allScope(projectAndIndex.first);
      final CommonProcessors.CollectProcessor<String> processor = new CommonProcessors.CollectProcessor<String>(allKeys) {
        @Override
        protected boolean accept(String key) {
          return true;
        }
      };
      FileBasedIndex.getInstance().processAllKeys(projectAndIndex.second, processor, scope, null);
      return CachedValueProvider.Result.create(ContainerUtil.filter(allKeys, new Condition<String>() {
        @Override
        public boolean value(String key) {
          return !FileBasedIndex.getInstance().processValues(projectAndIndex.second, key, null, new FileBasedIndex.ValueProcessor<Void>() {
            @Override
            public boolean process(VirtualFile file, Void value) {
              return false;
            }
          }, scope);
        }
      }), PsiManager.getInstance(projectAndIndex.first).getModificationTracker());
    }
  }
}
