grammar	calc;
//语句
program
	:	stmts end	;

stmts		// 多行合法语句
	:	(stmt | ifelse)+
	;


ifelse 
	:	'if ' judge ':' NEWLINE stmts  'else:' stmts
	;

judge
	:	factor MORETHAN factor	# morethan
	|	factor LESSTHAN factor	# lessthan
	|	factor MOREEQL factor	# moreeql
	|	factor LESSEQL factor	# lesseql
	| 	factor EQL EQL factor	# eqleql
	;

end			// 结束语句
	:	'write' '(' ID ')' '.'
	;

stmt 		// 单行合法语句，不包括ifelse
	:	type ID ';'				# statement
	|	'write' '(' ID ')' ';'	# Write
	|	ID EQL exp ';'			# assign
	|	NEWLINE					# newline
	;


type 		// 数据类型
	:	'int '	
	|//	'float '
	;


//算术表示式
factor
	:	'(' exp ')'			# paren
	//	floattype			//# floatstate
	|	inttype				# intstate
	|	ID					# id
	;

exp
	:	exp ADD term			# add
	|	exp SUB term			# sub
	|	term					# expterm
	;

term
	:	term MUL factor			# mul
	|	term DIV factor			# div
	|	factor					# termfactor
	;


//字符
chars
	:	CHAR+
	;


//数
//floattype
//	://	inttype '.' DIGIT+
//	inttype demical	
//	;

//demical
//	:	'.' digits
//	;

inttype
	:	NOZERO DIGIT+
	|	DIGIT+
	//	'0'	
	;

digits
	:	DIGIT+	;


MUL	:	'*'	;
DIV	:	'/'	;
ADD	:	'+'	;
SUB	:	'-'	;
EQL	:	'='	;
MORETHAN	:	'>'		;
LESSTHAN	:	'<'		;
MOREEQL		:	'>='	;
LESSEQL		:	'<='	;
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