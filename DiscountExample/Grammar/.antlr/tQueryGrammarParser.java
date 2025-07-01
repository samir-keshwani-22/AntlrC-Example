// Generated from d:/AntlrC#Example/DiscountExample/Grammar/tQueryGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class tQueryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OFFSET=2, QUERY=3, COUNT=4, SUM=5, STAR=6, AMOUNT=7, LPAREN=8, 
		RPAREN=9, WHERE=10, ACCOUNT=11, SOURCE=12, DEST=13, IS=14, AND=15, FROM=16, 
		DATA=17, PAST=18, DAY=19, HOUR=20, BEFORE=21, TRANSACTION_DATE=22, INT=23, 
		WS=24;
	public static final int
		RULE_query = 0, RULE_agg_expr_list = 1, RULE_agg_expr = 2, RULE_time_window = 3, 
		RULE_where_expr = 4, RULE_account_expr = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "agg_expr_list", "agg_expr", "time_window", "where_expr", "account_expr", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'QUERY'", "'COUNT'", "'SUM'", "'*'", "'{amount}'", 
			"'('", "')'", "'WHERE'", "'#{account}'", "'{source}'", "'{dest}'", "'is'", 
			"'AND'", "'FROM'", "'DATA'", "'PAST'", "'day'", "'hour'", "'before'", 
			"'transaction date'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OFFSET", "QUERY", "COUNT", "SUM", "STAR", "AMOUNT", "LPAREN", 
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
	public String getGrammarFileName() { return "tQueryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tQueryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(tQueryGrammarParser.QUERY, 0); }
		public Agg_expr_listContext agg_expr_list() {
			return getRuleContext(Agg_expr_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tQueryGrammarParser.FROM, 0); }
		public TerminalNode DATA() { return getToken(tQueryGrammarParser.DATA, 0); }
		public Time_windowContext time_window() {
			return getRuleContext(Time_windowContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(tQueryGrammarParser.WHERE, 0); }
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
			setState(14);
			match(QUERY);
			setState(15);
			agg_expr_list();
			setState(16);
			match(FROM);
			setState(17);
			match(DATA);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAST) {
				{
				setState(18);
				time_window();
				}
			}

			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(21);
				match(WHERE);
				setState(22);
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
			setState(25);
			agg_expr();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(26);
				match(T__0);
				setState(27);
				agg_expr();
				}
				}
				setState(32);
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
		public TerminalNode COUNT() { return getToken(tQueryGrammarParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(tQueryGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(tQueryGrammarParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(tQueryGrammarParser.STAR, 0); }
		public TerminalNode AMOUNT() { return getToken(tQueryGrammarParser.AMOUNT, 0); }
		public TerminalNode SUM() { return getToken(tQueryGrammarParser.SUM, 0); }
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(COUNT);
				setState(34);
				match(LPAREN);
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==AMOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(SUM);
				setState(38);
				match(LPAREN);
				setState(39);
				match(AMOUNT);
				setState(40);
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
	public static class Time_windowContext extends ParserRuleContext {
		public TerminalNode PAST() { return getToken(tQueryGrammarParser.PAST, 0); }
		public TerminalNode INT() { return getToken(tQueryGrammarParser.INT, 0); }
		public TerminalNode DAY() { return getToken(tQueryGrammarParser.DAY, 0); }
		public TerminalNode FROM() { return getToken(tQueryGrammarParser.FROM, 0); }
		public TerminalNode TRANSACTION_DATE() { return getToken(tQueryGrammarParser.TRANSACTION_DATE, 0); }
		public TerminalNode OFFSET() { return getToken(tQueryGrammarParser.OFFSET, 0); }
		public Time_windowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_window; }
	}

	public final Time_windowContext time_window() throws RecognitionException {
		Time_windowContext _localctx = new Time_windowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_time_window);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PAST);
			setState(44);
			match(INT);
			setState(45);
			match(DAY);
			setState(46);
			match(FROM);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(47);
				match(OFFSET);
				}
			}

			setState(50);
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
	public static class Where_exprContext extends ParserRuleContext {
		public Account_exprContext account_expr() {
			return getRuleContext(Account_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(tQueryGrammarParser.AND, 0); }
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
		enterRule(_localctx, 8, RULE_where_expr);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				account_expr();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(53);
					match(AND);
					setState(54);
					where_expr();
					}
				}

				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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
		public TerminalNode ACCOUNT() { return getToken(tQueryGrammarParser.ACCOUNT, 0); }
		public TerminalNode IS() { return getToken(tQueryGrammarParser.IS, 0); }
		public TerminalNode SOURCE() { return getToken(tQueryGrammarParser.SOURCE, 0); }
		public TerminalNode DEST() { return getToken(tQueryGrammarParser.DEST, 0); }
		public Account_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account_expr; }
	}

	public final Account_exprContext account_expr() throws RecognitionException {
		Account_exprContext _localctx = new Account_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_account_expr);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(ACCOUNT);
				setState(61);
				match(IS);
				setState(62);
				match(SOURCE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(ACCOUNT);
				setState(64);
				match(IS);
				setState(65);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\u0004\u0001\u0018G\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0018\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u001d\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002*\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00031\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0003\u0004"+
		";\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005C\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000"+
		"\u0006\u0007G\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000"+
		"\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000"+
		"\b:\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0010\u0003\u0002"+
		"\u0001\u0000\u0010\u0011\u0005\u0010\u0000\u0000\u0011\u0013\u0005\u0011"+
		"\u0000\u0000\u0012\u0014\u0003\u0006\u0003\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\n\u0000\u0000\u0016\u0018\u0003\b\u0004"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001e\u0003\u0004\u0002"+
		"\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001d\u0003\u0004\u0002"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f\u0003\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\""+
		"\u0005\u0004\u0000\u0000\"#\u0005\b\u0000\u0000#$\u0007\u0000\u0000\u0000"+
		"$*\u0005\t\u0000\u0000%&\u0005\u0005\u0000\u0000&\'\u0005\b\u0000\u0000"+
		"\'(\u0005\u0007\u0000\u0000(*\u0005\t\u0000\u0000)!\u0001\u0000\u0000"+
		"\u0000)%\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0012\u0000\u0000,-\u0005\u0017\u0000\u0000-.\u0005\u0013\u0000\u0000"+
		".0\u0005\u0010\u0000\u0000/1\u0005\u0002\u0000\u00000/\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005\u0016"+
		"\u0000\u00003\u0007\u0001\u0000\u0000\u000047\u0003\n\u0005\u000056\u0005"+
		"\u000f\u0000\u000068\u0003\b\u0004\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u00009;\u0003\f\u0006\u0000:4\u0001"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000"+
		"<=\u0005\u000b\u0000\u0000=>\u0005\u000e\u0000\u0000>C\u0005\f\u0000\u0000"+
		"?@\u0005\u000b\u0000\u0000@A\u0005\u000e\u0000\u0000AC\u0005\r\u0000\u0000"+
		"B<\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000C\u000b\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\r\u0001\u0000\u0000\u0000\b\u0013"+
		"\u0017\u001e)07:B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}