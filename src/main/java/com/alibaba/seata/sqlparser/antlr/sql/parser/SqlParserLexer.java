// Generated from F:/seata/git-seata/seata-sqlparser-antlr/src/main/antlr4/com.alibaba.seata.mysql.sqlparser/mysql\SqlParser.g4 by ANTLR 4.8
package com.alibaba.seata.sqlparser.antlr.sql.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AS=3, SELECT=4, FROM=5, TABLE=6, ID=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AS", "SELECT", "FROM", "TABLE", "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z", "HEX_DIGIT", "DEC_DIGIT", "LETTER", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AS", "SELECT", "FROM", "TABLE", "ID", "WS"
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


	public SqlParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\7%\u00a3\n%\f%\16"+
		"%\u00a6\13%\3&\6&\u00a9\n&\r&\16&\u00aa\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\tK\n\3\2\"\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\62"+
		";CH\3\2\62;\4\2C\\c|\7\2&&,,C\\aac|\b\2&&,,\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2"+
		"\2\tT\3\2\2\2\13[\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2"+
		"\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3\2"+
		"\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0080\3\2\2\2+\u0082\3"+
		"\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63\u008a\3\2\2\2"+
		"\65\u008c\3\2\2\2\67\u008e\3\2\2\29\u0090\3\2\2\2;\u0092\3\2\2\2=\u0094"+
		"\3\2\2\2?\u0096\3\2\2\2A\u0098\3\2\2\2C\u009a\3\2\2\2E\u009c\3\2\2\2G"+
		"\u009e\3\2\2\2I\u00a0\3\2\2\2K\u00a8\3\2\2\2MN\7,\2\2N\4\3\2\2\2OP\7."+
		"\2\2P\6\3\2\2\2QR\5\17\b\2RS\5\63\32\2S\b\3\2\2\2TU\5\63\32\2UV\5\27\f"+
		"\2VW\5%\23\2WX\5\27\f\2XY\5\23\n\2YZ\5\65\33\2Z\n\3\2\2\2[\\\5\31\r\2"+
		"\\]\5\61\31\2]^\5+\26\2^_\5\'\24\2_\f\3\2\2\2`a\5\65\33\2ab\5\17\b\2b"+
		"c\5\21\t\2cd\5%\23\2de\5\27\f\2e\16\3\2\2\2fg\t\2\2\2g\20\3\2\2\2hi\t"+
		"\3\2\2i\22\3\2\2\2jk\t\4\2\2k\24\3\2\2\2lm\t\5\2\2m\26\3\2\2\2no\t\6\2"+
		"\2o\30\3\2\2\2pq\t\7\2\2q\32\3\2\2\2rs\t\b\2\2s\34\3\2\2\2tu\t\t\2\2u"+
		"\36\3\2\2\2vw\t\n\2\2w \3\2\2\2xy\t\13\2\2y\"\3\2\2\2z{\t\f\2\2{$\3\2"+
		"\2\2|}\t\r\2\2}&\3\2\2\2~\177\t\16\2\2\177(\3\2\2\2\u0080\u0081\t\17\2"+
		"\2\u0081*\3\2\2\2\u0082\u0083\t\20\2\2\u0083,\3\2\2\2\u0084\u0085\t\21"+
		"\2\2\u0085.\3\2\2\2\u0086\u0087\t\22\2\2\u0087\60\3\2\2\2\u0088\u0089"+
		"\t\23\2\2\u0089\62\3\2\2\2\u008a\u008b\t\24\2\2\u008b\64\3\2\2\2\u008c"+
		"\u008d\t\25\2\2\u008d\66\3\2\2\2\u008e\u008f\t\26\2\2\u008f8\3\2\2\2\u0090"+
		"\u0091\t\27\2\2\u0091:\3\2\2\2\u0092\u0093\t\30\2\2\u0093<\3\2\2\2\u0094"+
		"\u0095\t\31\2\2\u0095>\3\2\2\2\u0096\u0097\t\32\2\2\u0097@\3\2\2\2\u0098"+
		"\u0099\t\33\2\2\u0099B\3\2\2\2\u009a\u009b\t\34\2\2\u009bD\3\2\2\2\u009c"+
		"\u009d\t\35\2\2\u009dF\3\2\2\2\u009e\u009f\t\36\2\2\u009fH\3\2\2\2\u00a0"+
		"\u00a4\t\37\2\2\u00a1\u00a3\t \2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5J\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a9\t!\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b&"+
		"\2\2\u00adL\3\2\2\2\5\2\u00a4\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}