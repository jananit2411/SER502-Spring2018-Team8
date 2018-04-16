package compiler.antlrGenerated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link starkParser}.
 */
public interface starkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link starkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(starkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(starkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(starkParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(starkParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(starkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(starkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitializationStmt(starkParser.InitializationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#initializationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitializationStmt(starkParser.InitializationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmt(starkParser.DeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmt(starkParser.DeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(starkParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(starkParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(starkParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(starkParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(starkParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(starkParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(starkParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(starkParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(starkParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(starkParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(starkParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(starkParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(starkParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(starkParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(starkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(starkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(starkParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(starkParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(starkParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(starkParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefn(starkParser.FunctionDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefn(starkParser.FunctionDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(starkParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(starkParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(starkParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(starkParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(starkParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(starkParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(starkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(starkParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link starkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(starkParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link starkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(starkParser.ArgumentsContext ctx);
}