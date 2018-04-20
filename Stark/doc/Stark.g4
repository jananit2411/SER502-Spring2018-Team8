grammar Stark;
// program contains list of statements and function calls
program :  statementList functionDefn ;
// statementList could be a simple statement and or a list of statements
statementList : statement  statementList |
                statement;
// statement could be any of the options listed
statement : declarationStmt ';' |
            initializationStmt ';'|
            assignmentStmt ';'|
            ifStatement |
            whileStatement |
            displayStatement ';' |
            functionCall ';';
initializationStmt: 'int' IDENTIFIER '=' expression #initIntExpression|      //int a = 10 or int a = b+c
                    'bool' IDENTIFIER '=' boolExpression #initBoolExpression|//bool x= 3>2
                    'int' IDENTIFIER '=' functionCall #initIntFunctionCall|    // int z = add(x,y)
                    'bool' IDENTIFIER '=' functionCall #initBoolFunctionCall;
declarationStmt : 'int' varName= IDENTIFIER #intDeclaration
                  |'bool' varName=IDENTIFIER #boolDeclaration;                      // bool y
assignmentStmt : varName = IDENTIFIER '=' boolExpression|           // x = true
                 varName = IDENTIFIER '=' expression ;              // x = y or x=y+z
//if statement with or without else and nested if statements
ifStatement : 'if' '(' condition ')' '{' statementList '}' #ifStmt|                               //if(a>b) {c=a;}
              'if' '(' condition ')' openBrace statementList closeBrace elseStmt #ifElseStmt ;  // else {c=b;}
condition : boolExpression ;
elseStmt : 'else' '{' statementList '}';
//while statement that check a condition defined by a boolean expression and computes a list of statements
//nested while
whileStatement : 'while' '(' whileCondition ')' '{' statementList '}' ;  //while(a>5){a=a+1;}
whileCondition : boolExpression;
//display statement to display the value of a expression(which could be identifier or a number) or a function call
displayStatement : 'display' argument=expression #dispExpr
                   |'display' functionCall #dispFunc;     //display a
//compare expression is to compare two numeric expression
relationalExpression : expression '==' expression #equalsExpression|
                       expression '!=' expression #notEqualsExpression|
                       expression '<' expression  #lessExpression|
                       expression '<=' expression #lessEqualsExpression|
                       expression '>' expression  #greaterExpression|
                       expression '>=' expression #greaterEqualsExpression|
                       expression '==' BOOLVALUES #equalsBooValue|
                       expression '!=' BOOLVALUES #notEqualsValue;
//logical expression to compare two boolean values or expression
//that return
logicalExpression : relationalExpression '&&' relationalExpression #relationalAnd|
                    relationalExpression '||' relationalExpression #relationalOr |
                    relationalExpression '&&' logicalExpression #logicalAnd|
                    relationalExpression '||' logicalExpression #logicalOr|
                    '!'relationalExpression #relationalNot |
                    '!'logicalExpression #logicalNot;
// Common rule for statements that would return true or false
boolExpression : relationalExpression #relationalStmt|
                 logicalExpression #logicalStmt|
                 BOOLVALUES #boolValue;
// Rules to handle normal numeric operation and precedence rules
expression : term '+' expression #addExpression |
             term '-' expression #subExpression |
             term #trm;

term : factor '*' term #mulExpresison|
       factor '/' term #divExpression|
       factor '%' term #modExpression|
       factor #fact;

factor : '(' expression ')' #braceExpression| varName=IDENTIFIER #Identifier| num=NUMBER #number ;
// Function definition rule

functionDefn : 'func' functionName '(' parameters ')' '{' statementList  returnStatement '}' #funcWithStmts|
               'func' functionName '(' parameters ')' '{' returnStatement '}' #funcWithoutStmts | #noFunc ;
functionName : IDENTIFIER #funName;
parameters : declarationStmt ',' parameters #multParam|
             declarationStmt   #singleParam;
returnStatement : 'return' expression ';' #returnInt|
                  'return' boolExpression';' #returnBool | #noReturn ;
functionCall : IDENTIFIER '=' functionName '(' arguments ')' #assignFunctionCall|functionName '(' arguments ')' #noAssignFunctionCall;
arguments : IDENTIFIER ',' arguments | NUMBER ',' arguments | NUMBER  | IDENTIFIER |  ;
openBrace : '{' #OpenBracket;
closeBrace: '}' #CloseBracke;
//Terminals
BOOLVALUES : 'true' | 'false' ;
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER :[0-9]+;
WS : [ \t\r\n]+ -> skip ;
MULTICOMMENT : '/*'.*?'*/' -> skip;
SINGLECOMMENT : '//' ~[\r\n]* -> skip;