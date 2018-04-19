package compiler.antlrGenerated;// Generated from D:/Stark\Stark.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitializationStmt(StarkParser.InitializationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitializationStmt(StarkParser.InitializationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(StarkParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(StarkParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVariable}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(StarkParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVariable}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(StarkParser.BoolVariableContext ctx);
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
	 * Enter a parse tree produced by {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StarkParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StarkParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(StarkParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(StarkParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(StarkParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(StarkParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(StarkParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(StarkParser.BoolExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code justTerm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJustTerm(StarkParser.JustTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justTerm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJustTerm(StarkParser.JustTermContext ctx);
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
	 * Enter a parse tree produced by the {@code justFactor}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterJustFactor(StarkParser.JustFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justFactor}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitJustFactor(StarkParser.JustFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(StarkParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(StarkParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefn(StarkParser.FunctionDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefn(StarkParser.FunctionDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(StarkParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(StarkParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(StarkParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(StarkParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(StarkParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(StarkParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(StarkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(StarkParser.FunctionCallContext ctx);
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
