grammar	calc;
//语句
program
	:	stmts end	;

stmts		// 多行合法语句
	//	stmt+
	:	(stmt | ifelse)+
	;


ifelse 
	:	'if ' judge ':' NEWLINE stmts NEWLINE 'else:' NEWLINE stmts
	;

judge
	:	factor MORETHAN factor
	|	factor LESSTHAN factor
	| 	factor EQL EQL factor
	;

end			// 结束语句
	:	'write' '(' ID ')' '.'
	;

stmt 		// 单行合法语句，不包括ifelse
	:	type ID ';'
	|	'write' '(' ID ')' ';'
	|	ID EQL exp ';'
	|	NEWLINE
	;


type 		// 数据类型
	:	'int '	
	|	'float '
	;


//算术表示式
factor
	:	'(' exp ')'	
	|	floattype
	|	inttype
	|	ID
	;

exp
	:	exp ADD term
	|	exp SUB term
	|	term
	;

term
	:	term DIV factor
	|	term MUL factor
	|	factor
	;


//字符
chars
	:	CHAR+
	;


//数
floattype
	://	inttype '.' DIGIT+	
	//inttype '.' digits	
	inttype demical	
	;

demical
	:	'.' digits
	;

inttype
	:	NOZERO DIGIT+
	|	DIGIT+
	//	'0'	
	//	digits
	//	DIGIT
	;

digits
	:	DIGIT+	;




MUL	:	'*'	;
DIV	:	'/'	;
ADD	:	'+'	;
SUB	:	'-'	;
EQL	:	'='	;
MORETHAN	:	'>'	;
LESSTHAN	:	'<'	;
ID	:	LETTER CHAR*	;
LETTER
	:	[a-zA-Z_]	
	;

DIGIT
	:	[0-9]	
	;

NOZERO
	:	[1-9]
	;

CHAR
	:	LETTER
	|	DIGIT
	;

NEWLINE
	:	'\r'? '\n'	;

WS	:	[ \t\r\n]+	->	skip;