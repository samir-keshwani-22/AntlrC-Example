// Generated from d:/AntlrC#Example/DiscountExample/Grammar/tQueryGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tQueryGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OFFSET=2, QUERY=3, COUNT=4, SUM=5, STAR=6, AMOUNT=7, LPAREN=8, 
		RPAREN=9, WHERE=10, ACCOUNT=11, SOURCE=12, DEST=13, IS=14, AND=15, FROM=16, 
		DATA=17, PAST=18, DAY=19, HOUR=20, BEFORE=21, TRANSACTION_DATE=22, INT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "OFFSET", "QUERY", "COUNT", "SUM", "STAR", "AMOUNT", "LPAREN", 
			"RPAREN", "WHERE", "ACCOUNT", "SOURCE", "DEST", "IS", "AND", "FROM", 
			"DATA", "PAST", "DAY", "HOUR", "BEFORE", "TRANSACTION_DATE", "INT", "WS"
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


	public tQueryGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tQueryGrammar.g4"; }

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
		"\u0004\u0000\u0018\u00bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u00b1\b\u0016"+
		"\u000b\u0016\f\u0016\u00b2\u0001\u0017\u0004\u0017\u00b6\b\u0017\u000b"+
		"\u0017\f\u0017\u00b7\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  \u00bc\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005"+
		"8\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\tD\u0001\u0000"+
		"\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000"+
		"\u000fS\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013W"+
		"\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017h\u0001\u0000"+
		"\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000"+
		"\u001d{\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0084"+
		"\u0001\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000%\u008e\u0001\u0000"+
		"\u0000\u0000\'\u0092\u0001\u0000\u0000\u0000)\u0097\u0001\u0000\u0000"+
		"\u0000+\u009e\u0001\u0000\u0000\u0000-\u00b0\u0001\u0000\u0000\u0000/"+
		"\u00b5\u0001\u0000\u0000\u000012\u0005,\u0000\u00002\u0002\u0001\u0000"+
		"\u0000\u000034\u0003-\u0016\u000045\u0003\'\u0013\u000056\u0003)\u0014"+
		"\u000067\u0003+\u0015\u00007\u0004\u0001\u0000\u0000\u000089\u0005Q\u0000"+
		"\u00009:\u0005U\u0000\u0000:;\u0005E\u0000\u0000;<\u0005R\u0000\u0000"+
		"<=\u0005Y\u0000\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005C\u0000\u0000"+
		"?@\u0005O\u0000\u0000@A\u0005U\u0000\u0000AB\u0005N\u0000\u0000BC\u0005"+
		"T\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005S\u0000\u0000EF\u0005"+
		"U\u0000\u0000FG\u0005M\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005"+
		"*\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005{\u0000\u0000KL\u0005"+
		"a\u0000\u0000LM\u0005m\u0000\u0000MN\u0005o\u0000\u0000NO\u0005u\u0000"+
		"\u0000OP\u0005n\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005}\u0000\u0000"+
		"R\u000e\u0001\u0000\u0000\u0000ST\u0005(\u0000\u0000T\u0010\u0001\u0000"+
		"\u0000\u0000UV\u0005)\u0000\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0005"+
		"W\u0000\u0000XY\u0005H\u0000\u0000YZ\u0005E\u0000\u0000Z[\u0005R\u0000"+
		"\u0000[\\\u0005E\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005#"+
		"\u0000\u0000^_\u0005{\u0000\u0000_`\u0005a\u0000\u0000`a\u0005c\u0000"+
		"\u0000ab\u0005c\u0000\u0000bc\u0005o\u0000\u0000cd\u0005u\u0000\u0000"+
		"de\u0005n\u0000\u0000ef\u0005t\u0000\u0000fg\u0005}\u0000\u0000g\u0016"+
		"\u0001\u0000\u0000\u0000hi\u0005{\u0000\u0000ij\u0005s\u0000\u0000jk\u0005"+
		"o\u0000\u0000kl\u0005u\u0000\u0000lm\u0005r\u0000\u0000mn\u0005c\u0000"+
		"\u0000no\u0005e\u0000\u0000op\u0005}\u0000\u0000p\u0018\u0001\u0000\u0000"+
		"\u0000qr\u0005{\u0000\u0000rs\u0005d\u0000\u0000st\u0005e\u0000\u0000"+
		"tu\u0005s\u0000\u0000uv\u0005t\u0000\u0000vw\u0005}\u0000\u0000w\u001a"+
		"\u0001\u0000\u0000\u0000xy\u0005i\u0000\u0000yz\u0005s\u0000\u0000z\u001c"+
		"\u0001\u0000\u0000\u0000{|\u0005A\u0000\u0000|}\u0005N\u0000\u0000}~\u0005"+
		"D\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f\u0080\u0005F\u0000"+
		"\u0000\u0080\u0081\u0005R\u0000\u0000\u0081\u0082\u0005O\u0000\u0000\u0082"+
		"\u0083\u0005M\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"D\u0000\u0000\u0085\u0086\u0005A\u0000\u0000\u0086\u0087\u0005T\u0000"+
		"\u0000\u0087\u0088\u0005A\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005P\u0000\u0000\u008a\u008b\u0005A\u0000\u0000\u008b\u008c"+
		"\u0005S\u0000\u0000\u008c\u008d\u0005T\u0000\u0000\u008d$\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005d\u0000\u0000\u008f\u0090\u0005a\u0000\u0000"+
		"\u0090\u0091\u0005y\u0000\u0000\u0091&\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005h\u0000\u0000\u0093\u0094\u0005o\u0000\u0000\u0094\u0095\u0005u"+
		"\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096(\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005b\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a"+
		"\u0005f\u0000\u0000\u009a\u009b\u0005o\u0000\u0000\u009b\u009c\u0005r"+
		"\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d*\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0\u00a1"+
		"\u0005a\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2\u00a3\u0005s"+
		"\u0000\u0000\u00a3\u00a4\u0005a\u0000\u0000\u00a4\u00a5\u0005c\u0000\u0000"+
		"\u00a5\u00a6\u0005t\u0000\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7\u00a8"+
		"\u0005o\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa\u0005 "+
		"\u0000\u0000\u00aa\u00ab\u0005d\u0000\u0000\u00ab\u00ac\u0005a\u0000\u0000"+
		"\u00ac\u00ad\u0005t\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae,"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0000\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3.\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0007\u0001\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0006\u0017\u0000\u0000\u00ba0\u0001\u0000"+
		"\u0000\u0000\u0003\u0000\u00b2\u00b7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}