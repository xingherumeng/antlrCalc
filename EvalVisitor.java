import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends calcBaseVisitor<Double> {
    public Map<String, Double> vars = new HashMap<>();

    // ifelse : 'if ' judge ':' NEWLINE stmts NEWLINE 'else:' NEWLINE stmts
    //不会
    @Override
    public Double visitIfelse(calcParser.IfelseContext ctx) {
        Double flag = visit(ctx.judge());
        if (Math.abs(flag - 1.0 ) < 0.000002) {
            visit(ctx.stmts(0));
            return .0;
        }

        else {
            visit(ctx.stmts(1));
            return .0;
        }
    }

    // judge : factor MORETHAN factor       # morethan
    @Override
    public Double visitMorethan(calcParser.MorethanContext ctx) {
        Double left = this.visit(ctx.factor(0));
        Double right = this.visit(ctx.factor(1));
        if (left > right) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // judge : factor LESSTHAN factor       #lessthan
    @Override
    public Double visitLessthan( calcParser.LessthanContext ctx) {
        Double left = this.visit(ctx.factor(0));
        Double right = this.visit(ctx.factor(1));
        if (left < right) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // judge : factor MOREEQL factor       #moreeql
    @Override
    public Double visitMoreeql( calcParser.MoreeqlContext ctx) {
        Double left = this.visit(ctx.factor(0));
        Double right = this.visit(ctx.factor(1));
        if (left >= right) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // judge : factor LESSEQL factor       #lesseql
    @Override
    public Double visitLesseql( calcParser.LesseqlContext ctx) {
        Double left = this.visit(ctx.factor(0));
        Double right = this.visit(ctx.factor(1));
        if (left <= right) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // judge : factor EQLEQL factor       #eqleql
    @Override
    public Double visitEqleql( calcParser.EqleqlContext ctx) {
        Double left = this.visit(ctx.factor(0));
        Double right = this.visit(ctx.factor(1));
        if (left == right) {
            return 1.0;
        } else {
            return 0.0;
        }
    }


    // end : 'write' '(' ID ')' '.'
    @Override
    public Double visitEnd(calcParser.EndContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(vars.get(id));
        return .0;
    }

    // stmt : 'write' '(' ID ')' ';'  # Write
    public Double visitWrite(calcParser.WriteContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(vars.get(id));
        return .0;
    }

    // stmt : ID EQL exp ';'
    @Override
    public Double visitAssign(calcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Double val = visit(ctx.exp());
        vars.put(id, val);
        return val;
    }



    // factor : '(' exp ')'         # paren
    @Override
    public Double visitParen(calcParser.ParenContext ctx) {
        return visit(ctx.exp());
    }

    // factor : inttype             # intstate
    @Override
    public Double visitIntstate(calcParser.IntstateContext ctx) {
        return Double.valueOf(ctx.inttype().getText());
    }

    @Override
    public Double visitId(calcParser.IdContext ctx){
        String id = ctx.ID().getText();
        Double value = vars.get(id);
        return value;
    }
    // exp : exp ADD term
    @Override
    public Double visitAdd(calcParser.AddContext ctx) {
        double lhs = visit(ctx.exp());
        double rhs = visit(ctx.term());
        return lhs + rhs;
    }

    // exp : exp SUB term
    @Override
    public Double visitSub(calcParser.SubContext ctx) {
        double lhs = visit(ctx.exp());
        double rhs = visit(ctx.term());
        return lhs - rhs;
    }

    // term : term MUL factor
    @Override
    public Double visitMul(calcParser.MulContext ctx) {
        double lhs = visit(ctx.term());
        double rhs = visit(ctx.factor());
        return lhs * rhs;
    }

    // term : term DIV factor
    @Override
    public Double visitDiv(calcParser.DivContext ctx) {
        double lhs = visit(ctx.term());
        double rhs = visit(ctx.factor());
        if (rhs == 0) //return error;
            return .0;
        else
            return lhs / rhs;
    }

    // floattype : inttype demical 
    // @Override
    // public Double visitFloattype(calcParser.FloattypeContext ctx) {
    //     return Double.valueOf(ctx.getText());
    // }

    // inttype : NOZERO DIGIT+ | DIGIT+
    @Override
    public Double visitInttype(calcParser.InttypeContext ctx) {
        return Double.valueOf(ctx.NOZERO().getText() + ctx.DIGIT(0).getText());
    }

    // stmt : type ID ';'       # statement
    @Override
    public Double visitStatement(calcParser.StatementContext ctx) {
        String id = ctx.ID().getText();
        Double value = new Double(0.000000000000001);
        vars.put(id,value);
        return .0;
    }


    
}