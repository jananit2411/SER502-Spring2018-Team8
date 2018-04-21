package compiler.antlrGenerated;// Generated from D:/SER502 Project/SER502-Spring2018-Team8/Stark/doc\Stark.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StarkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BOOLVALUES=30, IDENTIFIER=31, 
		NUMBER=32, WS=33, MULTICOMMENT=34, SINGLECOMMENT=35;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_initializationStmt = 3, 
		RULE_declarationStmt = 4, RULE_assignmentStmt = 5, RULE_ifStatement = 6, 
		RULE_condition = 7, RULE_elseStmt = 8, RULE_whileStatement = 9, RULE_whileCondition = 10, 
		RULE_displayStatement = 11, RULE_relationalExpression = 12, RULE_logicalExpression = 13, 
		RULE_boolExpression = 14, RULE_expression = 15, RULE_term = 16, RULE_factor = 17, 
		RULE_functionDefn = 18, RULE_functionName = 19, RULE_parameters = 20, 
		RULE_returnStatement = 21, RULE_functionCall = 22, RULE_arguments = 23, 
		RULE_openBrace = 24, RULE_closeBrace = 25;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "initializationStmt", "declarationStmt", 
		"assignmentStmt", "ifStatement", "condition", "elseStmt", "whileStatement", 
		"whileCondition", "displayStatement", "relationalExpression", "logicalExpression", 
		"boolExpression", "expression", "term", "factor", "functionDefn", "functionName", 
		"parameters", "returnStatement", "functionCall", "arguments", "openBrace", 
		"closeBrace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'='", "'bool'", "'if'", "'('", "')'", "'{'", "'}'", 
		"'else'", "'while'", "'display'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'func'", 
		"','", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BOOLVALUES", "IDENTIFIER", "NUMBER", 
		"WS", "MULTICOMMENT", "SINGLECOMMENT"
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

	@Override
	public String getGrammarFileName() { return "Stark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StarkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FunctionDefnContext functionDefn() {
			return getRuleContext(FunctionDefnContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			statementList();
			setState(53);
			functionDefn();
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				statement();
				setState(56);
				statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public InitializationStmtContext initializationStmt() {
			return getRuleContext(InitializationStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declarationStmt();
				setState(62);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				initializationStmt();
				setState(65);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				assignmentStmt();
				setState(68);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				displayStatement();
				setState(73);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				functionCall();
				setState(76);
				match(T__0);
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

	public static class InitializationStmtContext extends ParserRuleContext {
		public InitializationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationStmt; }
	 
		public InitializationStmtContext() { }
		public void copyFrom(InitializationStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitIntExpressionContext extends InitializationStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitIntExpressionContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitBoolFunctionCallContext extends InitializationStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InitBoolFunctionCallContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitBoolFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitBoolFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitBoolFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitBoolExpressionContext extends InitializationStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public InitBoolExpressionContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitIntFunctionCallContext extends InitializationStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InitIntFunctionCallContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitIntFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitIntFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitIntFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationStmtContext initializationStmt() throws RecognitionException {
		InitializationStmtContext _localctx = new InitializationStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initializationStmt);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitIntExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__1);
				setState(81);
				match(IDENTIFIER);
				setState(82);
				match(T__2);
				setState(83);
				expression();
				}
				break;
			case 2:
				_localctx = new InitBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__3);
				setState(85);
				match(IDENTIFIER);
				setState(86);
				match(T__2);
				setState(87);
				boolExpression();
				}
				break;
			case 3:
				_localctx = new InitIntFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__1);
				setState(89);
				match(IDENTIFIER);
				setState(90);
				match(T__2);
				setState(91);
				functionCall();
				}
				break;
			case 4:
				_localctx = new InitBoolFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T__3);
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(T__2);
				setState(95);
				functionCall();
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

	public static class DeclarationStmtContext extends ParserRuleContext {
		public DeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStmt; }
	 
		public DeclarationStmtContext() { }
		public void copyFrom(DeclarationStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDeclarationContext extends DeclarationStmtContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public BoolDeclarationContext(DeclarationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclarationContext extends DeclarationStmtContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public IntDeclarationContext(DeclarationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStmtContext declarationStmt() throws RecognitionException {
		DeclarationStmtContext _localctx = new DeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationStmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__1);
				setState(99);
				((IntDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case T__3:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__3);
				setState(101);
				((BoolDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public Token varName;
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStmt);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((AssignmentStmtContext)_localctx).varName = match(IDENTIFIER);
				setState(105);
				match(T__2);
				setState(106);
				boolExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((AssignmentStmtContext)_localctx).varName = match(IDENTIFIER);
				setState(108);
				match(T__2);
				setState(109);
				expression();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public IfStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CloseBraceContext closeBrace() {
			return getRuleContext(CloseBraceContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__4);
				setState(113);
				match(T__5);
				setState(114);
				condition();
				setState(115);
				match(T__6);
				setState(116);
				match(T__7);
				setState(117);
				statementList();
				setState(118);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__4);
				setState(121);
				match(T__5);
				setState(122);
				condition();
				setState(123);
				match(T__6);
				setState(124);
				openBrace();
				setState(125);
				statementList();
				setState(126);
				closeBrace();
				setState(127);
				elseStmt();
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

	public static class ConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			boolExpression();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
			setState(134);
			match(T__7);
			setState(135);
			statementList();
			setState(136);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__10);
			setState(139);
			match(T__5);
			setState(140);
			whileCondition();
			setState(141);
			match(T__6);
			setState(142);
			match(T__7);
			setState(143);
			statementList();
			setState(144);
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

	public static class WhileConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			boolExpression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
	 
		public DisplayStatementContext() { }
		public void copyFrom(DisplayStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DispExprContext extends DisplayStatementContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DispExprContext(DisplayStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDispExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDispExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDispExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispFuncContext extends DisplayStatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DispFuncContext(DisplayStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDispFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDispFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDispFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_displayStatement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DispExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__11);
				setState(149);
				((DispExprContext)_localctx).argument = expression();
				}
				break;
			case 2:
				_localctx = new DispFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__11);
				setState(151);
				functionCall();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNotEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNotEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterGreaterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitGreaterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitGreaterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsBooValueContext extends RelationalExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public EqualsBooValueContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterEqualsBooValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitEqualsBooValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitEqualsBooValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsValueContext extends RelationalExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public NotEqualsValueContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNotEqualsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNotEqualsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNotEqualsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterGreaterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitGreaterEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitGreaterEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLessEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLessEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLessEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationalExpression);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new EqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expression();
				setState(155);
				match(T__12);
				setState(156);
				expression();
				}
				break;
			case 2:
				_localctx = new NotEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				expression();
				setState(159);
				match(T__13);
				setState(160);
				expression();
				}
				break;
			case 3:
				_localctx = new LessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				expression();
				setState(163);
				match(T__14);
				setState(164);
				expression();
				}
				break;
			case 4:
				_localctx = new LessEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				expression();
				setState(167);
				match(T__15);
				setState(168);
				expression();
				}
				break;
			case 5:
				_localctx = new GreaterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				expression();
				setState(171);
				match(T__16);
				setState(172);
				expression();
				}
				break;
			case 6:
				_localctx = new GreaterEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				expression();
				setState(175);
				match(T__17);
				setState(176);
				expression();
				}
				break;
			case 7:
				_localctx = new EqualsBooValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				expression();
				setState(179);
				match(T__12);
				setState(180);
				match(BOOLVALUES);
				}
				break;
			case 8:
				_localctx = new NotEqualsValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				expression();
				setState(183);
				match(T__13);
				setState(184);
				match(BOOLVALUES);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalNotContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends LogicalExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalOrContext extends LogicalExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public RelationalOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalAndContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalAndContext extends LogicalExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public RelationalAndContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalExpression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new RelationalAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				relationalExpression();
				setState(189);
				match(T__18);
				setState(190);
				relationalExpression();
				}
				break;
			case 2:
				_localctx = new RelationalOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				relationalExpression();
				setState(193);
				match(T__19);
				setState(194);
				relationalExpression();
				}
				break;
			case 3:
				_localctx = new LogicalAndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				relationalExpression();
				setState(197);
				match(T__18);
				setState(198);
				logicalExpression();
				}
				break;
			case 4:
				_localctx = new LogicalOrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				relationalExpression();
				setState(201);
				match(T__19);
				setState(202);
				logicalExpression();
				}
				break;
			case 5:
				_localctx = new RelationalNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(T__20);
				setState(205);
				relationalExpression();
				}
				break;
			case 6:
				_localctx = new LogicalNotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				match(T__20);
				setState(207);
				logicalExpression();
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalStmtContext extends BoolExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalStmtContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends BoolExpressionContext {
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public BoolValueContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalStmtContext extends BoolExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalStmtContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolExpression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new RelationalStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				relationalExpression();
				}
				break;
			case 2:
				_localctx = new LogicalStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				logicalExpression();
				}
				break;
			case 3:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(BOOLVALUES);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrmContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TrmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterTrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitTrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitTrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				term();
				setState(216);
				match(T__21);
				setState(217);
				expression();
				}
				break;
			case 2:
				_localctx = new SubExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				term();
				setState(220);
				match(T__22);
				setState(221);
				expression();
				}
				break;
			case 3:
				_localctx = new TrmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ModExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DivExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpresisonContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulExpresisonContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterMulExpresison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitMulExpresison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitMulExpresison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new MulExpresisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				factor();
				setState(227);
				match(T__23);
				setState(228);
				term();
				}
				break;
			case 2:
				_localctx = new DivExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				factor();
				setState(231);
				match(T__24);
				setState(232);
				term();
				}
				break;
			case 3:
				_localctx = new ModExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				factor();
				setState(235);
				match(T__25);
				setState(236);
				term();
				}
				break;
			case 4:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends FactorContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends FactorContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public IdentifierContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BraceExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBraceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBraceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBraceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new BraceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__5);
				setState(242);
				expression();
				setState(243);
				match(T__6);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				((IdentifierContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				((NumberContext)_localctx).num = match(NUMBER);
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

	public static class FunctionDefnContext extends ParserRuleContext {
		public FunctionDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefn; }
	 
		public FunctionDefnContext() { }
		public void copyFrom(FunctionDefnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncWithStmtsContext extends FunctionDefnContext {
		public FunctionNameContext name;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FuncWithStmtsContext(FunctionDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFuncWithStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFuncWithStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFuncWithStmts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncWithoutStmtsContext extends FunctionDefnContext {
		public FunctionNameContext name;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FuncWithoutStmtsContext(FunctionDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFuncWithoutStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFuncWithoutStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFuncWithoutStmts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoFuncContext extends FunctionDefnContext {
		public NoFuncContext(FunctionDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefnContext functionDefn() throws RecognitionException {
		FunctionDefnContext _localctx = new FunctionDefnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDefn);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FuncWithStmtsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__26);
				setState(250);
				((FuncWithStmtsContext)_localctx).name = functionName();
				setState(251);
				match(T__5);
				setState(252);
				parameters();
				setState(253);
				match(T__6);
				setState(254);
				match(T__7);
				setState(255);
				statementList();
				setState(256);
				returnStatement();
				setState(257);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new FuncWithoutStmtsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__26);
				setState(260);
				((FuncWithoutStmtsContext)_localctx).name = functionName();
				setState(261);
				match(T__5);
				setState(262);
				parameters();
				setState(263);
				match(T__6);
				setState(264);
				match(T__7);
				setState(265);
				returnStatement();
				setState(266);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new NoFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FunctionNameContext extends ParserRuleContext {
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	 
		public FunctionNameContext() { }
		public void copyFrom(FunctionNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunNameContext extends FunctionNameContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunNameContext(FunctionNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFunName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFunName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFunName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionName);
		try {
			_localctx = new FunNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IDENTIFIER);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultParamContext extends ParametersContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MultParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterMultParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitMultParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitMultParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleParamContext extends ParametersContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public SingleParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterSingleParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitSingleParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitSingleParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameters);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MultParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				declarationStmt();
				setState(274);
				match(T__27);
				setState(275);
				parameters();
				}
				break;
			case 2:
				_localctx = new SingleParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				declarationStmt();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnBoolContext extends ReturnStatementContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ReturnBoolContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterReturnBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitReturnBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitReturnBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoReturnContext extends ReturnStatementContext {
		public NoReturnContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnIntContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnIntContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterReturnInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitReturnInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitReturnInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__28);
				setState(281);
				expression();
				setState(282);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ReturnBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__28);
				setState(285);
				boolExpression();
				setState(286);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new NoReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignFunctionCallContext extends FunctionCallContext {
		public Token varname;
		public FunctionNameContext name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public AssignFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAssignFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAssignFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAssignFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoAssignFunctionCallContext extends FunctionCallContext {
		public FunctionNameContext name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public NoAssignFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoAssignFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoAssignFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoAssignFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((AssignFunctionCallContext)_localctx).varname = match(IDENTIFIER);
				setState(292);
				match(T__2);
				setState(293);
				((AssignFunctionCallContext)_localctx).name = functionName();
				setState(294);
				match(T__5);
				setState(295);
				arguments();
				setState(296);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new NoAssignFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((NoAssignFunctionCallContext)_localctx).name = functionName();
				setState(299);
				match(T__5);
				setState(300);
				arguments();
				setState(301);
				match(T__6);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgIdentifierContext extends ArgumentsContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public ArgIdentifierContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterArgIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitArgIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitArgIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyIdentifierContext extends ArgumentsContext {
		public Token name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public DummyIdentifierContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyNumberContext extends ArgumentsContext {
		public Token name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public DummyNumberContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgNumberContext extends ArgumentsContext {
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public ArgNumberContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterArgNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitArgNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitArgNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyblankContext extends ArgumentsContext {
		public DummyblankContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyblank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyblank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyblank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arguments);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DummyIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((DummyIdentifierContext)_localctx).name = match(IDENTIFIER);
				setState(306);
				match(T__27);
				setState(307);
				arguments();
				}
				break;
			case 2:
				_localctx = new DummyNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((DummyNumberContext)_localctx).name = match(NUMBER);
				setState(309);
				match(T__27);
				setState(310);
				arguments();
				}
				break;
			case 3:
				_localctx = new ArgNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ArgIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new DummyblankContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
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

	public static class OpenBraceContext extends ParserRuleContext {
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
	 
		public OpenBraceContext() { }
		public void copyFrom(OpenBraceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpenBracketContext extends OpenBraceContext {
		public OpenBracketContext(OpenBraceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_openBrace);
		try {
			_localctx = new OpenBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__7);
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

	public static class CloseBraceContext extends ParserRuleContext {
		public CloseBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBrace; }
	 
		public CloseBraceContext() { }
		public void copyFrom(CloseBraceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CloseBracketContext extends CloseBraceContext {
		public CloseBracketContext(CloseBraceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBraceContext closeBrace() throws RecognitionException {
		CloseBraceContext _localctx = new CloseBraceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_closeBrace);
		try {
			_localctx = new CloseBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5"+
		"\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bd\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\20\5\20\u00d8"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e3\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f2"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fa\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0110\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0119"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0124\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013d\n\31\3\32\3\32"+
		"\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\2\2\2\u0155\2\66\3\2\2\2\4=\3\2\2\2\6P\3\2\2\2\bb\3\2\2\2\n"+
		"h\3\2\2\2\fp\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2"+
		"\2\24\u008c\3\2\2\2\26\u0094\3\2\2\2\30\u009a\3\2\2\2\32\u00bc\3\2\2\2"+
		"\34\u00d2\3\2\2\2\36\u00d7\3\2\2\2 \u00e2\3\2\2\2\"\u00f1\3\2\2\2$\u00f9"+
		"\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2*\u0118\3\2\2\2,\u0123\3\2\2\2."+
		"\u0131\3\2\2\2\60\u013c\3\2\2\2\62\u013e\3\2\2\2\64\u0140\3\2\2\2\66\67"+
		"\5\4\3\2\678\5&\24\28\3\3\2\2\29:\5\6\4\2:;\5\4\3\2;>\3\2\2\2<>\5\6\4"+
		"\2=9\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\5\n\6\2@A\7\3\2\2AQ\3\2\2\2BC\5\b"+
		"\5\2CD\7\3\2\2DQ\3\2\2\2EF\5\f\7\2FG\7\3\2\2GQ\3\2\2\2HQ\5\16\b\2IQ\5"+
		"\24\13\2JK\5\30\r\2KL\7\3\2\2LQ\3\2\2\2MN\5.\30\2NO\7\3\2\2OQ\3\2\2\2"+
		"P?\3\2\2\2PB\3\2\2\2PE\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PM\3\2\2\2"+
		"Q\7\3\2\2\2RS\7\4\2\2ST\7!\2\2TU\7\5\2\2Uc\5 \21\2VW\7\6\2\2WX\7!\2\2"+
		"XY\7\5\2\2Yc\5\36\20\2Z[\7\4\2\2[\\\7!\2\2\\]\7\5\2\2]c\5.\30\2^_\7\6"+
		"\2\2_`\7!\2\2`a\7\5\2\2ac\5.\30\2bR\3\2\2\2bV\3\2\2\2bZ\3\2\2\2b^\3\2"+
		"\2\2c\t\3\2\2\2de\7\4\2\2ei\7!\2\2fg\7\6\2\2gi\7!\2\2hd\3\2\2\2hf\3\2"+
		"\2\2i\13\3\2\2\2jk\7!\2\2kl\7\5\2\2lq\5\36\20\2mn\7!\2\2no\7\5\2\2oq\5"+
		" \21\2pj\3\2\2\2pm\3\2\2\2q\r\3\2\2\2rs\7\7\2\2st\7\b\2\2tu\5\20\t\2u"+
		"v\7\t\2\2vw\7\n\2\2wx\5\4\3\2xy\7\13\2\2y\u0084\3\2\2\2z{\7\7\2\2{|\7"+
		"\b\2\2|}\5\20\t\2}~\7\t\2\2~\177\5\62\32\2\177\u0080\5\4\3\2\u0080\u0081"+
		"\5\64\33\2\u0081\u0082\5\22\n\2\u0082\u0084\3\2\2\2\u0083r\3\2\2\2\u0083"+
		"z\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\5\36\20\2\u0086\21\3\2\2\2\u0087"+
		"\u0088\7\f\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5\4\3\2\u008a\u008b\7\13"+
		"\2\2\u008b\23\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u008e\7\b\2\2\u008e\u008f"+
		"\5\26\f\2\u008f\u0090\7\t\2\2\u0090\u0091\7\n\2\2\u0091\u0092\5\4\3\2"+
		"\u0092\u0093\7\13\2\2\u0093\25\3\2\2\2\u0094\u0095\5\36\20\2\u0095\27"+
		"\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u009b\5 \21\2\u0098\u0099\7\16\2\2"+
		"\u0099\u009b\5.\30\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b\31"+
		"\3\2\2\2\u009c\u009d\5 \21\2\u009d\u009e\7\17\2\2\u009e\u009f\5 \21\2"+
		"\u009f\u00bd\3\2\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3"+
		"\5 \21\2\u00a3\u00bd\3\2\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7\21\2\2"+
		"\u00a6\u00a7\5 \21\2\u00a7\u00bd\3\2\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa"+
		"\7\22\2\2\u00aa\u00ab\5 \21\2\u00ab\u00bd\3\2\2\2\u00ac\u00ad\5 \21\2"+
		"\u00ad\u00ae\7\23\2\2\u00ae\u00af\5 \21\2\u00af\u00bd\3\2\2\2\u00b0\u00b1"+
		"\5 \21\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\5 \21\2\u00b3\u00bd\3\2\2\2"+
		"\u00b4\u00b5\5 \21\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\7 \2\2\u00b7\u00bd"+
		"\3\2\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\7 \2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u009c\3\2\2\2\u00bc\u00a0\3\2\2\2\u00bc\u00a4\3\2"+
		"\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc"+
		"\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\5\32\16"+
		"\2\u00bf\u00c0\7\25\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00d3\3\2\2\2\u00c2"+
		"\u00c3\5\32\16\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00d3"+
		"\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5\34\17"+
		"\2\u00c9\u00d3\3\2\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\7\26\2\2\u00cc"+
		"\u00cd\5\34\17\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d3"+
		"\5\32\16\2\u00d0\u00d1\7\27\2\2\u00d1\u00d3\5\34\17\2\u00d2\u00be\3\2"+
		"\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d8\5\32\16"+
		"\2\u00d5\u00d8\5\34\17\2\u00d6\u00d8\7 \2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00da\5\"\22"+
		"\2\u00da\u00db\7\30\2\2\u00db\u00dc\5 \21\2\u00dc\u00e3\3\2\2\2\u00dd"+
		"\u00de\5\"\22\2\u00de\u00df\7\31\2\2\u00df\u00e0\5 \21\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00e3\5\"\22\2\u00e2\u00d9\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7\32\2\2"+
		"\u00e6\u00e7\5\"\22\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9\5$\23\2\u00e9\u00ea"+
		"\7\33\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00f2\3\2\2\2\u00ec\u00ed\5$\23\2"+
		"\u00ed\u00ee\7\34\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2"+
		"\5$\23\2\u00f1\u00e4\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2#\3\2\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\5 \21\2"+
		"\u00f5\u00f6\7\t\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00fa\7!\2\2\u00f8\u00fa"+
		"\7\"\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"%\3\2\2\2\u00fb\u00fc\7\35\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\7\b\2\2"+
		"\u00fe\u00ff\5*\26\2\u00ff\u0100\7\t\2\2\u0100\u0101\7\n\2\2\u0101\u0102"+
		"\5\4\3\2\u0102\u0103\5,\27\2\u0103\u0104\7\13\2\2\u0104\u0110\3\2\2\2"+
		"\u0105\u0106\7\35\2\2\u0106\u0107\5(\25\2\u0107\u0108\7\b\2\2\u0108\u0109"+
		"\5*\26\2\u0109\u010a\7\t\2\2\u010a\u010b\7\n\2\2\u010b\u010c\5,\27\2\u010c"+
		"\u010d\7\13\2\2\u010d\u0110\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u00fb\3"+
		"\2\2\2\u010f\u0105\3\2\2\2\u010f\u010e\3\2\2\2\u0110\'\3\2\2\2\u0111\u0112"+
		"\7!\2\2\u0112)\3\2\2\2\u0113\u0114\5\n\6\2\u0114\u0115\7\36\2\2\u0115"+
		"\u0116\5*\26\2\u0116\u0119\3\2\2\2\u0117\u0119\5\n\6\2\u0118\u0113\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119+\3\2\2\2\u011a\u011b\7\37\2\2\u011b\u011c"+
		"\5 \21\2\u011c\u011d\7\3\2\2\u011d\u0124\3\2\2\2\u011e\u011f\7\37\2\2"+
		"\u011f\u0120\5\36\20\2\u0120\u0121\7\3\2\2\u0121\u0124\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"-\3\2\2\2\u0125\u0126\7!\2\2\u0126\u0127\7\5\2\2\u0127\u0128\5(\25\2\u0128"+
		"\u0129\7\b\2\2\u0129\u012a\5\60\31\2\u012a\u012b\7\t\2\2\u012b\u0132\3"+
		"\2\2\2\u012c\u012d\5(\25\2\u012d\u012e\7\b\2\2\u012e\u012f\5\60\31\2\u012f"+
		"\u0130\7\t\2\2\u0130\u0132\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u012c\3\2"+
		"\2\2\u0132/\3\2\2\2\u0133\u0134\7!\2\2\u0134\u0135\7\36\2\2\u0135\u013d"+
		"\5\60\31\2\u0136\u0137\7\"\2\2\u0137\u0138\7\36\2\2\u0138\u013d\5\60\31"+
		"\2\u0139\u013d\7\"\2\2\u013a\u013d\7!\2\2\u013b\u013d\3\2\2\2\u013c\u0133"+
		"\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\61\3\2\2\2\u013e\u013f\7\n\2\2\u013f\63\3\2\2\2\u0140"+
		"\u0141\7\13\2\2\u0141\65\3\2\2\2\24=Pbhp\u0083\u009a\u00bc\u00d2\u00d7"+
		"\u00e2\u00f1\u00f9\u010f\u0118\u0123\u0131\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}