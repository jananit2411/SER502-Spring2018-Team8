STARK PROGRAMMING LANGUAGE

STARK is a static, strongly typed imperative programming language. The word “Stark” means simple and powerful which are the main design goals. It is easy to learn and provides all the major features of a high level language.

TEAM MEMBERS:

1. Debarati Bhattacharyya

2. Shilpa Bhat

3. Janani Thiagarajan

4. Vivek Faldu

DELIVERABLES:

1. Source Code is available in Stark/src folder
2. Executable is available in Stark/executable folder
3. Sample programs are available in Stark/data/stark_programs folder
4. Intermediate Code for those programs are available under Stark/data/intermediate_code folder
5. Presentation is under main folder
6. The YouTube video link for demo is here

SYSTEM USED TO BUILD COMPILER AND RUNTIME
TOOLS USED: Antlr4, Java 8
ANTLR 4
  Lexical analysis – tokenization
  Parser generation – parse tree
Java 8
  Compiler is written in Java 
  Interpréter and Runtime environment use JRE
  Data Structures used : Stack and Hashmap

INSTALLATION FOR WINDOWS
1. Download the stark.jar from the repository
2. For compiling STARK source code:
        java -jar Stark.jar -c sourcePath intermediateCodePath
   This generates the intemediate code file in --> intermediateCodePath programName.iark

3. For executing intermediate code:
        java -jar Stark.jar -e intermediateCodePath programName.iark

HIGHLIGHTING FEATURES OF STARK
1. Supports Nested-If, Nested If-Else
2. Supports Nested-While
3. Supports function definitions and function calls -
		a. Multiple function definition and function call
		b. Multiple functions calls to the same function
		c. Nested functions
		d. Local scoping for variables inside functions
4. Functions with or without return statements
5. Functions with or without parameters
6. Compile time exceptions
		a. Usage of variables without definition
		b. Declaration of same variables more than once in the same scope

GRAMMAR

grammar stark;

program :  statementList functionDefn;

statementList : statement  statementList |
                statement;

statement : declarationStmt ';' |
            initializationStmt ';'|
            assignmentStmt ';'|
            ifStatement |
            whileStatement |
            displayStatement ';' |
            functionCall ';';

initializationStmt: 'int' IDENTIFIER '=' expression|      
                    'bool' IDENTIFIER '=' boolExpression| 
                    'int' IDENTIFIER '=' functionCall|    
                    'bool' IDENTIFIER '=' functionCall;

declarationStmt : 'int' IDENTIFIER|                       
                  'bool' IDENTIFIER;                      

assignmentStmt : IDENTIFIER '=' boolExpression|           
                 IDENTIFIER '=' expression ;              

ifStatement : 'if' '(' boolExpression ')' '{' statementList '}' |                               
              'if' '(' boolExpression ')' '{' statementList '}' 'else' '{' statementList '}' ;  

whileStatement : 'while' '(' boolExpression ')' '{' statementList '}' ; 

displayStatement : 'display' expression|
                   'display' functionCall; 

relationalExpression : expression '==' expression |
                       expression '!=' expression|
                       expression '<' expression |
                       expression '<=' expression|
                       expression '>' expression |
                       expression '>=' expression|
                       expression '==' BOOLVALUES|
                       expression '!=' BOOLVALUES;

logicalExpression : relationalExpression '&&' relationalExpression |
                    relationalExpression '||' relationalExpression |
                    relationalExpression '&&' logicalExpression |
                    relationalExpression '||' logicalExpression |
                    '!'relationalExpression |
                    '!'logicalExpression;

boolExpression : relationalExpression |
                 logicalExpression |
                 BOOLVALUES;

expression : term '+' expression|
             term '-' expression|
             term;
			 
term : factor '*' term|
       factor '/' term|
       factor '%' term|
       factor;
	   
factor : '(' expression ')' | IDENTIFIER | NUMBER ;

functionDefn : 'func' functionName '(' parameters ')' '{' statementList  returnStatement '}'|
               'func' functionName '(' parameters ')' '{' returnStatement '}'|  ;

functionName : IDENTIFIER;

parameters : declarationStmt ',' parameters |
             declarationStmt |  ;

returnStatement : 'return' expression ';'|
                  'return' boolExpression';'|  ;

functionCall : IDENTIFIER '=' functionName '(' arguments ')'|functionName '(' arguments ')' ;

arguments : IDENTIFIER ',' arguments | NUMBER ',' arguments | NUMBER | IDENTIFIER |  ;

BOOLVALUES : 'true' | 'false' ;
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER :[0-9]+;
WS : [ \t\r\n]+ -> skip ;
MULTICOMMENT : '/*'.*?'*/' -> skip;
SINGLECOMMENT : '//' ~[\r\n]* -> skip;
