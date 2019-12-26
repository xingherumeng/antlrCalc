// Generated from .\calc.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(calcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(calcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(calcParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(calcParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(calcParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(calcParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code morethan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterMorethan(calcParser.MorethanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code morethan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitMorethan(calcParser.MorethanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterLessthan(calcParser.LessthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitLessthan(calcParser.LessthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreeql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterMoreeql(calcParser.MoreeqlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreeql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitMoreeql(calcParser.MoreeqlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesseql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterLesseql(calcParser.LesseqlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesseql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitLesseql(calcParser.LesseqlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqleql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterEqleql(calcParser.EqleqlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqleql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitEqleql(calcParser.EqleqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(calcParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(calcParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStatement(calcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStatement(calcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Write}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite(calcParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite(calcParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newline}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNewline(calcParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newline}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNewline(calcParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(calcParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(calcParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParen(calcParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParen(calcParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intstate}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIntstate(calcParser.IntstateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intstate}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIntstate(calcParser.IntstateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterId(calcParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitId(calcParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAdd(calcParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAdd(calcParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSub(calcParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSub(calcParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expterm}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpterm(calcParser.ExptermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expterm}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpterm(calcParser.ExptermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDiv(calcParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDiv(calcParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termfactor}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermfactor(calcParser.TermfactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termfactor}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermfactor(calcParser.TermfactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMul(calcParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMul(calcParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#chars}.
	 * @param ctx the parse tree
	 */
	void enterChars(calcParser.CharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#chars}.
	 * @param ctx the parse tree
	 */
	void exitChars(calcParser.CharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#inttype}.
	 * @param ctx the parse tree
	 */
	void enterInttype(calcParser.InttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#inttype}.
	 * @param ctx the parse tree
	 */
	void exitInttype(calcParser.InttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(calcParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(calcParser.DigitsContext ctx);
}