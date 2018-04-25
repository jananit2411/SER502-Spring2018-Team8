grammar Stark;

program :  statementList functionDefn ;
statementList : statement  statementList |
                statement;

statement : declarationStmt ';' |
            initializationStmt ';'|
            assignmentStmt ';'|
            ifStatement |
            whileStatement |
            displayStatement ';' |
            functionCall ';';

initializationStmt: 'int' varName=IDENTIFIER '=' expression #initIntExpression|
                    'bool' varName=IDENTIFIER '=' boolExpression #initBoolExpression;

declarationStmt : 'int' varName = IDENTIFIER #intDeclaration
                  |'bool' varName = IDENTIFIER #boolDeclaration;

assignmentStmt : varName = IDENTIFIER '=' boolExpression|
                 varName = IDENTIFIER '=' expression ;

ifStatement : 'if' '(' condition ')' '{' statementList '}' #ifStmt|
              'if' '(' condition ')' openBrace statementList closeBrace elseStmt #ifElseStmt ;

condition : boolExpression ;

elseStmt : 'else' '{' statementList '}';

whileStatement : 'while' '(' whileCondition ')' '{' statementList '}' ;

whileCondition : boolExpression;

displayStatement : 'display' argument=expression #dispExpr
                   |'display' functionCall #dispFunc;

relationalExpression : expression '==' expression #equalsExpression|
                       expression '!=' expression #notEqualsExpression|
                       expression '<' expression  #lessExpression|
                       expression '<=' expression #lessEqualsExpression|
                       expression '>' expression  #greaterExpression|
                       expression '>=' expression #greaterEqualsExpression|
                       IDENTIFIER '==' boolVal=BOOLVALUES #equalsBooValue|
                       IDENTIFIER '!=' boolVal=BOOLVALUES #notEqualsValue;

logicalExpression : relationalExpression '&&' relationalExpression #relationalAnd|
                    relationalExpression '||' relationalExpression #relationalOr |
                    relationalExpression '&&' logicalExpression #logicalAnd|
                    relationalExpression '||' logicalExpression #logicalOr|
                    '!'relationalExpression #relationalNot |
                    '!'logicalExpression #logicalNot;

boolExpression : relationalExpression #relationalStmt|
                 logicalExpression #logicalStmt|
                 BOOLVALUES #boolValue;

expression : term '+' expression #addExpression |
             term '-' expression #subExpression |
             term #trm;

term : factor '*' term #mulExpresison|
       factor '/' term #divExpression|
       factor '%' term #modExpression|
       factor #fact;

factor : '(' expression ')' #braceExpression| varName=IDENTIFIER #Identifier| num=NUMBER #number ;


functionDefn : 'func' name=functionName '(' parameters ')' '{' statementList  returnStatement '}' #funcWithStmts|
               'func' name=functionName '(' parameters ')' '{' returnStatement '}' #funcWithoutStmts | #noFunc ;

functionName : IDENTIFIER #funName;
parameters : declarationStmt ',' parameters #multParam|
             declarationStmt   #singleParam;

returnStatement : 'return' expression ';' #returnInt|
                  'return' boolExpression';' #returnBool | #noReturn ;

functionCall : varname=IDENTIFIER '=' name=functionName '(' arguments ')' #assignFunctionCall
               |name=functionName '(' arguments ')' #noAssignFunctionCall;

arguments : name=IDENTIFIER ',' arguments #dummyIdentifier| name=NUMBER ',' arguments #dummyNumber| NUMBER #argNumber | IDENTIFIER #argIdentifier| #dummyblank ;

openBrace : '{' #OpenBracket;
closeBrace: '}' #CloseBracket;


//Terminals
BOOLVALUES : 'true' | 'false' ;
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER :[0-9]+;
WS : [ \t\r\n]+ -> skip ;
MULTICOMMENT : '/*'.*?'*/' -> skip;
SINGLECOMMENT : '//' ~[\r\n]* -> skip;