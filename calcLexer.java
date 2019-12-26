// Generated from .\calc.g4 by ANTLR 4.5.1
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
		MUL=10, DIV=11, ADD=12, SUB=13, EQL=14, MORETHAN=15, LESSTHAN=16, MOREEQL=17, 
		LESSEQL=18, ID=19, LETTER=20, DIGIT=21, NOZERO=22, CHAR=23, NEWLINE=24, 
		WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"MUL", "DIV", "ADD", "SUB", "EQL", "MORETHAN", "LESSTHAN", "MOREEQL", 
		"LESSEQL", "ID", "LETTER", "DIGIT", "NOZERO", "CHAR", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if '", "':'", "'else:'", "'write'", "'('", "')'", "'.'", "';'", 
		"'int '", "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'", "'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "MUL", "DIV", 
		"ADD", "SUB", "EQL", "MORETHAN", "LESSTHAN", "MOREEQL", "LESSEQL", "ID", 
		"LETTER", "DIGIT", "NOZERO", "CHAR", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24k\n\24\f\24\16\24n\13\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30x\n\30\3\31\5\31{\n\31\3\31\3"+
		"\31\3\32\6\32\u0080\n\32\r\32\16\32\u0081\3\32\3\32\2\2\33\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2C\\aac|\3\2\62;\3\2\63"+
		";\5\2\13\f\17\17\"\"\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\59\3"+
		"\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3"+
		"\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35"+
		"\\\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#b\3\2\2\2%e\3\2\2\2\'h\3\2\2\2)o\3\2"+
		"\2\2+q\3\2\2\2-s\3\2\2\2/w\3\2\2\2\61z\3\2\2\2\63\177\3\2\2\2\65\66\7"+
		"k\2\2\66\67\7h\2\2\678\7\"\2\28\4\3\2\2\29:\7<\2\2:\6\3\2\2\2;<\7g\2\2"+
		"<=\7n\2\2=>\7u\2\2>?\7g\2\2?@\7<\2\2@\b\3\2\2\2AB\7y\2\2BC\7t\2\2CD\7"+
		"k\2\2DE\7v\2\2EF\7g\2\2F\n\3\2\2\2GH\7*\2\2H\f\3\2\2\2IJ\7+\2\2J\16\3"+
		"\2\2\2KL\7\60\2\2L\20\3\2\2\2MN\7=\2\2N\22\3\2\2\2OP\7k\2\2PQ\7p\2\2Q"+
		"R\7v\2\2RS\7\"\2\2S\24\3\2\2\2TU\7,\2\2U\26\3\2\2\2VW\7\61\2\2W\30\3\2"+
		"\2\2XY\7-\2\2Y\32\3\2\2\2Z[\7/\2\2[\34\3\2\2\2\\]\7?\2\2]\36\3\2\2\2^"+
		"_\7@\2\2_ \3\2\2\2`a\7>\2\2a\"\3\2\2\2bc\7@\2\2cd\7?\2\2d$\3\2\2\2ef\7"+
		">\2\2fg\7?\2\2g&\3\2\2\2hl\5)\25\2ik\5/\30\2ji\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m(\3\2\2\2nl\3\2\2\2op\t\2\2\2p*\3\2\2\2qr\t\3\2\2r,\3\2"+
		"\2\2st\t\4\2\2t.\3\2\2\2ux\5)\25\2vx\5+\26\2wu\3\2\2\2wv\3\2\2\2x\60\3"+
		"\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}\62\3\2\2\2"+
		"~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\32\2\2\u0084\64\3\2\2"+
		"\2\7\2lwz\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}