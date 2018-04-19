package compiler.antlrGenerated;// Generated from C:/Users/SUHAS/git/SER502-Spring2018-Team8/Stark/doc\Stark.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StarkParser}.
 */
public interface StarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StarkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StarkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(StarkParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(StarkParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StarkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StarkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initIntExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitIntExpression(StarkParser.InitIntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initIntExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitIntExpression(StarkParser.InitIntExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initBoolExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitBoolExpression(StarkParser.InitBoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initBoolExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitBoolExpression(StarkParser.InitBoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initIntFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitIntFunctionCall(StarkParser.InitIntFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initIntFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitIntFunctionCall(StarkParser.InitIntFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initBoolFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitBoolFunctionCall(StarkParser.InitBoolFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initBoolFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitBoolFunctionCall(StarkParser.InitBoolFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(StarkParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(StarkParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(StarkParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(StarkParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(StarkParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(StarkParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(StarkParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(StarkParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(StarkParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(StarkParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(StarkParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(StarkParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispExpr}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDispExpr(StarkParser.DispExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispExpr}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDispExpr(StarkParser.DispExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispFunc}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDispFunc(StarkParser.DispFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispFunc}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDispFunc(StarkParser.DispFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(StarkParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(StarkParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpression(StarkParser.LessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpression(StarkParser.LessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpression(StarkParser.GreaterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpression(StarkParser.GreaterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsBooValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsBooValue(StarkParser.EqualsBooValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsBooValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsBooValue(StarkParser.EqualsBooValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsValue(StarkParser.NotEqualsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsValue(StarkParser.NotEqualsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalAnd(StarkParser.RelationalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalAnd(StarkParser.RelationalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOr(StarkParser.RelationalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOr(StarkParser.RelationalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(StarkParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(StarkParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(StarkParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(StarkParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalNot(StarkParser.RelationalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalNot(StarkParser.RelationalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(StarkParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(StarkParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalStmt(StarkParser.RelationalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalStmt(StarkParser.RelationalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStmt(StarkParser.LogicalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStmt(StarkParser.LogicalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(StarkParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(StarkParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(StarkParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(StarkParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(StarkParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(StarkParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrm(StarkParser.TrmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrm(StarkParser.TrmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpresison}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulExpresison(StarkParser.MulExpresisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpresison}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulExpresison(StarkParser.MulExpresisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(StarkParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(StarkParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(StarkParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(StarkParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFact(StarkParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFact(StarkParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceExpression}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBraceExpression(StarkParser.BraceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceExpression}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBraceExpression(StarkParser.BraceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(StarkParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(StarkParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StarkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StarkParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcWithStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterFuncWithStmts(StarkParser.FuncWithStmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcWithStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitFuncWithStmts(StarkParser.FuncWithStmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcWithoutStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcWithoutStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noFunc}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterNoFunc(StarkParser.NoFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noFunc}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitNoFunc(StarkParser.NoFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funName}
	 * labeled alternative in {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunName(StarkParser.FunNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funName}
	 * labeled alternative in {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunName(StarkParser.FunNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterMultParam(StarkParser.MultParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitMultParam(StarkParser.MultParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterSingleParam(StarkParser.SingleParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitSingleParam(StarkParser.SingleParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnInt}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnInt(StarkParser.ReturnIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnInt}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnInt(StarkParser.ReturnIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnBool}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnBool(StarkParser.ReturnBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnBool}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnBool(StarkParser.ReturnBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noReturn}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoReturn(StarkParser.NoReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noReturn}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoReturn(StarkParser.NoReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noAssignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noAssignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(StarkParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(StarkParser.ArgumentsContext ctx);
}