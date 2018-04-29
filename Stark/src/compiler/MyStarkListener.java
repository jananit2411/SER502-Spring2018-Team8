package compiler;

import compiler.antlrGenerated.StarkBaseListener;
import compiler.antlrGenerated.StarkParser;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StarkParser}.
 */
public class MyStarkListener extends StarkBaseListener {

	public static final String ENCODING ="UTF-8";
	private final String NEWLINE = "\n";
	private StringBuilder stringBuilder=new StringBuilder();
    String lableinfunctioncall=null;
    String destPath;
    int argCount=0;
    int ifElseCounter=0;
    int whileCounter=0;
    int funcCounter=0;
    boolean functionScope = false;
    ArrayList<String> intVarList = new ArrayList<String>();
    ArrayList<String> boolVarList = new ArrayList<String>();
    ArrayList<String> funcIntVarList = new ArrayList<String>();
    ArrayList<String> funcBoolVarList = new ArrayList<String>();

    public MyStarkListener(String destPath){
    	this.destPath=destPath;
    }
    /**
     * Enter a parse tree produced by {@link StarkParser#program}.
     * @param ctx the parse tree
     */
    public void enterProgram(StarkParser.ProgramContext ctx)
    {
    }

    public void exitProgram(StarkParser.ProgramContext ctx){
    	String intermediateProgram = stringBuilder.toString();
		try {
			PrintWriter writer = new PrintWriter(destPath);
			writer.write(intermediateProgram);
			writer.close();
		} catch (Exception e) {
            System.err.println("Exception while writing to file");
        }
	}
    public void enterAssignmentStmt(StarkParser.AssignmentStmtContext ctx){

    };

    public void exitAssignmentStmt(StarkParser.AssignmentStmtContext ctx){
        String text = ctx.varName.getText();
        if(functionScope) {
            if(funcIntVarList.contains(text) || funcBoolVarList.contains(text)) {
                stringBuilder.append("STORE " + ctx.varName.getText() + NEWLINE);
            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        } else {
            if(intVarList.contains(text) || boolVarList.contains(text)) {
                stringBuilder.append("STORE " + ctx.varName.getText() + NEWLINE);

            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        }

    };

    public void enterWhileStatement(StarkParser.WhileStatementContext ctx){
    	whileCounter++;
    	stringBuilder.append("BEGINWHILE"+whileCounter+NEWLINE);
    };

    public void exitWhileStatement(StarkParser.WhileStatementContext ctx){
    	stringBuilder.append("JMP BEGINWHILE"+whileCounter+NEWLINE);
        stringBuilder.append("EXITWHILE"+whileCounter+NEWLINE);
        whileCounter--;
    };

    @Override public void exitAddExpression(StarkParser.AddExpressionContext ctx) {
        stringBuilder.append("ADD"+NEWLINE);
    }

    @Override public void exitDivExpression(StarkParser.DivExpressionContext ctx) {
        stringBuilder.append("DIV"+NEWLINE);
    }

    @Override public void exitSubExpression(StarkParser.SubExpressionContext ctx) {
        stringBuilder.append("SUB"+NEWLINE);
    }

    @Override public void exitModExpression(StarkParser.ModExpressionContext ctx) {
        stringBuilder.append("MOD"+NEWLINE);
    }

    @Override public void exitMulExpresison(StarkParser.MulExpresisonContext ctx) {
            stringBuilder.append("MUL"+NEWLINE);
    }

    @Override public void exitArgNumber(StarkParser.ArgNumberContext ctx) {
        stringBuilder.append("PUSH "+ctx.getText()+NEWLINE);
        argCount++;
    }

    @Override public void exitArgIdentifier(StarkParser.ArgIdentifierContext ctx) {
            stringBuilder.append("LOAD " + ctx.getText() + NEWLINE);
            argCount++;
    }

    @Override public void enterInitIntExpression(StarkParser.InitIntExpressionContext ctx) {
        String text = ctx.varName.getText();
        if(functionScope) {
            if(!(funcBoolVarList.contains(text) || intVarList.contains(text))) {
                stringBuilder.append("DECINT " + ctx.varName.getText() + NEWLINE);
                funcIntVarList.add(ctx.varName.getText());
            } else {
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        }else{
        if(!(boolVarList.contains(text) || intVarList.contains(text))) {
            stringBuilder.append("DECINT " + ctx.varName.getText() + NEWLINE);
            intVarList.add(ctx.varName.getText());
        } else {
            System.err.println("Compile time error : Variable " +text+ " already defined");
            System.exit(1);
        }
        }
    }

    @Override public void exitInitIntExpression(StarkParser.InitIntExpressionContext ctx) {
        stringBuilder.append("STORE " + ctx.varName.getText() + NEWLINE);
    }

    @Override public void enterInitBoolExpression(StarkParser.InitBoolExpressionContext ctx) {
        String text = ctx.varName.getText();
        if(functionScope) {
            if(!(funcBoolVarList.contains(text) || funcIntVarList.contains(text))) {
                stringBuilder.append("DECBOOL " + ctx.varName.getText() + NEWLINE);
                funcBoolVarList.add(text);
            } else {
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        } else {
            if(!(boolVarList.contains(text) || intVarList.contains(text))) {
                stringBuilder.append("DECBOOL " + ctx.varName.getText() + NEWLINE);
                boolVarList.add(text);
            } else {
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        }

    }

    @Override public void exitInitBoolExpression(StarkParser.InitBoolExpressionContext ctx) {
        String text = ctx.varName.getText();
        stringBuilder.append("STORE " + ctx.varName.getText() + NEWLINE);
    }

    @Override public void enterIntDeclaration(StarkParser.IntDeclarationContext ctx) {
        String text = ctx.getText().substring(3);
        if(functionScope)
        {
            if(!(funcIntVarList.contains(text) || funcBoolVarList.contains(text))) {
                stringBuilder.append("DECINT "+ctx.getText().substring(3)+NEWLINE);
                funcIntVarList.add(text);
            } else{
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        } else
        {
            if(!(intVarList.contains(text) || boolVarList.contains(text))) {
                stringBuilder.append("DECINT " + ctx.getText().substring(3) + NEWLINE);
                intVarList.add(text);
            } else {
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        }
    }

    @Override public void enterBoolDeclaration(StarkParser.BoolDeclarationContext ctx) {
        String text = ctx.getText().substring(4);
        if(functionScope) {
            if(!(funcBoolVarList.contains(text)) || (funcIntVarList.contains(text))) {
                stringBuilder.append("DECBOOL " + text + NEWLINE);
                funcBoolVarList.add(text);
            } else{
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        } else {
            if(!(boolVarList.contains(text)) || (intVarList.contains(text))) {
                stringBuilder.append("DECBOOL " + text + NEWLINE);
                boolVarList.add(text);
            } else{
                System.err.println("Compile time error : Variable " +text+ " already defined");
                System.exit(1);
            }
        }

    }

    @Override public void exitIfStmt(StarkParser.IfStmtContext ctx) {
         stringBuilder.append("EXITIF"+NEWLINE);
    }

    @Override public void exitDispExpr(StarkParser.DispExprContext ctx) {
         stringBuilder.append("DISPLAY "+ctx.getText().substring(7)+NEWLINE);
    }

    @Override public void exitDispFunc(StarkParser.DispFuncContext ctx) {
        stringBuilder.append("DISPLAY"+NEWLINE);
    }

    @Override public void exitEqualsExpression(StarkParser.EqualsExpressionContext ctx) {
        stringBuilder.append("EQ"+NEWLINE);
    }

    @Override public void exitNotEqualsExpression(StarkParser.NotEqualsExpressionContext ctx) {
        stringBuilder.append("NEQ"+NEWLINE);
    }

    @Override public void exitLessExpression(StarkParser.LessExpressionContext ctx) {
        stringBuilder.append("LT"+NEWLINE);
    }

    @Override public void exitLessEqualsExpression(StarkParser.LessEqualsExpressionContext ctx) {
        stringBuilder.append("LTE"+NEWLINE);
    }

    @Override public void exitGreaterExpression(StarkParser.GreaterExpressionContext ctx) {
        stringBuilder.append("GT"+NEWLINE);
    }

    @Override public void exitGreaterEqualsExpression(StarkParser.GreaterEqualsExpressionContext ctx) {
        stringBuilder.append("GTE"+NEWLINE);
    }

    @Override public void enterEqualsBooValue(StarkParser.EqualsBooValueContext ctx) {
        stringBuilder.append("PUSH "+ctx.boolVal.getText()+NEWLINE);
    }

    @Override public void exitEqualsBooValue(StarkParser.EqualsBooValueContext ctx) {
        String text = ctx.IDENTIFIER().getText();
        if(functionScope) {
            if(funcBoolVarList.contains(text)) {
                stringBuilder.append("LOAD " + text+NEWLINE);
                stringBuilder.append("EQB" + NEWLINE);
            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        } else {
            if(boolVarList.contains(text)) {
                stringBuilder.append("LOAD " + text+NEWLINE);
                stringBuilder.append("EQB" + NEWLINE);
            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        }
    }

    @Override public void exitNotEqualsValue(StarkParser.NotEqualsValueContext ctx) {
        String text = ctx.IDENTIFIER().getText();
        if(functionScope) {
            if(funcBoolVarList.contains(text)) {
                stringBuilder.append("LOAD " + text);
                stringBuilder.append("NEQB" + NEWLINE);
            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        } else {
            if(boolVarList.contains(text)) {
                stringBuilder.append("LOAD " + text);
                stringBuilder.append("NEQB" + NEWLINE);
            } else {
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        }

    }
    @Override public void exitRelationalAnd(StarkParser.RelationalAndContext ctx) {
        stringBuilder.append("AND"+NEWLINE);
    }

    @Override public void exitRelationalOr(StarkParser.RelationalOrContext ctx) {
        stringBuilder.append("OR"+NEWLINE);
    }
    @Override public void exitLogicalAnd(StarkParser.LogicalAndContext ctx) {
        stringBuilder.append("AND"+NEWLINE);
    }

    @Override public void exitLogicalOr(StarkParser.LogicalOrContext ctx) {
        stringBuilder.append("OR"+NEWLINE);
    }
    @Override public void exitRelationalNot(StarkParser.RelationalNotContext ctx) {
        stringBuilder.append("NOT"+NEWLINE);
    }
    @Override public void exitLogicalNot(StarkParser.LogicalNotContext ctx) {
         stringBuilder.append("NOT"+NEWLINE);
    }
    @Override public void enterBoolValue(StarkParser.BoolValueContext ctx) {
         stringBuilder.append("PUSH "+ctx.getText()+NEWLINE);
    }
    @Override public void exitIdentifier(StarkParser.IdentifierContext ctx) {
        String text = ctx.getText();
        if(functionScope) {
            if((funcBoolVarList.contains(text) || funcIntVarList.contains(text))) {
                stringBuilder.append("LOAD "+text+NEWLINE);
            } else{
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        } else {
            if((boolVarList.contains(text) || intVarList.contains(text))) {
                stringBuilder.append("LOAD "+text+NEWLINE);
            } else{
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        }
    }
    @Override public void enterNumber(StarkParser.NumberContext ctx) {
        stringBuilder.append("PUSH "+ctx.getText()+NEWLINE);
    }
    @Override public void enterFuncWithStmts(StarkParser.FuncWithStmtsContext ctx) {
        functionScope = true;
        stringBuilder.append("HALT"+ NEWLINE);
        stringBuilder.append("BEGIN FUNC "+ ctx.name.getText()+NEWLINE);
    }
    @Override public void exitFuncWithStmts(StarkParser.FuncWithStmtsContext ctx) {
        stringBuilder.append("END FUNC "+ctx.name.getText()+NEWLINE);

        functionScope = false;
        funcBoolVarList.clear();
        funcIntVarList.clear();
    }

    @Override public void enterFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx) {
        functionScope=true;
        stringBuilder.append("BEGIN FUNC "+ctx.name.getText()+NEWLINE);
    }
    @Override public void exitFuncWithoutStmts(StarkParser.FuncWithoutStmtsContext ctx) {
        stringBuilder.append("END FUNC"+NEWLINE);

        functionScope = false;
        funcBoolVarList.clear();
        funcIntVarList.clear();
    }
    @Override public void exitDummyIdentifier(StarkParser.DummyIdentifierContext ctx) {
        stringBuilder.append("LOAD "+ctx.name.getText()+NEWLINE);
        argCount++;
    }
    @Override public void exitDummyNumber(StarkParser.DummyNumberContext ctx) {
        stringBuilder.append("PUSH "+ctx.name.getText()+NEWLINE);
        argCount++;
    }

    @Override public void exitReturnInt(StarkParser.ReturnIntContext ctx) {
        stringBuilder.append("RET "+ctx.varname.getText()  +NEWLINE);
    }
    @Override public void exitReturnBool(StarkParser.ReturnBoolContext ctx) {
        stringBuilder.append("RET "+ctx.varname.getText()+NEWLINE);
    }
    @Override public void exitAssignFunctionCall(StarkParser.AssignFunctionCallContext ctx) {
    	funcCounter++;
    	stringBuilder.append("CALL "+ctx.name.getText()+" "+funcCounter+" "+argCount+NEWLINE);
        stringBuilder.append("END CALL "+ctx.name.getText()+" "+funcCounter+NEWLINE);
        argCount = 0;
        String text = ctx.varname.getText();
        if(functionScope) {
            if((funcIntVarList.contains(text) || funcBoolVarList.contains(text))) {
                stringBuilder.append("STORE " + ctx.varname.getText() + NEWLINE);
            } else{
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }

        } else {
            if((intVarList.contains(text) || boolVarList.contains(text))) {
                stringBuilder.append("STORE " + ctx.varname.getText() + NEWLINE);
            } else{
                System.err.println("Compile time error : Variable " +text+ " not defined");
                System.exit(1);
            }
        }
    }

    @Override public void exitNoAssignFunctionCall(StarkParser.NoAssignFunctionCallContext ctx) {
        funcCounter++;
        stringBuilder.append("CALL "+ctx.name.getText()+" "+funcCounter+" "+argCount+NEWLINE);
        stringBuilder.append("END CALL "+ctx.name.getText()+" "+funcCounter+NEWLINE);
        argCount = 0;
   }
    @Override public void exitCondition(StarkParser.ConditionContext ctx) {
        if(ctx.parent.getText().contains("else")) {
        	ifElseCounter++;
            stringBuilder.append("JIF BEGINELSE"+ifElseCounter+NEWLINE);
        }
        else {
            stringBuilder.append("JIF EXITIF"+NEWLINE);
        }
    }
    @Override public void enterElseStmt(StarkParser.ElseStmtContext ctx) {
        stringBuilder.append("BEGINELSE"+ifElseCounter+NEWLINE);
    }
    @Override public void exitElseStmt(StarkParser.ElseStmtContext ctx)
    {
        stringBuilder.append("ENDELSE"+ifElseCounter+NEWLINE);
        ifElseCounter--; 
    }
    @Override public void enterCloseBracket(StarkParser.CloseBracketContext ctx) {
        stringBuilder.append("JMP ENDELSE"+ifElseCounter+NEWLINE);
    }
    @Override public void exitWhileCondition(StarkParser.WhileConditionContext ctx) {
        stringBuilder.append("JIF EXITWHILE"+whileCounter+NEWLINE);
    }
}
