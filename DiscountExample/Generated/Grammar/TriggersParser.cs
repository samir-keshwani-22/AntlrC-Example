//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from ./Grammar/Triggers.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using System.Diagnostics;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class TriggersParser : Parser {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		SOURCE_TOKEN=1, DEST_TOKEN=2, QUERY=3, LPAREN=4, FROM=5, DATA=6, STAR=7, 
		COUNT=8, RPAREN=9, WHERE=10, EQ=11, COMMA=12, NE=13, IN=14, NOT_IN=15, 
		GT=16, LT=17, GE=18, IS=19, LE=20, AND=21, EMPTY=22, OR=23, ACCOUNT=24, 
		IDENTIFIER=25, VALUEIDENTIFIER=26, DATE=27, WS=28, INVALID=29;
	public const int
		RULE_start = 0, RULE_trigger = 1, RULE_aggregateTrigger = 2, RULE_aggregateList = 3, 
		RULE_aggregate = 4, RULE_aggregateFunction = 5, RULE_preExpression = 6, 
		RULE_sourceDestSpecifier = 7, RULE_expression = 8, RULE_term = 9, RULE_field = 10, 
		RULE_operator = 11, RULE_value = 12, RULE_logicalOperator = 13;
	public static readonly string[] ruleNames = {
		"start", "trigger", "aggregateTrigger", "aggregateList", "aggregate", 
		"aggregateFunction", "preExpression", "sourceDestSpecifier", "expression", 
		"term", "field", "operator", "value", "logicalOperator"
	};

	private static readonly string[] _LiteralNames = {
		null, "'{source}'", "'{dest}'", "'QUERY'", "'('", "'FROM'", "'DATA'", 
		"'*'", "'COUNT'", "')'", "'WHERE'", "'='", "','", "'!='", "'in'", null, 
		"'>'", "'<'", "'>='", "'is'", "'<='", "'AND'", null, "'OR'", "'#{account}'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "SOURCE_TOKEN", "DEST_TOKEN", "QUERY", "LPAREN", "FROM", "DATA", 
		"STAR", "COUNT", "RPAREN", "WHERE", "EQ", "COMMA", "NE", "IN", "NOT_IN", 
		"GT", "LT", "GE", "IS", "LE", "AND", "EMPTY", "OR", "ACCOUNT", "IDENTIFIER", 
		"VALUEIDENTIFIER", "DATE", "WS", "INVALID"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Triggers.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static TriggersParser() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}

		public TriggersParser(ITokenStream input) : this(input, Console.Out, Console.Error) { }

		public TriggersParser(ITokenStream input, TextWriter output, TextWriter errorOutput)
		: base(input, output, errorOutput)
	{
		Interpreter = new ParserATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	public partial class StartContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public TriggerContext trigger() {
			return GetRuleContext<TriggerContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode Eof() { return GetToken(TriggersParser.Eof, 0); }
		public StartContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_start; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterStart(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitStart(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitStart(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public StartContext start() {
		StartContext _localctx = new StartContext(Context, State);
		EnterRule(_localctx, 0, RULE_start);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 28;
			trigger();
			State = 29;
			Match(Eof);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class TriggerContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public PreExpressionContext preExpression() {
			return GetRuleContext<PreExpressionContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public AggregateTriggerContext aggregateTrigger() {
			return GetRuleContext<AggregateTriggerContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode WHERE() { return GetToken(TriggersParser.WHERE, 0); }
		public TriggerContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_trigger; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterTrigger(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitTrigger(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitTrigger(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public TriggerContext trigger() {
		TriggerContext _localctx = new TriggerContext(Context, State);
		EnterRule(_localctx, 2, RULE_trigger);
		try {
			State = 44;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,0,Context) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				State = 31;
				expression();
				}
				break;
			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 32;
				preExpression();
				State = 33;
				expression();
				}
				break;
			case 3:
				EnterOuterAlt(_localctx, 3);
				{
				State = 35;
				aggregateTrigger();
				State = 36;
				Match(WHERE);
				State = 37;
				expression();
				}
				break;
			case 4:
				EnterOuterAlt(_localctx, 4);
				{
				State = 39;
				aggregateTrigger();
				State = 40;
				Match(WHERE);
				State = 41;
				preExpression();
				State = 42;
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class AggregateTriggerContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode QUERY() { return GetToken(TriggersParser.QUERY, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public AggregateListContext aggregateList() {
			return GetRuleContext<AggregateListContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode FROM() { return GetToken(TriggersParser.FROM, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode DATA() { return GetToken(TriggersParser.DATA, 0); }
		public AggregateTriggerContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_aggregateTrigger; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterAggregateTrigger(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitAggregateTrigger(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitAggregateTrigger(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public AggregateTriggerContext aggregateTrigger() {
		AggregateTriggerContext _localctx = new AggregateTriggerContext(Context, State);
		EnterRule(_localctx, 4, RULE_aggregateTrigger);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 46;
			Match(QUERY);
			State = 47;
			aggregateList();
			State = 48;
			Match(FROM);
			State = 49;
			Match(DATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class AggregateListContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public AggregateContext[] aggregate() {
			return GetRuleContexts<AggregateContext>();
		}
		[System.Diagnostics.DebuggerNonUserCode] public AggregateContext aggregate(int i) {
			return GetRuleContext<AggregateContext>(i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode[] COMMA() { return GetTokens(TriggersParser.COMMA); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode COMMA(int i) {
			return GetToken(TriggersParser.COMMA, i);
		}
		public AggregateListContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_aggregateList; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterAggregateList(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitAggregateList(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitAggregateList(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public AggregateListContext aggregateList() {
		AggregateListContext _localctx = new AggregateListContext(Context, State);
		EnterRule(_localctx, 6, RULE_aggregateList);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 51;
			aggregate();
			State = 56;
			ErrorHandler.Sync(this);
			_la = TokenStream.LA(1);
			while (_la==COMMA) {
				{
				{
				State = 52;
				Match(COMMA);
				State = 53;
				aggregate();
				}
				}
				State = 58;
				ErrorHandler.Sync(this);
				_la = TokenStream.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class AggregateContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public AggregateFunctionContext aggregateFunction() {
			return GetRuleContext<AggregateFunctionContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode LPAREN() { return GetToken(TriggersParser.LPAREN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode RPAREN() { return GetToken(TriggersParser.RPAREN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode STAR() { return GetToken(TriggersParser.STAR, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_aggregate; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterAggregate(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitAggregate(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitAggregate(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public AggregateContext aggregate() {
		AggregateContext _localctx = new AggregateContext(Context, State);
		EnterRule(_localctx, 8, RULE_aggregate);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 59;
			aggregateFunction();
			State = 60;
			Match(LPAREN);
			{
			State = 61;
			Match(STAR);
			}
			State = 62;
			Match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class AggregateFunctionContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode COUNT() { return GetToken(TriggersParser.COUNT, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_aggregateFunction; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterAggregateFunction(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitAggregateFunction(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitAggregateFunction(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public AggregateFunctionContext aggregateFunction() {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(Context, State);
		EnterRule(_localctx, 10, RULE_aggregateFunction);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 64;
			Match(COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class PreExpressionContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode ACCOUNT() { return GetToken(TriggersParser.ACCOUNT, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode IS() { return GetToken(TriggersParser.IS, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public SourceDestSpecifierContext sourceDestSpecifier() {
			return GetRuleContext<SourceDestSpecifierContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode AND() { return GetToken(TriggersParser.AND, 0); }
		public PreExpressionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_preExpression; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterPreExpression(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitPreExpression(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitPreExpression(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public PreExpressionContext preExpression() {
		PreExpressionContext _localctx = new PreExpressionContext(Context, State);
		EnterRule(_localctx, 12, RULE_preExpression);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 66;
			Match(ACCOUNT);
			State = 67;
			Match(IS);
			State = 68;
			sourceDestSpecifier();
			State = 69;
			Match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class SourceDestSpecifierContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode SOURCE_TOKEN() { return GetToken(TriggersParser.SOURCE_TOKEN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode DEST_TOKEN() { return GetToken(TriggersParser.DEST_TOKEN, 0); }
		public SourceDestSpecifierContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_sourceDestSpecifier; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterSourceDestSpecifier(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitSourceDestSpecifier(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitSourceDestSpecifier(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public SourceDestSpecifierContext sourceDestSpecifier() {
		SourceDestSpecifierContext _localctx = new SourceDestSpecifierContext(Context, State);
		EnterRule(_localctx, 14, RULE_sourceDestSpecifier);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 71;
			_la = TokenStream.LA(1);
			if ( !(_la==SOURCE_TOKEN || _la==DEST_TOKEN) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ExpressionContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public TermContext[] term() {
			return GetRuleContexts<TermContext>();
		}
		[System.Diagnostics.DebuggerNonUserCode] public TermContext term(int i) {
			return GetRuleContext<TermContext>(i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public LogicalOperatorContext[] logicalOperator() {
			return GetRuleContexts<LogicalOperatorContext>();
		}
		[System.Diagnostics.DebuggerNonUserCode] public LogicalOperatorContext logicalOperator(int i) {
			return GetRuleContext<LogicalOperatorContext>(i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_expression; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterExpression(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitExpression(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitExpression(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public ExpressionContext expression() {
		ExpressionContext _localctx = new ExpressionContext(Context, State);
		EnterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 73;
			term();
			State = 79;
			ErrorHandler.Sync(this);
			_la = TokenStream.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				State = 74;
				logicalOperator();
				State = 75;
				term();
				}
				}
				State = 81;
				ErrorHandler.Sync(this);
				_la = TokenStream.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class TermContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode LPAREN() { return GetToken(TriggersParser.LPAREN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode RPAREN() { return GetToken(TriggersParser.RPAREN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public FieldContext field() {
			return GetRuleContext<FieldContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public OperatorContext @operator() {
			return GetRuleContext<OperatorContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public TermContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_term; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterTerm(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitTerm(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitTerm(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public TermContext term() {
		TermContext _localctx = new TermContext(Context, State);
		EnterRule(_localctx, 18, RULE_term);
		try {
			State = 90;
			ErrorHandler.Sync(this);
			switch (TokenStream.LA(1)) {
			case LPAREN:
				EnterOuterAlt(_localctx, 1);
				{
				State = 82;
				Match(LPAREN);
				State = 83;
				expression();
				State = 84;
				Match(RPAREN);
				}
				break;
			case IDENTIFIER:
				EnterOuterAlt(_localctx, 2);
				{
				State = 86;
				field();
				State = 87;
				@operator();
				State = 88;
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class FieldContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode IDENTIFIER() { return GetToken(TriggersParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_field; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterField(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitField(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitField(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public FieldContext field() {
		FieldContext _localctx = new FieldContext(Context, State);
		EnterRule(_localctx, 20, RULE_field);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 92;
			Match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class OperatorContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode EQ() { return GetToken(TriggersParser.EQ, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode NE() { return GetToken(TriggersParser.NE, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode GT() { return GetToken(TriggersParser.GT, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode LT() { return GetToken(TriggersParser.LT, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode GE() { return GetToken(TriggersParser.GE, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode LE() { return GetToken(TriggersParser.LE, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode IN() { return GetToken(TriggersParser.IN, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode NOT_IN() { return GetToken(TriggersParser.NOT_IN, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_operator; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterOperator(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitOperator(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitOperator(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public OperatorContext @operator() {
		OperatorContext _localctx = new OperatorContext(Context, State);
		EnterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 94;
			_la = TokenStream.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1566720L) != 0)) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ValueContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode VALUEIDENTIFIER() { return GetToken(TriggersParser.VALUEIDENTIFIER, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode DATE() { return GetToken(TriggersParser.DATE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_value; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterValue(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitValue(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitValue(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public ValueContext value() {
		ValueContext _localctx = new ValueContext(Context, State);
		EnterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 96;
			_la = TokenStream.LA(1);
			if ( !(_la==VALUEIDENTIFIER || _la==DATE) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class LogicalOperatorContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode AND() { return GetToken(TriggersParser.AND, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode OR() { return GetToken(TriggersParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_logicalOperator; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.EnterLogicalOperator(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			ITriggersListener typedListener = listener as ITriggersListener;
			if (typedListener != null) typedListener.ExitLogicalOperator(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ITriggersVisitor<TResult> typedVisitor = visitor as ITriggersVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitLogicalOperator(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public LogicalOperatorContext logicalOperator() {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(Context, State);
		EnterRule(_localctx, 26, RULE_logicalOperator);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 98;
			_la = TokenStream.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	private static int[] _serializedATN = {
		4,1,29,101,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,
		7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,1,0,1,0,1,
		0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,45,8,1,1,2,1,
		2,1,2,1,2,1,2,1,3,1,3,1,3,5,3,55,8,3,10,3,12,3,58,9,3,1,4,1,4,1,4,1,4,
		1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,5,8,78,8,8,10,
		8,12,8,81,9,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,3,9,91,8,9,1,10,1,10,1,11,
		1,11,1,12,1,12,1,13,1,13,1,13,0,0,14,0,2,4,6,8,10,12,14,16,18,20,22,24,
		26,0,4,1,0,1,2,3,0,11,11,13,18,20,20,1,0,26,27,2,0,21,21,23,23,92,0,28,
		1,0,0,0,2,44,1,0,0,0,4,46,1,0,0,0,6,51,1,0,0,0,8,59,1,0,0,0,10,64,1,0,
		0,0,12,66,1,0,0,0,14,71,1,0,0,0,16,73,1,0,0,0,18,90,1,0,0,0,20,92,1,0,
		0,0,22,94,1,0,0,0,24,96,1,0,0,0,26,98,1,0,0,0,28,29,3,2,1,0,29,30,5,0,
		0,1,30,1,1,0,0,0,31,45,3,16,8,0,32,33,3,12,6,0,33,34,3,16,8,0,34,45,1,
		0,0,0,35,36,3,4,2,0,36,37,5,10,0,0,37,38,3,16,8,0,38,45,1,0,0,0,39,40,
		3,4,2,0,40,41,5,10,0,0,41,42,3,12,6,0,42,43,3,16,8,0,43,45,1,0,0,0,44,
		31,1,0,0,0,44,32,1,0,0,0,44,35,1,0,0,0,44,39,1,0,0,0,45,3,1,0,0,0,46,47,
		5,3,0,0,47,48,3,6,3,0,48,49,5,5,0,0,49,50,5,6,0,0,50,5,1,0,0,0,51,56,3,
		8,4,0,52,53,5,12,0,0,53,55,3,8,4,0,54,52,1,0,0,0,55,58,1,0,0,0,56,54,1,
		0,0,0,56,57,1,0,0,0,57,7,1,0,0,0,58,56,1,0,0,0,59,60,3,10,5,0,60,61,5,
		4,0,0,61,62,5,7,0,0,62,63,5,9,0,0,63,9,1,0,0,0,64,65,5,8,0,0,65,11,1,0,
		0,0,66,67,5,24,0,0,67,68,5,19,0,0,68,69,3,14,7,0,69,70,5,21,0,0,70,13,
		1,0,0,0,71,72,7,0,0,0,72,15,1,0,0,0,73,79,3,18,9,0,74,75,3,26,13,0,75,
		76,3,18,9,0,76,78,1,0,0,0,77,74,1,0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,79,
		80,1,0,0,0,80,17,1,0,0,0,81,79,1,0,0,0,82,83,5,4,0,0,83,84,3,16,8,0,84,
		85,5,9,0,0,85,91,1,0,0,0,86,87,3,20,10,0,87,88,3,22,11,0,88,89,3,24,12,
		0,89,91,1,0,0,0,90,82,1,0,0,0,90,86,1,0,0,0,91,19,1,0,0,0,92,93,5,25,0,
		0,93,21,1,0,0,0,94,95,7,1,0,0,95,23,1,0,0,0,96,97,7,2,0,0,97,25,1,0,0,
		0,98,99,7,3,0,0,99,27,1,0,0,0,4,44,56,79,90
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
