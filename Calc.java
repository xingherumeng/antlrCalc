import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calc {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("1.txt"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        calcLexer lexer = new calcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calcParser parser = new calcParser(tokens);
        ParseTree tree = parser.program(); // calc is the starting rule



        // System.out.println("LISP:");
        // System.out.println(tree.toStringTree(parser));
        // System.out.println();

        System.out.println("Visitor:");
        EvalVisitor evalByVisitor = new EvalVisitor();
        evalByVisitor.visit(tree);
        System.out.println(tree.toStringTree(parser));

        // System.out.println("Listener:");
        // ParseTreeWalker walker = new ParseTreeWalker();
        // Evaluator evalByListener = new Evaluator();
        // walker.walk(evalByListener, tree);
    }
}