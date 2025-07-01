// Generated from d:/AntlrC#Example/DiscountExample/Grammar/QueryGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QueryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, QUERY=3, COUNT=4, SUM=5, STAR=6, AMOUNT=7, LPAREN=8, RPAREN=9, 
		WHERE=10, ACCOUNT=11, SOURCE=12, DEST=13, IS=14, AND=15, FROM=16, DATA=17, 
		PAST=18, DAY=19, HOUR=20, BEFORE=21, TRANSACTION_DATE=22, INT=23, WS=24;
	public static final int
		RULE_query = 0, RULE_agg_expr_list = 1, RULE_agg_expr = 2, RULE_time_related = 3, 
		RULE_offset = 4, RULE_where_expr = 5, RULE_account_expr = 6, RULE_expression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "agg_expr_list", "agg_expr", "time_related", "offset", "where_expr", 
			"account_expr", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'expression'", "'QUERY'", "'COUNT'", "'SUM'", "'*'", "'{amount}'", 
			"'('", "')'", "'WHERE'", "'#{account}'", "'{source}'", "'{dest}'", "'is'", 
			"'AND'", "'FROM'", "'DATA'", "'PAST'", "'day'", "'hour'", "'before'", 
			"'transaction date'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "QUERY", "COUNT", "SUM", "STAR", "AMOUNT", "LPAREN", 
			"RPAREN", "WHERE", "ACCOUNT", "SOURCE", "DEST", "IS", "AND", "FROM", 
			"DATA", "PAST", "DAY", "HOUR", "BEFORE", "TRANSACTION_DATE", "INT", "WS"
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
	public String getGrammarFileName() { return "QueryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryGrammarParser.QUERY, 0); }
		public Agg_expr_listContext agg_expr_list() {
			return getRuleContext(Agg_expr_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(QueryGrammarParser.FROM, 0); }
		public TerminalNode DATA() { return getToken(QueryGrammarParser.DATA, 0); }
		public Time_relatedContext time_related() {
			return getRuleContext(Time_relatedContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(QueryGrammarParser.WHERE, 0); }
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(QUERY);
			setState(17);
			agg_expr_list();
			setState(18);
			match(FROM);
			setState(19);
			match(DATA);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAST) {
				{
				setState(20);
				time_related();
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(23);
				match(WHERE);
				setState(24);
				where_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Agg_expr_listContext extends ParserRuleContext {
		public List<Agg_exprContext> agg_expr() {
			return getRuleContexts(Agg_exprContext.class);
		}
		public Agg_exprContext agg_expr(int i) {
			return getRuleContext(Agg_exprContext.class,i);
		}
		public Agg_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_expr_list; }
	}

	public final Agg_expr_listContext agg_expr_list() throws RecognitionException {
		Agg_expr_listContext _localctx = new Agg_expr_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_agg_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			agg_expr();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				match(T__0);
				setState(29);
				agg_expr();
				}
				}
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Agg_exprContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(QueryGrammarParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(QueryGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QueryGrammarParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(QueryGrammarParser.STAR, 0); }
		public TerminalNode AMOUNT() { return getToken(QueryGrammarParser.AMOUNT, 0); }
		public TerminalNode SUM() { return getToken(QueryGrammarParser.SUM, 0); }
		public Agg_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_expr; }
	}

	public final Agg_exprContext agg_expr() throws RecognitionException {
		Agg_exprContext _localctx = new Agg_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_agg_expr);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(COUNT);
				setState(36);
				match(LPAREN);
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==AMOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(SUM);
				setState(40);
				match(LPAREN);
				setState(41);
				match(AMOUNT);
				setState(42);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Time_relatedContext extends ParserRuleContext {
		public TerminalNode PAST() { return getToken(QueryGrammarParser.PAST, 0); }
		public TerminalNode INT() { return getToken(QueryGrammarParser.INT, 0); }
		public TerminalNode DAY() { return getToken(QueryGrammarParser.DAY, 0); }
		public TerminalNode FROM() { return getToken(QueryGrammarParser.FROM, 0); }
		public TerminalNode TRANSACTION_DATE() { return getToken(QueryGrammarParser.TRANSACTION_DATE, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Time_relatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_related; }
	}

	public final Time_relatedContext time_related() throws RecognitionException {
		Time_relatedContext _localctx = new Time_relatedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_time_related);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PAST);
			setState(46);
			match(INT);
			setState(47);
			match(DAY);
			setState(48);
			match(FROM);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(49);
				offset();
				}
			}

			setState(52);
			match(TRANSACTION_DATE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QueryGrammarParser.INT, 0); }
		public TerminalNode HOUR() { return getToken(QueryGrammarParser.HOUR, 0); }
		public TerminalNode BEFORE() { return getToken(QueryGrammarParser.BEFORE, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INT);
			setState(55);
			match(HOUR);
			setState(56);
			match(BEFORE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_exprContext extends ParserRuleContext {
		public Account_exprContext account_expr() {
			return getRuleContext(Account_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(QueryGrammarParser.AND, 0); }
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expr; }
	}

	public final Where_exprContext where_expr() throws RecognitionException {
		Where_exprContext _localctx = new Where_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_where_expr);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				account_expr();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(59);
					match(AND);
					setState(60);
					where_expr();
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Account_exprContext extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(QueryGrammarParser.ACCOUNT, 0); }
		public TerminalNode IS() { return getToken(QueryGrammarParser.IS, 0); }
		public TerminalNode SOURCE() { return getToken(QueryGrammarParser.SOURCE, 0); }
		public TerminalNode DEST() { return getToken(QueryGrammarParser.DEST, 0); }
		public Account_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account_expr; }
	}

	public final Account_exprContext account_expr() throws RecognitionException {
		Account_exprContext _localctx = new Account_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_account_expr);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ACCOUNT);
				setState(67);
				match(IS);
				setState(68);
				match(SOURCE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(ACCOUNT);
				setState(70);
				match(IS);
				setState(71);
				match(DEST);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
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
		"\u0004\u0001\u0018M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005>\b\u0005\u0001\u0005\u0003"+
		"\u0005A\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006I\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001"+
		"\u0000\u0006\u0007L\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u001b\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fH\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0003"+
		"\u0000\u0000\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0005\u0010"+
		"\u0000\u0000\u0013\u0015\u0005\u0011\u0000\u0000\u0014\u0016\u0003\u0006"+
		"\u0003\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0018\u0005\n\u0000"+
		"\u0000\u0018\u001a\u0003\n\u0005\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b \u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d"+
		"\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0005\u0004\u0000\u0000$%\u0005\b\u0000\u0000%&\u0007\u0000\u0000\u0000"+
		"&,\u0005\t\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0005\b\u0000\u0000"+
		")*\u0005\u0007\u0000\u0000*,\u0005\t\u0000\u0000+#\u0001\u0000\u0000\u0000"+
		"+\'\u0001\u0000\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0005\u0012"+
		"\u0000\u0000./\u0005\u0017\u0000\u0000/0\u0005\u0013\u0000\u000002\u0005"+
		"\u0010\u0000\u000013\u0003\b\u0004\u000021\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0016\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000067\u0005\u0017\u0000\u000078\u0005\u0014"+
		"\u0000\u000089\u0005\u0015\u0000\u00009\t\u0001\u0000\u0000\u0000:=\u0003"+
		"\f\u0006\u0000;<\u0005\u000f\u0000\u0000<>\u0003\n\u0005\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?A\u0003\u000e\u0007\u0000@:\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\u000b\u0000\u0000CD\u0005"+
		"\u000e\u0000\u0000DI\u0005\f\u0000\u0000EF\u0005\u000b\u0000\u0000FG\u0005"+
		"\u000e\u0000\u0000GI\u0005\r\u0000\u0000HB\u0001\u0000\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000\b\u0015\u0019 +2=@H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}