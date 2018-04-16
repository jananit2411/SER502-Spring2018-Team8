grammar stark;
// program contains list of statements and function calls
program :  statementList functionDefn;
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
initializationStmt: 'int' IDENTIFIER '=' expression|      //int a = 10 or int a = b+c
                    'bool' IDENTIFIER '=' boolExpression| //bool x= 3>2
                    'int' IDENTIFIER '=' functionCall|    // int z = add(x,y)
                    'bool' IDENTIFIER '=' functionCall;
declarationStmt : 'int' IDENTIFIER|                       // int x
                  'bool' IDENTIFIER;                      // bool y
assignmentStmt : IDENTIFIER '=' boolExpression|           // x = true
                 IDENTIFIER '=' expression ;              // x = y or x=y+z
//if statement with or without else and nested if statements
ifStatement : 'if' '(' boolExpression ')' '{' statementList '}' |                               //if(a>b) {c=a;}
              'if' '(' boolExpression ')' '{' statementList '}' 'else' '{' statementList '}' ;  // else {c=b;}
//while statement that check a condition defined by a boolean expression and computes a list of statements
//nested while
whileStatement : 'while' '(' boolExpression ')' '{' statementList '}' ;  //while(a>5){a=a+1;}
//display statement to display the value of a expression(which could be identifier or a number) or a function call
displayStatement : 'display' expression|
                   'display' functionCall;     //display a
//compare expression is to compare two numeric expression
relationalExpression : expression '==' expression |
                       expression '!=' expression|
                       expression '<' expression |
                       expression '<=' expression|
                       expression '>' expression |
                       expression '>=' expression|
                       expression '==' BOOLVALUES|
                       expression '!=' BOOLVALUES;
//logical expression to compare two boolean values or expression
//that return
logicalExpression : relationalExpression '&&' relationalExpression |
                    relationalExpression '||' relationalExpression |
                    relationalExpression '&&' logicalExpression |
                    relationalExpression '||' logicalExpression |
                    '!'relationalExpression |
                    '!'logicalExpression;
// Common rule for statements that would return true or false
boolExpression : relationalExpression |
                 logicalExpression |
                 BOOLVALUES;
// Rules to handle normal numeric operation and precedence rules
expression : term '+' expression|
             term '-' expression|
             term;
term : factor '*' term|
       factor '/' term|
       factor '%' term|
       factor;
factor : '(' expression ')' | IDENTIFIER | NUMBER ;
// Function definition rule
functionDefn : 'func' functionName '(' parameters ')' '{' statementList  returnStatement '}'|
               'func' functionName '(' parameters ')' '{' returnStatement '}'|  ;
functionName : IDENTIFIER;
parameters : declarationStmt ',' parameters |
             declarationStmt |  ;
returnStatement : 'return' expression ';'|
                  'return' boolExpression';'|  ;
functionCall : IDENTIFIER '=' functionName '(' arguments ')'|functionName '(' arguments ')' ;
arguments : IDENTIFIER ',' arguments | NUMBER ',' arguments | NUMBER | IDENTIFIER |  ;
//Terminals
BOOLVALUES : 'true' | 'false' ;
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER :[0-9]+;
WS : [ \t\r\n]+ -> skip ;
MULTICOMMENT : '/*'.*?'*/' -> skip;
SINGLECOMMENT : '//' ~[\r\n]* -> skip;