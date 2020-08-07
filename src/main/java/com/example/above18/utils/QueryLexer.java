// Generated from Query.g4 by ANTLR 4.7.2
package com.example.above18.utils;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, STRING=2, AND=3, OR=4, NUMBER=5, LPAREN=6, RPAREN=7, GT=8, LT=9, 
		EQ=10, NOT_EQ=11, IDENTIFIER=12, ENCODED_STRING=13, LineTerminator=14, 
		WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "STRING", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", 
			"CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", 
			"SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "LineContinuation", 
			"LineTerminatorSequence", "DecimalDigit", "HexDigit", "OctalDigit", "AND", 
			"OR", "NUMBER", "LPAREN", "RPAREN", "GT", "LT", "EQ", "NOT_EQ", "POINT", 
			"IDENTIFIER", "ENCODED_STRING", "LineTerminator", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'AND'", "'OR'", null, "'('", "')'", "'>'", "'<'", 
			"':'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "STRING", "AND", "OR", "NUMBER", "LPAREN", "RPAREN", "GT", 
			"LT", "EQ", "NOT_EQ", "IDENTIFIER", "ENCODED_STRING", "LineTerminator", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2I\n\2\3\3\3\3\7\3M\n\3\f\3\16\3P\13"+
		"\3\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\5"+
		"\4a\n\4\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\5\7p\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u0083\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u009c"+
		"\n\24\f\24\16\24\u009f\13\24\3\24\5\24\u00a2\n\24\3\24\7\24\u00a5\n\24"+
		"\f\24\16\24\u00a8\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\6\34\u00b9\n\34\r\34\16\34\u00ba\3\35\6\35"+
		"\u00be\n\35\r\35\16\35\u00bf\3\36\3\36\3\36\3\36\3\37\6\37\u00c7\n\37"+
		"\r\37\16\37\u00c8\3\37\3\37\2\2 \3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\5%\6\'\7)\b+\t-\n/\13\61\f\63\r\65"+
		"\2\67\169\17;\20=\21\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$"+
		"$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\3\2\62"+
		";\5\2\62;CHch\3\2\629\6\2\60\60\62;C\\c|\7\2\"#*+<<>>@@\5\2\f\f\17\17"+
		"\u202a\u202b\5\2\13\f\17\17\"\"\2\u00d0\2\3\3\2\2\2\2\5\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\3H\3\2\2\2\5Z\3\2\2\2\7`\3\2\2\2\tf\3\2\2\2\13k\3\2\2\2\ro\3\2\2"+
		"\2\17q\3\2\2\2\21u\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u0082\3\2\2\2\31"+
		"\u0084\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090"+
		"\3\2\2\2#\u0092\3\2\2\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u00a9\3\2\2\2"+
		"+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3"+
		"\3\2\2\2\65\u00b5\3\2\2\2\67\u00b8\3\2\2\29\u00bd\3\2\2\2;\u00c1\3\2\2"+
		"\2=\u00c6\3\2\2\2?@\7v\2\2@A\7t\2\2AB\7w\2\2BI\7g\2\2CD\7h\2\2DE\7c\2"+
		"\2EF\7n\2\2FG\7u\2\2GI\7g\2\2H?\3\2\2\2HC\3\2\2\2I\4\3\2\2\2JN\7$\2\2"+
		"KM\5\7\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2"+
		"Q[\7$\2\2RV\7)\2\2SU\5\t\5\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W"+
		"Y\3\2\2\2XV\3\2\2\2Y[\7)\2\2ZJ\3\2\2\2ZR\3\2\2\2[\6\3\2\2\2\\a\n\2\2\2"+
		"]^\7^\2\2^a\5\13\6\2_a\5\31\r\2`\\\3\2\2\2`]\3\2\2\2`_\3\2\2\2a\b\3\2"+
		"\2\2bg\n\3\2\2cd\7^\2\2dg\5\13\6\2eg\5\31\r\2fb\3\2\2\2fc\3\2\2\2fe\3"+
		"\2\2\2g\n\3\2\2\2hl\5\r\7\2il\5\17\b\2jl\5\21\t\2kh\3\2\2\2ki\3\2\2\2"+
		"kj\3\2\2\2l\f\3\2\2\2mp\5\23\n\2np\5\25\13\2om\3\2\2\2on\3\2\2\2p\16\3"+
		"\2\2\2qr\7z\2\2rs\5\37\20\2st\5\37\20\2t\20\3\2\2\2uv\7w\2\2vw\5\37\20"+
		"\2wx\5\37\20\2xy\5\37\20\2yz\5\37\20\2z\22\3\2\2\2{|\t\4\2\2|\24\3\2\2"+
		"\2}~\n\5\2\2~\26\3\2\2\2\177\u0083\5\23\n\2\u0080\u0083\5\35\17\2\u0081"+
		"\u0083\t\6\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2"+
		"\2\u0083\30\3\2\2\2\u0084\u0085\7^\2\2\u0085\u0086\5\33\16\2\u0086\32"+
		"\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u008b\7\f\2\2\u0089\u008b\5;\36\2"+
		"\u008a\u0087\3\2\2\2\u008a\u0089\3\2\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\t\7\2\2\u008d\36\3\2\2\2\u008e\u008f\t\b\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\t\t\2\2\u0091\"\3\2\2\2\u0092\u0093\7C\2\2\u0093\u0094\7P\2\2\u0094\u0095"+
		"\7F\2\2\u0095$\3\2\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7T\2\2\u0098&\3"+
		"\2\2\2\u0099\u009d\4\62;\2\u009a\u009c\4\62;\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5\65\33\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\4\62;\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa*\3\2\2\2\u00ab"+
		"\u00ac\7+\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae.\3\2\2\2\u00af\u00b0"+
		"\7>\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\62\3\2\2\2\u00b3\u00b4"+
		"\7#\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\66\3\2\2\2\u00b7\u00b9"+
		"\t\n\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb8\3\2\2\2\u00bc\u00be\n\13\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0:\3"+
		"\2\2\2\u00c1\u00c2\t\f\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\36\2\2\u00c4"+
		"<\3\2\2\2\u00c5\u00c7\t\r\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\b\37\3\2\u00cb>\3\2\2\2\23\2HNVZ`fko\u0082\u008a\u009d\u00a1\u00a6\u00ba"+
		"\u00bf\u00c8\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}