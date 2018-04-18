package compiler.antlrGenerated;// Generated from D:/Stark\Stark.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StarkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StarkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StarkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(StarkParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StarkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationStmt(StarkParser.InitializationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(StarkParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolVariable}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(StarkParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(StarkParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StarkParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(StarkParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dispExpr}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispExpr(StarkParser.DispExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dispFunc}
	 * labeled alternative in {@link StarkParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispFunc(StarkParser.DispFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(StarkParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(StarkParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(StarkParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(StarkParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(StarkParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justTerm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustTerm(StarkParser.JustTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpresison}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpresison(StarkParser.MulExpresisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(StarkParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExpression}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(StarkParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justFactor}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustFactor(StarkParser.JustFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(StarkParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefn(StarkParser.FunctionDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(StarkParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(StarkParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(StarkParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(StarkParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(StarkParser.ArgumentsContext ctx);
}