package compiler.antlrGenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link starkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface starkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link starkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(starkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(starkParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(starkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationStmt(starkParser.InitializationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStmt(starkParser.DeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(starkParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(starkParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(starkParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(starkParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(starkParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(starkParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(starkParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(starkParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(starkParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(starkParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefn(starkParser.FunctionDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(starkParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(starkParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(starkParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(starkParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link starkParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(starkParser.ArgumentsContext ctx);
}