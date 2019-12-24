// Generated from .\calc.g by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MUL=11, DIV=12, ADD=13, SUB=14, EQL=15, MORETHAN=16, LESSTHAN=17, 
		ID=18, LETTER=19, DIGIT=20, NOZERO=21, CHAR=22, NEWLINE=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "MUL", "DIV", "ADD", "SUB", "EQL", "MORETHAN", "LESSTHAN", "ID", 
		"LETTER", "DIGIT", "NOZERO", "CHAR", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if '", "':'", "'else:'", "'write'", "'('", "')'", "'.'", "';'", 
		"'int '", "'float '", "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "MUL", 
		"DIV", "ADD", "SUB", "EQL", "MORETHAN", "LESSTHAN", "ID", "LETTER", "DIGIT", 
		"NOZERO", "CHAR", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public calcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calc.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\7\23j\n\23\f\23\16\23m\13\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\5\27w\n\27\3\30\5\30z\n\30\3\30\3\30\3"+
		"\31\6\31\177\n\31\r\31\16\31\u0080\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\3\2\6\5\2C\\aac|\3\2\62;\3\2\63;\5\2\13\f\17"+
		"\17\"\"\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t?\3\2"+
		"\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25R\3"+
		"\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3"+
		"\2\2\2#e\3\2\2\2%g\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-v\3\2\2\2/y"+
		"\3\2\2\2\61~\3\2\2\2\63\64\7k\2\2\64\65\7h\2\2\65\66\7\"\2\2\66\4\3\2"+
		"\2\2\678\7<\2\28\6\3\2\2\29:\7g\2\2:;\7n\2\2;<\7u\2\2<=\7g\2\2=>\7<\2"+
		"\2>\b\3\2\2\2?@\7y\2\2@A\7t\2\2AB\7k\2\2BC\7v\2\2CD\7g\2\2D\n\3\2\2\2"+
		"EF\7*\2\2F\f\3\2\2\2GH\7+\2\2H\16\3\2\2\2IJ\7\60\2\2J\20\3\2\2\2KL\7="+
		"\2\2L\22\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7\"\2\2Q\24\3\2\2\2RS\7"+
		"h\2\2ST\7n\2\2TU\7q\2\2UV\7c\2\2VW\7v\2\2WX\7\"\2\2X\26\3\2\2\2YZ\7,\2"+
		"\2Z\30\3\2\2\2[\\\7\61\2\2\\\32\3\2\2\2]^\7-\2\2^\34\3\2\2\2_`\7/\2\2"+
		"`\36\3\2\2\2ab\7?\2\2b \3\2\2\2cd\7@\2\2d\"\3\2\2\2ef\7>\2\2f$\3\2\2\2"+
		"gk\5\'\24\2hj\5-\27\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2"+
		"\2mk\3\2\2\2no\t\2\2\2o(\3\2\2\2pq\t\3\2\2q*\3\2\2\2rs\t\4\2\2s,\3\2\2"+
		"\2tw\5\'\24\2uw\5)\25\2vt\3\2\2\2vu\3\2\2\2w.\3\2\2\2xz\7\17\2\2yx\3\2"+
		"\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|\60\3\2\2\2}\177\t\5\2\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\b\31\2\2\u0083\62\3\2\2\2\7\2kvy\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}