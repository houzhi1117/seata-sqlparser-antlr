// Generated from F:/seata/git-seata/seata-sqlparser-antlr/src/main/antlr4/com.alibaba.seata.mysql.sqlparser/mysql\SqlParser.g4 by ANTLR 4.8
package com.alibaba.seata.sqlparser.antlr.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AS=3, SELECT=4, FROM=5, TABLE=6, ID=7, WS=8;
	public static final int
		RULE_tableName = 0, RULE_column_name = 1, RULE_selectStatement = 2, RULE_selectElements = 3, 
		RULE_tableSources = 4, RULE_selectElement = 5, RULE_uid = 6, RULE_fullColumnName = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"tableName", "column_name", "selectStatement", "selectElements", "tableSources", 
			"selectElement", "uid", "fullColumnName"
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

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TableNameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(SqlParserParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((TableNameContext)_localctx).tmpName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParserParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParserParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlParserParser.FROM, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(SELECT);
			setState(21);
			selectElements();
			setState(22);
			match(FROM);
			setState(23);
			tableSources();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(25);
				((SelectElementsContext)_localctx).star = match(T__0);
				}
				break;
			case ID:
				{
				setState(26);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(29);
				match(T__1);
				setState(30);
				selectElement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourcesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			tableName();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(37);
				match(T__1);
				setState(38);
				tableName();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectColumnElementContext extends SelectElementContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParserParser.AS, 0); }
		public SelectColumnElementContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectColumnElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectColumnElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectColumnElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectElement);
		int _la;
		try {
			_localctx = new SelectColumnElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			fullColumnName();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(45);
					match(AS);
					}
				}

				setState(48);
				uid();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParserParser.ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullColumnNameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\5\5\36\n\5\3\5\3\5\7\5\"\n\5\f\5\16\5%\13\5\3"+
		"\6\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\3\7\5\7\61\n\7\3\7\5\7\64\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\66\2\22\3\2\2\2\4\24"+
		"\3\2\2\2\6\26\3\2\2\2\b\35\3\2\2\2\n&\3\2\2\2\f.\3\2\2\2\16\65\3\2\2\2"+
		"\20\67\3\2\2\2\22\23\7\t\2\2\23\3\3\2\2\2\24\25\7\t\2\2\25\5\3\2\2\2\26"+
		"\27\7\6\2\2\27\30\5\b\5\2\30\31\7\7\2\2\31\32\5\n\6\2\32\7\3\2\2\2\33"+
		"\36\7\3\2\2\34\36\5\f\7\2\35\33\3\2\2\2\35\34\3\2\2\2\36#\3\2\2\2\37 "+
		"\7\4\2\2 \"\5\f\7\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\t\3\2"+
		"\2\2%#\3\2\2\2&+\5\2\2\2\'(\7\4\2\2(*\5\2\2\2)\'\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3\2\2\2.\63\5\20\t\2/\61\7\5\2\2\60/\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64\5\16\b\2\63\60\3\2\2\2\63\64"+
		"\3\2\2\2\64\r\3\2\2\2\65\66\7\t\2\2\66\17\3\2\2\2\678\5\4\3\28\21\3\2"+
		"\2\2\7\35#+\60\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}