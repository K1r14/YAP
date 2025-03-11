// Generated from /home/stmikeal/homeworks/progLan/mr-lang/mr-lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MinilangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUM=12, ASTERISK=13, SLASH=14, PLUS=15, MINUS=16, ASSIGN=17, 
		EQUAL=18, NOT_EQUAL=19, LESS=20, LESS_OR_EQUAL=21, GREATER=22, GREATER_OR_EQUAL=23, 
		SPACE=24, LINE_COMMENT=25, MULTILINE_COMMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "NUM", "ASTERISK", "SLASH", "PLUS", "MINUS", "ASSIGN", 
			"EQUAL", "NOT_EQUAL", "LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", 
			"SPACE", "LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'var'", "';'", "'print'", "'{'", "'}'", "'if'", 
			"'else'", "'while'", null, null, "'*'", "'/'", "'+'", "'-'", "'='", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM", "ASTERISK", "SLASH", "PLUS", "MINUS", "ASSIGN", "EQUAL", "NOT_EQUAL", 
			"LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", "SPACE", "LINE_COMMENT", 
			"MULTILINE_COMMENT"
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


	public MinilangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mr-lang.g4"; }

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
		"\u0004\u0000\u001a\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\nZ\b\n\n\n\f\n]\t\n\u0001\u000b\u0004\u000b`\b\u000b\u000b\u000b\f\u000b"+
		"a\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0004\u0017\u007f\b\u0017\u000b\u0017\f\u0017"+
		"\u0080\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0089\b\u0018\n\u0018\f\u0018\u008c\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0094\b\u0019\n\u0019\f\u0019\u0097\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0001\u0000\r\r\u00a1\u0000\u0001"+
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
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0001"+
		"5\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001"+
		"\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000f"+
		"I\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013Q\u0001"+
		"\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000"+
		"\u0000\u0019c\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001d"+
		"g\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000!k\u0001\u0000"+
		"\u0000\u0000#m\u0001\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000\'s\u0001"+
		"\u0000\u0000\u0000)u\u0001\u0000\u0000\u0000+x\u0001\u0000\u0000\u0000"+
		"-z\u0001\u0000\u0000\u0000/~\u0001\u0000\u0000\u00001\u0084\u0001\u0000"+
		"\u0000\u00003\u008f\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\u0002"+
		"\u0001\u0000\u0000\u000078\u0005)\u0000\u00008\u0004\u0001\u0000\u0000"+
		"\u00009:\u0005v\u0000\u0000:;\u0005a\u0000\u0000;<\u0005r\u0000\u0000"+
		"<\u0006\u0001\u0000\u0000\u0000=>\u0005;\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005p\u0000\u0000@A\u0005r\u0000\u0000AB\u0005i\u0000\u0000"+
		"BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000D\n\u0001\u0000\u0000\u0000"+
		"EF\u0005{\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005}\u0000\u0000"+
		"H\u000e\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005f\u0000\u0000"+
		"K\u0010\u0001\u0000\u0000\u0000LM\u0005e\u0000\u0000MN\u0005l\u0000\u0000"+
		"NO\u0005s\u0000\u0000OP\u0005e\u0000\u0000P\u0012\u0001\u0000\u0000\u0000"+
		"QR\u0005w\u0000\u0000RS\u0005h\u0000\u0000ST\u0005i\u0000\u0000TU\u0005"+
		"l\u0000\u0000UV\u0005e\u0000\u0000V\u0014\u0001\u0000\u0000\u0000W[\u0007"+
		"\u0000\u0000\u0000XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\u0016\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0007"+
		"\u0002\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0018\u0001\u0000"+
		"\u0000\u0000cd\u0005*\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0005"+
		"/\u0000\u0000f\u001c\u0001\u0000\u0000\u0000gh\u0005+\u0000\u0000h\u001e"+
		"\u0001\u0000\u0000\u0000ij\u0005-\u0000\u0000j \u0001\u0000\u0000\u0000"+
		"kl\u0005=\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0005=\u0000\u0000"+
		"no\u0005=\u0000\u0000o$\u0001\u0000\u0000\u0000pq\u0005!\u0000\u0000q"+
		"r\u0005=\u0000\u0000r&\u0001\u0000\u0000\u0000st\u0005<\u0000\u0000t("+
		"\u0001\u0000\u0000\u0000uv\u0005<\u0000\u0000vw\u0005=\u0000\u0000w*\u0001"+
		"\u0000\u0000\u0000xy\u0005>\u0000\u0000y,\u0001\u0000\u0000\u0000z{\u0005"+
		">\u0000\u0000{|\u0005=\u0000\u0000|.\u0001\u0000\u0000\u0000}\u007f\u0007"+
		"\u0003\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0017\u0000\u0000"+
		"\u00830\u0001\u0000\u0000\u0000\u0084\u0085\u0005/\u0000\u0000\u0085\u0086"+
		"\u0005/\u0000\u0000\u0086\u008a\u0001\u0000\u0000\u0000\u0087\u0089\b"+
		"\u0004\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0006\u0018\u0000\u0000\u008e2\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005/\u0000\u0000\u0090\u0091\u0005*\u0000\u0000"+
		"\u0091\u0095\u0001\u0000\u0000\u0000\u0092\u0094\b\u0005\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005*\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0006\u0019\u0000\u0000\u009c4\u0001\u0000"+
		"\u0000\u0000\u0006\u0000[a\u0080\u008a\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}