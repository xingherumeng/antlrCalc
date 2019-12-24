// Generated from .\calc.g by ANTLR 4.5.1
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
	 * Enter a parse tree produced by {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void enterJudge(calcParser.JudgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#judge}.
	 * @param ctx the parse tree
	 */
	void exitJudge(calcParser.JudgeContext ctx);
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
	 * Enter a parse tree produced by {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(calcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(calcParser.StmtContext ctx);
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
	 * Enter a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calcParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(calcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(calcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(calcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(calcParser.TermContext ctx);
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
	 * Enter a parse tree produced by {@link calcParser#floattype}.
	 * @param ctx the parse tree
	 */
	void enterFloattype(calcParser.FloattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#floattype}.
	 * @param ctx the parse tree
	 */
	void exitFloattype(calcParser.FloattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#demical}.
	 * @param ctx the parse tree
	 */
	void enterDemical(calcParser.DemicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#demical}.
	 * @param ctx the parse tree
	 */
	void exitDemical(calcParser.DemicalContext ctx);
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