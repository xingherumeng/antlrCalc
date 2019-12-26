# antlrCalc
antlr是一个根据文法生成代码的工具。用户自己定义一个文法，antlr便可以对于这个文法自动生成java代码。（我的理解）

## 基本语法

```
//一个简易的例子
grammar calc;	//文法名字，后打分号

//首先是Parser规则，以小写字母开头
s	:	'hello' end;	//s首先匹配‘hello’字符串，然后匹配非终结符end
end	:	NUM ADD NUM;	//end首先匹配一个长度至少为1的数字串，再匹配非终结符ADD，最后匹配一个长度至少为1的数字串

//后面是Lexer规则，以大写字母开头
ADD	:	'+';		//标识符也可以叫Add（当然要与前面匹配所以是ADD）
NUM	:	[0-9]+;
WS	:	[ \t\r\n]+	->	skip;	//	跳过空格、制表符、回车符和换行符
```

## 编译程序

```powershell
java org.antlr.v4.Tool .\Hello.g
& 'C:\Program Files\Java\jdk1.8.0_181\bin\javac.exe' *.java
java org.antlr.v4.gui.TestRig  Hello s -tokens
hello world
^Z
#需要Ctrl+Z结束输入

#另外，如果修改了文法文件需要重新编译
java org.antlr.v4.Tool .\Hello.g
& 'C:\Program Files\Java\jdk1.8.0_181\bin\javac.exe' *.java
```

## 匹配结果

用hello 2+333进行匹配

`java org.antlr.v4.gui.TestRig Hello s -tokens`运行结果

```
hello 2+333
^Z
[@0,0:4='hello',<1>,1:0]	//识别的第0个token，从第0个字符到第4个字符，token值为hello
[@1,6:6='2',<3>,1:6]
[@2,7:7='+',<2>,1:7]
[@3,8:10='333',<3>,1:8]
[@4,13:12='<EOF>',<-1>,2:0]
```

`java org.antlr.v4.gui.TestRig Hello s -tree`运行结果

```
hello 2+333
^Z
(s hello (end 2 + 333))	//用括号区分了树的层次，输出每个token的非终结符名称和token值
```

`java org.antlr.v4.gui.TestRig Hello s -gui`运行结果

![1577190331239](assets/1577190331239.png)

### 注意点：

- antlr优先匹配写在前面的文法

- 必须先写Parser文法后写Lexer文法
  - Parser规则（non-termanal）以小写字母开头
  - Lexer 规则（terminal）以大写字母开始
- 注意文法不要有二义性



## 封装

字符流CharStream，经过词法分析变成Token流，再组装成一棵ParseTree语法树。

只要遍历这棵ParseTree，就可以访问所有的节点，然后继续做代码生成之类的后端的工作。

ANTLR将这些树节点封装成RuleNode的子类。eg：AssignContext, ExprContext

## 接口实现

antlr默认生成Listener接口，由于这里还没有定义Visitor接口，因此生成了4个.java文件。要想在项目中使用这个文法，只需要把这些.java文件复制到项目中合适的位置，然后编写调用代码、Listener（或Visitor）。

想要编译生成Visitor接口，使用以下命令编译

`java org.antlr.v4.Tool -visitor .\calc.g`

antlr工具自动生成了visitor和listener访问的接口，因为antlr本身只提供文法分析的功能，因此要实现计算功能（语义层面的功能），则需要自己写一个类，继承calcBaseListener或calcBaseVisitor类，并对里面的方法具体实现。visitor和listener理论上都可以实现特定的功能，虽然用法有一些区别。这里我选择了visitor模式实现。

## Visitor模式

calcBaseVisitor里的每个方法以非终结符或标签命名，有了标签则会使用标签名。比如这里生成了以下的方法：

```java
@Override public T visitStatement(calcParser.StatementContext ctx) { return visitChildren(ctx); }
@Override public T visitWrite(calcParser.WriteContext ctx) { return visitChildren(ctx); }
@Override public T visitAssign(calcParser.AssignContext ctx) { return visitChildren(ctx); }
@Override public T visitNewline(calcParser.NewlineContext ctx) { return visitChildren(ctx); }
```

注意：

* 如果非终结符中的一条语句定义了标签，那么其中的所有语句都必须定义标签
* 定义了标签的语句对应生成的方法以标签命名而不再是非终结符

calcParser文件里生成了对应的规则：

比如这里有type(), ID()方法，后面还定义了接受和退出的规则

```java
public static class StatementContext extends StmtContext {
    public TypeContext type() {
        return getRuleContext(TypeContext.class,0);
    }
    public TerminalNode ID() { return getToken(calcParser.ID, 0); }
    public StatementContext(StmtContext ctx) { copyFrom(ctx); }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof calcListener ) ((calcListener)listener).enterStatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof calcListener ) ((calcListener)listener).exitStatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStatement(this);
        else return visitor.visitChildren(this);
    }
}
```

最后是在EvalVisitor类里重写方法，实现自己想要的功能。比如这里实现了一条声明语句的语义定义。

```java
// stmt : type ID ';' ; 
@Override
public Double visitStatement(calcParser.StatementContext ctx) {
String id = ctx.ID().getText();
Double value = new Double(0.00000000000000);
vars.put(id,value);
return .0;
}
```




最后：
### 测试用例：

```python
int a;
a = (90*32.333)/4+3;
int n;
n = 20;
if a < n:
write(a);
else:
if a>1:
a = 23333;
else:
n = 1;
write(n);
write(a).
```

（if后依次输入空格，判断语句，‘：’，else后依次输入‘：’，其他语句，支持if-else的嵌套）

然后因为我映射的就是String和Double类型，所以计算结果默认全是Double类型，因此文法文件中加入了float的文法定义反而出错。。。还没想好怎么解决
