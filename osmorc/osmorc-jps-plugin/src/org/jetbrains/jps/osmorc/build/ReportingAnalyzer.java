/*
 * Copyright (c) 2007-2009, Osmorc Development Team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright notice, this list
 *       of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice, this
 *       list of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *     * Neither the name of 'Osmorc Development Team' nor the names of its contributors may be
 *       used to endorse or promote products derived from this software without specific
 *       prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.jetbrains.jps.osmorc.build;

import aQute.bnd.osgi.Analyzer;
import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;

/**
 * @author <a href="mailto:janthomae@janthomae.de">Jan Thom&auml;</a>
 * @since Jul 20, 2009
 */
public class ReportingAnalyzer extends Analyzer {
  private final Reporter myReporter;

  public ReportingAnalyzer(@NotNull Reporter reporter) {
    myReporter = reporter;
  }

  @Override
  public SetLocation error(String s, Object... objects) {
    myReporter.error(MessageFormat.format(s, objects), null, null);
    return super.error(s, objects);
  }

  @Override
  public SetLocation error(String s, Throwable throwable, Object... objects) {
    myReporter.error(MessageFormat.format(s, objects), throwable, null);
    return super.error(s, throwable, objects);
  }

  @Override
  public SetLocation warning(String s, Object... objects) {
    myReporter.warning(MessageFormat.format(s, objects), null, null);
    return super.warning(s, objects);
  }

  @Override
  public void progress(String s, Object... objects) {
    myReporter.progress(MessageFormat.format(s, objects));
  }
}
