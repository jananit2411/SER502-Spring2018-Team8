package compiler.antlrGenerated;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StarkParser}.
 */
public class MyStarkListener extends StarkBaseListener {
    /**
     * Enter a parse tree produced by {@link StarkParser#program}.
     * @param ctx the parse tree
     */
    public void enterProgram(StarkParser.ProgramContext ctx)
    {
        System.out.println("Program entered");
    }
    /**
     * Exit a parse tree produced by {@link StarkParser#program}.
     * @param ctx the parse tree
     */
    public  void exitProgram(StarkParser.ProgramContext ctx){
        System.out.println("Program exited");
    };
    /**
     * Enter a parse tree produced by {@link StarkParser#statementList}.
     * @param ctx the parse tree
     */
    public void enterStatementList(StarkParser.StatementListContext ctx){
       // System.out.println("statement list entered");
    };
    /**
     * Exit a parse tree produced by {@link StarkParser#statementList}.
     * @param ctx the parse tree
     */
    public void exitStatementList(StarkParser.StatementListContext ctx){
        //System.out.println("statement list exited");
    };
    /**
     * Enter a parse tree produced by {@link StarkParser#statement}.
     * @param ctx the parse tree
     */
    public void enterStatement(StarkParser.StatementContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#statement}.
     * @param ctx the parse tree
     */
    public void exitStatement(StarkParser.StatementContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#initializationStmt}.
     * @param ctx the parse tree
     */
    public void enterInitializationStmt(StarkParser.InitializationStmtContext ctx){
        System.out.println("enter Init statement");
    };
    /**
     * Exit a parse tree produced by {@link StarkParser#initializationStmt}.
     * @param ctx the parse tree
     */
    public void exitInitializationStmt(StarkParser.InitializationStmtContext ctx){
        System.out.println("exit Init statement");
    };
    /**
     * Enter a parse tree produced by the {@code VariableDeclaration}
     * labeled alternative in {@link StarkParser#declarationStmt}.
     * @param ctx the parse tree
     */
    public void enterVariableDeclaration(StarkParser.VariableDeclarationContext ctx){

        System.out.println("enter Var declaration statement");
       // System.out.println( " STORE "+ctx.IDENTIFIER().getText());
    };
    /**
     * Exit a parse tree produced by the {@code VariableDeclaration}
     * labeled alternative in {@link StarkParser#declarationStmt}.
     * @param ctx the parse tree
     */
    public void exitVariableDeclaration(StarkParser.VariableDeclarationContext ctx){
        System.out.println("exit var declaration statement");
    };
    /**
     * Enter a parse tree produced by the {@code boolVariable}
     * labeled alternative in {@link StarkParser#declarationStmt}.
     * @param ctx the parse tree
     */
    public void enterBoolVariable(StarkParser.BoolVariableContext ctx){
        //System.out.println("exit bool var statement");
    };
    /**
     * Exit a parse tree produced by the {@code boolVariable}
     * labeled alternative in {@link StarkParser#declarationStmt}.
     * @param ctx the parse tree
     */
    public void exitBoolVariable(StarkParser.BoolVariableContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#assignmentStmt}.
     * @param ctx the parse tree
     */
    public void enterAssignmentStmt(StarkParser.AssignmentStmtContext ctx){
       // System.out.println("enter assignment statement");
        //System.out.println("PUSH " );

    };
    /**
     * Exit a parse tree produced by {@link StarkParser#assignmentStmt}.
     * @param ctx the parse tree
     */
    public void exitAssignmentStmt(StarkParser.AssignmentStmtContext ctx){
      //  System.out.println("exit assignment statement");
      System.out.println("STORE " + ctx.varName.getText().toUpperCase());
    };
    /**
     * Enter a parse tree produced by {@link StarkParser#ifStatement}.
     * @param ctx the parse tree
     */
    public void enterIfStatement(StarkParser.IfStatementContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#ifStatement}.
     * @param ctx the parse tree
     */
    public void exitIfStatement(StarkParser.IfStatementContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#whileStatement}.
     * @param ctx the parse tree
     */
    public void enterWhileStatement(StarkParser.WhileStatementContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#whileStatement}.
     * @param ctx the parse tree
     */
    public void exitWhileStatement(StarkParser.WhileStatementContext ctx){};
    /**
     * Enter a parse tree produced by the {@code dispExpr}
     * labeled alternative in {@link StarkParser#displayStatement}.
     * @param ctx the parse tree
     */
    public void enterDispExpr(StarkParser.DispExprContext ctx){};
    /**
     * Exit a parse tree produced by the {@code dispExpr}
     * labeled alternative in {@link StarkParser#displayStatement}.
     * @param ctx the parse tree
     */
    public  void exitDispExpr(StarkParser.DispExprContext ctx){};
    /**
     * Enter a parse tree produced by the {@code dispFunc}
     * labeled alternative in {@link StarkParser#displayStatement}.
     * @param ctx the parse tree
     */
    @Override public void enterAddExpression(StarkParser.AddExpressionContext ctx) {
        //System.out.println("Enter add Expression");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddExpression(StarkParser.AddExpressionContext ctx) {
        System.out.println("Add");
    //    System.out.println("Exit add expression");
    }

    @Override public void enterSubExpression(StarkParser.SubExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSubExpression(StarkParser.SubExpressionContext ctx) { }

    @Override public  void enterDispFunc(StarkParser.DispFuncContext ctx){};
    /**
     * Exit a parse tree produced by the {@code dispFunc}
     * labeled alternative in {@link StarkParser#displayStatement}.
     * @param ctx the parse tree
     */
    public void exitDispFunc(StarkParser.DispFuncContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#relationalExpression}.
     * @param ctx the parse tree
     */
    public void enterRelationalExpression(StarkParser.RelationalExpressionContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#relationalExpression}.
     * @param ctx the parse tree
     */
    public void exitRelationalExpression(StarkParser.RelationalExpressionContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#logicalExpression}.
     * @param ctx the parse tree
     */
    public  void enterLogicalExpression(StarkParser.LogicalExpressionContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#logicalExpression}.
     * @param ctx the parse tree
     */
    public void exitLogicalExpression(StarkParser.LogicalExpressionContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#boolExpression}.
     * @param ctx the parse tree
     */
    public void enterBoolExpression(StarkParser.BoolExpressionContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#boolExpression}.
     * @param ctx the parse tree
     */
    public  void exitBoolExpression(StarkParser.BoolExpressionContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#expression}.
     * @param ctx the parse tree
     */
    public void enterExpression(StarkParser.ExpressionContext ctx){
        System.out.println("Expression entered");
       // System.out.println(ctx.getParent());
       // System.out.println("enterExpression " +ctx.getText());
        // System.out.println(ctx. +ctx.getChild(2).getText());
    }
    /**
     * Exit a parse tree produced by {@link StarkParser#expression}.
     * @param ctx the parse tree
     */
    public void exitExpression(StarkParser.ExpressionContext ctx){
        System.out.println("exitexpression");
    //    System.out.println(ctx.getChild(1));


    }
    @Override public void enterMulExpresison(StarkParser.MulExpresisonContext ctx) {


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMulExpresison(StarkParser.MulExpresisonContext ctx) {
        System.out.println("MUL");
        System.out.println("Exit mul expression");
    }
    /**
     * Enter a parse tree produced by {@link StarkParser#term}.
     * @param ctx the parse tree
     */
    public void enterTerm(StarkParser.TermContext ctx){

    };
    /**
     * Exit a parse tree produced by {@link StarkParser#term}.
     * @param ctx the parse tree
     */
    public void exitTerm(StarkParser.TermContext ctx){


    };
    /**
     * Enter a parse tree produced by {@link StarkParser#factor}.
     * @param ctx the parse tree
     */
    public void enterFactor(StarkParser.FactorContext ctx){

        System.out.println("Factor Push"+ ctx.getText());
    };
    /**
     * Exit a parse tree produced by {@link StarkParser#factor}.
     * @param ctx the parse tree
     */
    public void exitFactor(StarkParser.FactorContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#functionDefn}.
     * @param ctx the parse tree
     */
    public void enterFunctionDefn(StarkParser.FunctionDefnContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#functionDefn}.
     * @param ctx the parse tree
     */
    public void exitFunctionDefn(StarkParser.FunctionDefnContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#functionName}.
     * @param ctx the parse tree
     */
    public void enterFunctionName(StarkParser.FunctionNameContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#functionName}.
     * @param ctx the parse tree
     */
    public void exitFunctionName(StarkParser.FunctionNameContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#parameters}.
     * @param ctx the parse tree
     */
    public void enterParameters(StarkParser.ParametersContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#parameters}.
     * @param ctx the parse tree
     */
    public void exitParameters(StarkParser.ParametersContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#returnStatement}.
     * @param ctx the parse tree
     */
    public void enterReturnStatement(StarkParser.ReturnStatementContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#returnStatement}.
     * @param ctx the parse tree
     */
    public void exitReturnStatement(StarkParser.ReturnStatementContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#functionCall}.
     * @param ctx the parse tree
     */
    public  void enterFunctionCall(StarkParser.FunctionCallContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#functionCall}.
     * @param ctx the parse tree
     */
    public void exitFunctionCall(StarkParser.FunctionCallContext ctx){};
    /**
     * Enter a parse tree produced by {@link StarkParser#arguments}.
     * @param ctx the parse tree
     */
    public void enterArguments(StarkParser.ArgumentsContext ctx){};
    /**
     * Exit a parse tree produced by {@link StarkParser#arguments}.
     * @param ctx the parse tree
     */
    public void exitArguments(StarkParser.ArgumentsContext ctx){};
}
