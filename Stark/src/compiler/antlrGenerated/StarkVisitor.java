package compiler.antlrGenerated;// Generated from C:/Users/SUHAS/git/SER502-Spring2018-Team8/Stark/doc\Stark.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code initIntExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIntExpression(StarkParser.InitIntExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initBoolExpression}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBoolExpression(StarkParser.InitBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initIntFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIntFunctionCall(StarkParser.InitIntFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initBoolFunctionCall}
	 * labeled alternative in {@link StarkParser#initializationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBoolFunctionCall(StarkParser.InitBoolFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(StarkParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolDeclaration}
	 * labeled alternative in {@link StarkParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclaration(StarkParser.BoolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(StarkParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(StarkParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link StarkParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(StarkParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StarkParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(StarkParser.ElseStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code equalsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(StarkParser.EqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpression(StarkParser.LessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpression(StarkParser.GreaterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqualsExpression}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsBooValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsBooValue(StarkParser.EqualsBooValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsValue}
	 * labeled alternative in {@link StarkParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsValue(StarkParser.NotEqualsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalAnd(StarkParser.RelationalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOr(StarkParser.RelationalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(StarkParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(StarkParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalNot(StarkParser.RelationalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link StarkParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(StarkParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalStmt(StarkParser.RelationalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalStmt}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStmt(StarkParser.LogicalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link StarkParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(StarkParser.BoolValueContext ctx);
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
	 * Visit a parse tree produced by the {@code trm}
	 * labeled alternative in {@link StarkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrm(StarkParser.TrmContext ctx);
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
	 * Visit a parse tree produced by the {@code fact}
	 * labeled alternative in {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(StarkParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braceExpression}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceExpression(StarkParser.BraceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(StarkParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link StarkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StarkParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcWithStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncWithStmts(StarkParser.FuncWithStmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcWithoutStmts}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noFunc}
	 * labeled alternative in {@link StarkParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoFunc(StarkParser.NoFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funName}
	 * labeled alternative in {@link StarkParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunName(StarkParser.FunNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultParam(StarkParser.MultParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link StarkParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParam(StarkParser.SingleParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnInt}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInt(StarkParser.ReturnIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnBool}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBool(StarkParser.ReturnBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noReturn}
	 * labeled alternative in {@link StarkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoReturn(StarkParser.NoReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noAssignFunctionCall}
	 * labeled alternative in {@link StarkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(StarkParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenBracket}
	 * labeled alternative in {@link StarkParser#openBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(StarkParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloseBracke}
	 * labeled alternative in {@link StarkParser#closeBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracke(StarkParser.CloseBrackeContext ctx);
}