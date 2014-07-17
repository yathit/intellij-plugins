/* The following code was generated by JFlex 1.4.3 on 6/9/14 12:53 PM */

package org.angularjs.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static org.angularjs.lang.lexer.AngularJSTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/9/14 12:53 PM from the specification file
 * <tt>/Users/denofevil/Code/IDEA/tools/lexer/../../contrib/AngularJS/src/org/angularjs/lang/lexer/angular.flex</tt>
 */
class _AngularJSLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYSTRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\1\1\0\1\57\22\0\1\27\1\40\1\10"+
    "\1\0\1\11\1\35\1\43\1\10\1\45\1\46\1\33\1\32\1\53"+
    "\1\7\1\5\1\34\12\4\1\55\1\54\1\41\1\37\1\42\1\56"+
    "\1\0\4\60\1\6\1\60\24\11\1\51\1\2\1\52\1\36\1\11"+
    "\1\0\1\17\1\30\1\25\1\23\1\15\1\16\2\11\1\24\1\11"+
    "\1\26\1\20\1\11\1\22\3\11\1\13\1\21\1\12\1\14\3\11"+
    "\1\31\1\11\1\47\1\44\1\50\42\0\1\1\uff5f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\6\5\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\2\36\1\37\1\0\2\3\3\5\1\40\1\5\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\0\1\3\5\5\1\52\1\53\1\54\1\55\1\56"+
    "\3\5\1\57\1\55\2\5\1\60\1\55\1\0\1\5"+
    "\1\0\1\5\1\61\1\5\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\142\0\142\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d"+
    "\0\142\0\142\0\142\0\142\0\142\0\u02ae\0\u02df\0\u0310"+
    "\0\u0341\0\u0372\0\u03a3\0\142\0\142\0\142\0\142\0\142"+
    "\0\142\0\142\0\142\0\u03d4\0\142\0\u0405\0\u0436\0\142"+
    "\0\142\0\304\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u0157"+
    "\0\u055c\0\u0157\0\u058d\0\u05be\0\142\0\142\0\142\0\142"+
    "\0\142\0\142\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4"+
    "\0\u0715\0\142\0\142\0\142\0\u0746\0\u0157\0\u0777\0\u07a8"+
    "\0\u07d9\0\u0157\0\u080a\0\u083b\0\u086c\0\u0157\0\u089d\0\u08ce"+
    "\0\u08ff\0\u0930\0\u0961\0\142\0\u0992\0\u0157";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\12\1\10\1\13\1\10\1\14\1\10\1\15\1\16"+
    "\2\10\1\17\1\10\1\20\2\10\1\4\2\10\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\4\1\10\2\46\1\47"+
    "\1\50\4\46\1\51\46\46\1\50\1\46\62\0\1\4"+
    "\1\52\1\4\23\0\1\4\27\0\1\4\4\0\1\4"+
    "\61\0\1\6\1\53\1\54\6\0\1\54\47\0\1\53"+
    "\60\0\1\10\1\0\1\10\2\0\16\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\2\10"+
    "\1\55\13\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\2\0\11\10\1\56\4\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\6\10"+
    "\1\57\7\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\2\0\10\10\1\60\5\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\3\10"+
    "\1\61\12\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\2\0\11\10\1\62\4\10\1\0\2\10"+
    "\26\0\1\10\37\0\1\63\60\0\1\64\60\0\1\65"+
    "\60\0\1\66\64\0\1\67\61\0\1\70\71\0\1\71"+
    "\3\0\2\46\2\0\4\46\1\0\46\46\1\0\1\46"+
    "\3\72\1\0\10\72\1\73\42\72\1\0\1\72\4\0"+
    "\1\53\1\0\1\54\6\0\1\54\47\0\1\74\2\0"+
    "\1\74\22\0\1\74\32\0\1\10\1\0\1\10\2\0"+
    "\3\10\1\75\2\10\1\76\7\10\1\0\2\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\2\0\12\10\1\77"+
    "\3\10\1\0\2\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\2\0\7\10\1\100\6\10\1\0\2\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\2\0\7\10\1\101"+
    "\6\10\1\0\2\10\26\0\1\10\37\0\1\102\60\0"+
    "\1\103\21\0\4\104\1\105\1\104\1\105\6\104\3\105"+
    "\3\104\1\105\1\104\1\105\2\104\1\105\27\104\1\105"+
    "\4\0\1\74\60\0\1\10\1\0\1\10\2\0\4\10"+
    "\1\106\11\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\2\0\14\10\1\107\1\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\4\10"+
    "\1\110\11\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\2\0\10\10\1\111\5\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\7\10"+
    "\1\112\6\10\1\0\2\10\26\0\1\10\4\0\1\113"+
    "\1\0\1\113\6\0\3\113\3\0\1\113\1\0\1\113"+
    "\2\0\1\113\27\0\1\113\4\0\1\10\1\0\1\10"+
    "\2\0\15\10\1\114\1\0\2\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\2\0\5\10\1\115\10\10\1\0"+
    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\2\0"+
    "\4\10\1\116\11\10\1\0\2\10\26\0\1\10\4\0"+
    "\1\117\1\0\1\117\6\0\3\117\3\0\1\117\1\0"+
    "\1\117\2\0\1\117\27\0\1\117\4\0\1\10\1\0"+
    "\1\10\2\0\16\10\1\120\2\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\2\0\13\10\1\121\2\10\1\0"+
    "\2\10\26\0\1\10\4\0\1\72\1\0\1\72\6\0"+
    "\3\72\3\0\1\72\1\0\1\72\2\0\1\72\27\0"+
    "\1\72\30\0\1\122\34\0\1\10\1\0\1\10\2\0"+
    "\11\10\1\123\4\10\1\0\2\10\26\0\1\10\31\0"+
    "\1\124\33\0\1\10\1\0\1\10\2\0\4\10\1\125"+
    "\11\10\1\0\2\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\2\0\12\10\1\126\3\10\1\0\2\10\26\0"+
    "\1\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2499];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\2\11\6\1\5\11\6\1\10\11"+
    "\1\1\1\11\2\1\2\11\1\0\12\1\6\11\1\0"+
    "\6\1\3\11\13\1\1\0\1\1\1\0\1\1\1\11"+
    "\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;


  _AngularJSLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _AngularJSLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 46: 
          { return TRUE_KEYWORD;
          }
        case 51: break;
        case 15: 
          { return LT;
          }
        case 52: break;
        case 43: 
          { return NEQEQ;
          }
        case 53: break;
        case 26: 
          { return SEMICOLON;
          }
        case 54: break;
        case 9: 
          { return MULT;
          }
        case 55: break;
        case 21: 
          { return LBRACE;
          }
        case 56: break;
        case 22: 
          { return RBRACE;
          }
        case 57: break;
        case 14: 
          { return EXCL;
          }
        case 58: break;
        case 38: 
          { return ANDAND;
          }
        case 59: break;
        case 12: 
          { return XOR;
          }
        case 60: break;
        case 19: 
          { return LPAR;
          }
        case 61: break;
        case 24: 
          { return RBRACKET;
          }
        case 62: break;
        case 30: 
          { yypushback(yytext().length()); yybegin(YYINITIAL);
          }
        case 63: break;
        case 25: 
          { return COMMA;
          }
        case 64: break;
        case 4: 
          { return DOT;
          }
        case 65: break;
        case 18: 
          { return OR;
          }
        case 66: break;
        case 29: 
          { return STRING_LITERAL;
          }
        case 67: break;
        case 10: 
          { return DIV;
          }
        case 68: break;
        case 32: 
          { return AS_KEYWORD;
          }
        case 69: break;
        case 49: 
          { return TRACK_BY_KEYWORD;
          }
        case 70: break;
        case 50: 
          { return UNDEFINED_KEYWORD;
          }
        case 71: break;
        case 27: 
          { return COLON;
          }
        case 72: break;
        case 40: 
          { return ONE_TIME_BINDING;
          }
        case 73: break;
        case 34: 
          { return EQEQ;
          }
        case 74: break;
        case 17: 
          { return AND;
          }
        case 75: break;
        case 44: 
          { yypushback(1); return INVALID_ESCAPE_SEQUENCE;
          }
        case 76: break;
        case 37: 
          { return GE;
          }
        case 77: break;
        case 11: 
          { return PERC;
          }
        case 78: break;
        case 20: 
          { return RPAR;
          }
        case 79: break;
        case 3: 
          { return NUMERIC_LITERAL;
          }
        case 80: break;
        case 39: 
          { return OROR;
          }
        case 81: break;
        case 45: 
          { return INVALID_ESCAPE_SEQUENCE;
          }
        case 82: break;
        case 16: 
          { return GT;
          }
        case 83: break;
        case 48: 
          { return FALSE_KEYWORD;
          }
        case 84: break;
        case 23: 
          { return LBRACKET;
          }
        case 85: break;
        case 28: 
          { return QUEST;
          }
        case 86: break;
        case 35: 
          { return NE;
          }
        case 87: break;
        case 6: 
          { return MINUS;
          }
        case 88: break;
        case 7: 
          { yybegin(YYSTRING); return STRING_LITERAL;
          }
        case 89: break;
        case 1: 
          { return BAD_CHARACTER;
          }
        case 90: break;
        case 5: 
          { return IDENTIFIER;
          }
        case 91: break;
        case 42: 
          { return EQEQEQ;
          }
        case 92: break;
        case 31: 
          { yybegin(YYINITIAL); return STRING_LITERAL;
          }
        case 93: break;
        case 13: 
          { return EQ;
          }
        case 94: break;
        case 33: 
          { return IN_KEYWORD;
          }
        case 95: break;
        case 2: 
          { return WHITE_SPACE;
          }
        case 96: break;
        case 8: 
          { return PLUS;
          }
        case 97: break;
        case 41: 
          { return ESCAPE_SEQUENCE;
          }
        case 98: break;
        case 47: 
          { return NULL_KEYWORD;
          }
        case 99: break;
        case 36: 
          { return LE;
          }
        case 100: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}