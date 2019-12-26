// Generated from .\calc.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(calcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(calcParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(calcParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code morethan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorethan(calcParser.MorethanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthan(calcParser.LessthanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreeql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreeql(calcParser.MoreeqlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lesseql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesseql(calcParser.LesseqlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqleql}
	 * labeled alternative in {@link calcParser#judge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqleql(calcParser.EqleqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(calcParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(calcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(calcParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(calcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newline}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(calcParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(calcParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(calcParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intstate}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntstate(calcParser.IntstateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(calcParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(calcParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(calcParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expterm}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpterm(calcParser.ExptermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(calcParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termfactor}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermfactor(calcParser.TermfactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link calcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(calcParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChars(calcParser.CharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#inttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInttype(calcParser.InttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(calcParser.DigitsContext ctx);
}