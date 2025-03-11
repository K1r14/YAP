// Generated from /home/stmikeal/homeworks/progLan/mr-lang/mrlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mrlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUM=15, BOOL=16, STRING=17, 
		MUL=18, SLASH=19, PLUS=20, MINUS=21, ASSIGN=22, EQUAL=23, NOT_EQUAL=24, 
		LESS=25, AND=26, OR=27, LESS_OR_EQUAL=28, GREATER=29, GREATER_OR_EQUAL=30, 
		ID=31, SPACE=32, LINE_COMMENT=33, MULTILINE_COMMENT=34;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_varDecl = 3, RULE_rawVarDecl = 4, 
		RULE_filledVarDecl = 5, RULE_typeName = 6, RULE_assignment = 7, RULE_rawAssigment = 8, 
		RULE_idName = 9, RULE_numParsed = 10, RULE_stringParsed = 11, RULE_boolParsed = 12, 
		RULE_aritOperator = 13, RULE_compOperator = 14, RULE_print = 15, RULE_blockstmt = 16, 
		RULE_ifstmt = 17, RULE_elifstmt = 18, RULE_elsestmt = 19, RULE_whilestmt = 20, 
		RULE_forstmt = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "varDecl", "rawVarDecl", "filledVarDecl", 
			"typeName", "assignment", "rawAssigment", "idName", "numParsed", "stringParsed", 
			"boolParsed", "aritOperator", "compOperator", "print", "blockstmt", "ifstmt", 
			"elifstmt", "elsestmt", "whilestmt", "forstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "'int'", "'str'", "'bool'", 
			"'print'", "'begin'", "'end'", "'if'", "'elseif'", 
			"'else'", "'while'", "'for'", null, null, null, "'*'", "'/'", 
			"'+'", "'-'", "'='", "'=='", "'!='", "'<'", "'&&'", "'||'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUM", "BOOL", "STRING", "MUL", "SLASH", "PLUS", "MINUS", 
			"ASSIGN", "EQUAL", "NOT_EQUAL", "LESS", "AND", "OR", "LESS_OR_EQUAL", 
			"GREATER", "GREATER_OR_EQUAL", "ID", "SPACE", "LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "mrlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mrlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mrlangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147509744L) != 0)) {
				{
				{
				setState(44);
				stmt();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				varDecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assignment();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				print();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				ifstmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				blockstmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				whilestmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				forstmt();
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
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(mrlangParser.MINUS, 0); }
		public NumParsedContext numParsed() {
			return getRuleContext(NumParsedContext.class,0);
		}
		public BoolParsedContext boolParsed() {
			return getRuleContext(BoolParsedContext.class,0);
		}
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public StringParsedContext stringParsed() {
			return getRuleContext(StringParsedContext.class,0);
		}
		public AritOperatorContext aritOperator() {
			return getRuleContext(AritOperatorContext.class,0);
		}
		public CompOperatorContext compOperator() {
			return getRuleContext(CompOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				setState(64);
				match(T__1);
				}
				break;
			case MINUS:
				{
				setState(66);
				match(MINUS);
				setState(67);
				numParsed();
				}
				break;
			case BOOL:
				{
				setState(68);
				boolParsed();
				}
				break;
			case ID:
				{
				setState(69);
				idName();
				}
				break;
			case NUM:
				{
				setState(70);
				numParsed();
				}
				break;
			case STRING:
				{
				setState(71);
				stringParsed();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						aritOperator();
						setState(76);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(79);
						compOperator();
						setState(80);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public RawVarDeclContext rawVarDecl() {
			return getRuleContext(RawVarDeclContext.class,0);
		}
		public FilledVarDeclContext filledVarDecl() {
			return getRuleContext(FilledVarDeclContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				rawVarDecl();
				}
				break;
			case 2:
				{
				setState(88);
				filledVarDecl();
				}
				break;
			}
			setState(91);
			match(T__2);
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
	public static class RawVarDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public RawVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawVarDecl; }
	}

	public final RawVarDeclContext rawVarDecl() throws RecognitionException {
		RawVarDeclContext _localctx = new RawVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rawVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			typeName();
			setState(94);
			idName();
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
	public static class FilledVarDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(mrlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FilledVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filledVarDecl; }
	}

	public final FilledVarDeclContext filledVarDecl() throws RecognitionException {
		FilledVarDeclContext _localctx = new FilledVarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filledVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			typeName();
			setState(97);
			idName();
			setState(98);
			match(ASSIGN);
			setState(99);
			expr(0);
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
	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AssignmentContext extends ParserRuleContext {
		public RawAssigmentContext rawAssigment() {
			return getRuleContext(RawAssigmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			rawAssigment();
			setState(104);
			match(T__2);
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
	public static class RawAssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mrlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RawAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawAssigment; }
	}

	public final RawAssigmentContext rawAssigment() throws RecognitionException {
		RawAssigmentContext _localctx = new RawAssigmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rawAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(ASSIGN);
			setState(108);
			expr(0);
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
	public static class IdNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public IdNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idName; }
	}

	public final IdNameContext idName() throws RecognitionException {
		IdNameContext _localctx = new IdNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumParsedContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(mrlangParser.NUM, 0); }
		public NumParsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numParsed; }
	}

	public final NumParsedContext numParsed() throws RecognitionException {
		NumParsedContext _localctx = new NumParsedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numParsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NUM);
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
	public static class StringParsedContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(mrlangParser.STRING, 0); }
		public StringParsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringParsed; }
	}

	public final StringParsedContext stringParsed() throws RecognitionException {
		StringParsedContext _localctx = new StringParsedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringParsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRING);
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
	public static class BoolParsedContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(mrlangParser.BOOL, 0); }
		public BoolParsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolParsed; }
	}

	public final BoolParsedContext boolParsed() throws RecognitionException {
		BoolParsedContext _localctx = new BoolParsedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolParsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(BOOL);
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
	public static class AritOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(mrlangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(mrlangParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(mrlangParser.MUL, 0); }
		public TerminalNode SLASH() { return getToken(mrlangParser.SLASH, 0); }
		public AritOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritOperator; }
	}

	public final AritOperatorContext aritOperator() throws RecognitionException {
		AritOperatorContext _localctx = new AritOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aritOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CompOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(mrlangParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(mrlangParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(mrlangParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(mrlangParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(mrlangParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(mrlangParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode AND() { return getToken(mrlangParser.AND, 0); }
		public TerminalNode OR() { return getToken(mrlangParser.OR, 0); }
		public CompOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperator; }
	}

	public final CompOperatorContext compOperator() throws RecognitionException {
		CompOperatorContext _localctx = new CompOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2139095040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
			match(T__0);
			setState(124);
			expr(0);
			setState(125);
			match(T__1);
			setState(126);
			match(T__2);
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
	public static class BlockstmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__7);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147509744L) != 0)) {
				{
				{
				setState(129);
				stmt();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__8);
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
	public static class IfstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ElifstmtContext> elifstmt() {
			return getRuleContexts(ElifstmtContext.class);
		}
		public ElifstmtContext elifstmt(int i) {
			return getRuleContext(ElifstmtContext.class,i);
		}
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__9);
			setState(138);
			match(T__0);
			setState(139);
			expr(0);
			setState(140);
			match(T__1);
			setState(141);
			stmt();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					elifstmt();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(148);
				elsestmt();
				}
				break;
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
	public static class ElifstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstmt; }
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__10);
			setState(152);
			match(T__0);
			setState(153);
			expr(0);
			setState(154);
			match(T__1);
			setState(155);
			stmt();
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
	public static class ElsestmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(158);
			stmt();
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
	public static class WhilestmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__12);
			setState(161);
			match(T__0);
			setState(162);
			expr(0);
			setState(163);
			match(T__1);
			setState(164);
			stmt();
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
	public static class ForstmtContext extends ParserRuleContext {
		public FilledVarDeclContext filledVarDecl() {
			return getRuleContext(FilledVarDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RawAssigmentContext rawAssigment() {
			return getRuleContext(RawAssigmentContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__13);
			setState(167);
			match(T__0);
			setState(168);
			filledVarDecl();
			setState(169);
			match(T__2);
			setState(170);
			expr(0);
			setState(171);
			match(T__2);
			setState(172);
			rawAssigment();
			setState(173);
			match(T__1);
			setState(174);
			stmt();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0083\b\u0010\n\u0010\f\u0010\u0086"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0090\b\u0011\n\u0011\f\u0011"+
		"\u0093\t\u0011\u0001\u0011\u0003\u0011\u0096\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0000\u0001\u0004\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0003\u0001\u0000"+
		"\u0004\u0006\u0001\u0000\u0012\u0015\u0001\u0000\u0017\u001e\u00ac\u0000"+
		"/\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004H\u0001"+
		"\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000"+
		"\u0000\u0014p\u0001\u0000\u0000\u0000\u0016r\u0001\u0000\u0000\u0000\u0018"+
		"t\u0001\u0000\u0000\u0000\u001av\u0001\u0000\u0000\u0000\u001cx\u0001"+
		"\u0000\u0000\u0000\u001ez\u0001\u0000\u0000\u0000 \u0080\u0001\u0000\u0000"+
		"\u0000\"\u0089\u0001\u0000\u0000\u0000$\u0097\u0001\u0000\u0000\u0000"+
		"&\u009d\u0001\u0000\u0000\u0000(\u00a0\u0001\u0000\u0000\u0000*\u00a6"+
		"\u0001\u0000\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		"\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u00004<\u0003\u0006\u0003"+
		"\u00005<\u0003\u000e\u0007\u00006<\u0003\u001e\u000f\u00007<\u0003\"\u0011"+
		"\u00008<\u0003 \u0010\u00009<\u0003(\u0014\u0000:<\u0003*\u0015\u0000"+
		";4\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000"+
		"\u0000;7\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000"+
		"=>\u0006\u0002\uffff\uffff\u0000>?\u0005\u0001\u0000\u0000?@\u0003\u0004"+
		"\u0002\u0000@A\u0005\u0002\u0000\u0000AI\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0015\u0000\u0000CI\u0003\u0014\n\u0000DI\u0003\u0018\f\u0000EI\u0003"+
		"\u0012\t\u0000FI\u0003\u0014\n\u0000GI\u0003\u0016\u000b\u0000H=\u0001"+
		"\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000"+
		"HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000IT\u0001\u0000\u0000\u0000JK\n\u0007\u0000\u0000KL\u0003\u001a\r"+
		"\u0000LM\u0003\u0004\u0002\bMS\u0001\u0000\u0000\u0000NO\n\u0006\u0000"+
		"\u0000OP\u0003\u001c\u000e\u0000PQ\u0003\u0004\u0002\u0007QS\u0001\u0000"+
		"\u0000\u0000RJ\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000SV\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WZ\u0003\b\u0004"+
		"\u0000XZ\u0003\n\u0005\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000\\\u0007\u0001"+
		"\u0000\u0000\u0000]^\u0003\f\u0006\u0000^_\u0003\u0012\t\u0000_\t\u0001"+
		"\u0000\u0000\u0000`a\u0003\f\u0006\u0000ab\u0003\u0012\t\u0000bc\u0005"+
		"\u0016\u0000\u0000cd\u0003\u0004\u0002\u0000d\u000b\u0001\u0000\u0000"+
		"\u0000ef\u0007\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0003\u0010"+
		"\b\u0000hi\u0005\u0003\u0000\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005"+
		"\u001f\u0000\u0000kl\u0005\u0016\u0000\u0000lm\u0003\u0004\u0002\u0000"+
		"m\u0011\u0001\u0000\u0000\u0000no\u0005\u001f\u0000\u0000o\u0013\u0001"+
		"\u0000\u0000\u0000pq\u0005\u000f\u0000\u0000q\u0015\u0001\u0000\u0000"+
		"\u0000rs\u0005\u0011\u0000\u0000s\u0017\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0010\u0000\u0000u\u0019\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000"+
		"\u0000w\u001b\u0001\u0000\u0000\u0000xy\u0007\u0002\u0000\u0000y\u001d"+
		"\u0001\u0000\u0000\u0000z{\u0005\u0007\u0000\u0000{|\u0005\u0001\u0000"+
		"\u0000|}\u0003\u0004\u0002\u0000}~\u0005\u0002\u0000\u0000~\u007f\u0005"+
		"\u0003\u0000\u0000\u007f\u001f\u0001\u0000\u0000\u0000\u0080\u0084\u0005"+
		"\b\u0000\u0000\u0081\u0083\u0003\u0002\u0001\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\t\u0000"+
		"\u0000\u0088!\u0001\u0000\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000"+
		"\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c\u0003\u0004\u0002\u0000"+
		"\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u0091\u0003\u0002\u0001\u0000"+
		"\u008e\u0090\u0003$\u0012\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0096\u0003&\u0013\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096#\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u000b\u0000\u0000\u0098\u0099\u0005"+
		"\u0001\u0000\u0000\u0099\u009a\u0003\u0004\u0002\u0000\u009a\u009b\u0005"+
		"\u0002\u0000\u0000\u009b\u009c\u0003\u0002\u0001\u0000\u009c%\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\f\u0000\u0000\u009e\u009f\u0003\u0002\u0001"+
		"\u0000\u009f\'\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\r\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a3\u0003\u0004\u0002\u0000"+
		"\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5\u0003\u0002\u0001\u0000"+
		"\u00a5)\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0001\u0000\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9\u00aa"+
		"\u0005\u0003\u0000\u0000\u00aa\u00ab\u0003\u0004\u0002\u0000\u00ab\u00ac"+
		"\u0005\u0003\u0000\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae\u0005"+
		"\u0002\u0000\u0000\u00ae\u00af\u0003\u0002\u0001\u0000\u00af+\u0001\u0000"+
		"\u0000\u0000\t/;HRTY\u0084\u0091\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}