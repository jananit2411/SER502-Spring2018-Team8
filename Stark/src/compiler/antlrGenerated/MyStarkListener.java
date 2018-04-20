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
     * Enter a parse tree produced by {@link StarkParser#whileStatement}.
     * @param ctx the parse tree
     */
    public void enterWhileStatement(StarkParser.WhileStatementContext ctx){
        System.out.println("EnterWhile");
    };
    /**
     * Exit a parse tree produced by {@link StarkParser#whileStatement}.
     * @param ctx the parse tree
     */
    public void exitWhileStatement(StarkParser.WhileStatementContext ctx){
        System.out.println("JumpToLabel EnterWhile");
        System.out.println("ExitWhile");
    };
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
    @Override public void enterDivExpression(StarkParser.DivExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDivExpression(StarkParser.DivExpressionContext ctx) {
        System.out.println("Div");
    }

    @Override public void enterSubExpression(StarkParser.SubExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSubExpression(StarkParser.SubExpressionContext ctx) {
        System.out.println("Sub");
    }

    @Override public void enterModExpression(StarkParser.ModExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitModExpression(StarkParser.ModExpressionContext ctx) {
        System.out.println("Mod");
    }
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

    //here
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInitIntExpression(StarkParser.InitIntExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInitIntExpression(StarkParser.InitIntExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInitBoolExpression(StarkParser.InitBoolExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInitBoolExpression(StarkParser.InitBoolExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInitIntFunctionCall(StarkParser.InitIntFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInitIntFunctionCall(StarkParser.InitIntFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInitBoolFunctionCall(StarkParser.InitBoolFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInitBoolFunctionCall(StarkParser.InitBoolFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIntDeclaration(StarkParser.IntDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIntDeclaration(StarkParser.IntDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBoolDeclaration(StarkParser.BoolDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBoolDeclaration(StarkParser.BoolDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIfStmt(StarkParser.IfStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfStmt(StarkParser.IfStmtContext ctx) {
        System.out.println("ExitIf");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIfElseStmt(StarkParser.IfElseStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfElseStmt(StarkParser.IfElseStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDispExpr(StarkParser.DispExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDispExpr(StarkParser.DispExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDispFunc(StarkParser.DispFuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDispFunc(StarkParser.DispFuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEqualsExpression(StarkParser.EqualsExpressionContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEqualsExpression(StarkParser.EqualsExpressionContext ctx) {
        System.out.println("IsEqual");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx) {
        System.out.println("IsNotEqual");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLessExpression(StarkParser.LessExpressionContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLessExpression(StarkParser.LessExpressionContext ctx) {
        System.out.println("IsLessThan");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx) {
        System.out.println("IsLessThanOrEqual");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGreaterExpression(StarkParser.GreaterExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreaterExpression(StarkParser.GreaterExpressionContext ctx) {
        System.out.println("IsGreaterThanEqual");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx) {
        System.out.println("IsGreaterThanEqual");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEqualsBooValue(StarkParser.EqualsBooValueContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEqualsBooValue(StarkParser.EqualsBooValueContext ctx) {
        System.out.println("IsEqualToBool");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotEqualsValue(StarkParser.NotEqualsValueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNotEqualsValue(StarkParser.NotEqualsValueContext ctx) {
        System.out.println("IsNotEqualToBool");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRelationalAnd(StarkParser.RelationalAndContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRelationalAnd(StarkParser.RelationalAndContext ctx) {
        System.out.println("And");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRelationalOr(StarkParser.RelationalOrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRelationalOr(StarkParser.RelationalOrContext ctx) {
        System.out.println("Or");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalAnd(StarkParser.LogicalAndContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalAnd(StarkParser.LogicalAndContext ctx) {
        System.out.println("And");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalOr(StarkParser.LogicalOrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalOr(StarkParser.LogicalOrContext ctx) {
        System.out.println("Or");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRelationalNot(StarkParser.RelationalNotContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRelationalNot(StarkParser.RelationalNotContext ctx) {
        System.out.println("Not");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalNot(StarkParser.LogicalNotContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalNot(StarkParser.LogicalNotContext ctx) {
        System.out.println("Not");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRelationalStmt(StarkParser.RelationalStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRelationalStmt(StarkParser.RelationalStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalStmt(StarkParser.LogicalStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalStmt(StarkParser.LogicalStmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBoolValue(StarkParser.BoolValueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBoolValue(StarkParser.BoolValueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBraceExpression(StarkParser.BraceExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBraceExpression(StarkParser.BraceExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIdentifier(StarkParser.IdentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIdentifier(StarkParser.IdentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNumber(StarkParser.NumberContext ctx) {
        System.out.println("Push"+ ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNumber(StarkParser.NumberContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFuncWithStmts(StarkParser.FuncWithStmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFuncWithStmts(StarkParser.FuncWithStmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNoFunc(StarkParser.NoFuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNoFunc(StarkParser.NoFuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunName(StarkParser.FunNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunName(StarkParser.FunNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultParam(StarkParser.MultParamContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMultParam(StarkParser.MultParamContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSingleParam(StarkParser.SingleParamContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSingleParam(StarkParser.SingleParamContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturnInt(StarkParser.ReturnIntContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturnInt(StarkParser.ReturnIntContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturnBool(StarkParser.ReturnBoolContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturnBool(StarkParser.ReturnBoolContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNoReturn(StarkParser.NoReturnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNoReturn(StarkParser.NoReturnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCondition(StarkParser.ConditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCondition(StarkParser.ConditionContext ctx) {
        if(ctx.parent.getText().contains("else")) {
            System.out.println("JumpIfFalse BeginElse");
        }
        else {
            System.out.println("JumpIfFalse ExitIf");
        }
    }
    /**
     * {@inheritDoc}
     *
     */
    @Override public void enterElseStmt(StarkParser.ElseStmtContext ctx) {
        System.out.println("BeginElse");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitElseStmt(StarkParser.ElseStmtContext ctx) {
        System.out.println("EndElse");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOpenBracket(StarkParser.OpenBracketContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOpenBracket(StarkParser.OpenBracketContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCloseBracke(StarkParser.CloseBrackeContext ctx) {

            System.out.println("JumpToLabel ExitElse");

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCloseBracke(StarkParser.CloseBrackeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhileCondition(StarkParser.WhileConditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhileCondition(StarkParser.WhileConditionContext ctx) {
        System.out.println("IfFalseCondition JumpToExitWhile");
    }
    //till here
}
