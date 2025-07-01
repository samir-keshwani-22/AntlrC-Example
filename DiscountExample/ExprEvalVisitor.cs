// using Antlr4.Runtime.Misc;

// namespace DiscountExample
// {
//     public class ExprEvalVisitor : ExprBaseVisitor<double>
//     {
//         public override double VisitNumber(ExprParser.NumberContext context)
//         {
//             return double.Parse(context.NUMBER().GetText());
//         }

//         public override double VisitAddSub([NotNull] ExprParser.AddSubContext context)
//         {
//             double left = Visit(context.expr(0));
//             double right = Visit(context.expr(1));
//             return context.op.Type == ExprParser.PLUS ? left + right : left - right;
//         }   

//         public override double VisitMulDiv([NotNull] ExprParser.MulDivContext context)
//         {
//             double left = Visit(context.expr(0));
//             double right = Visit(context.expr(1));
//             return context.op.Type == ExprParser.MUL ? left * right : left / right;
//         }

//         public override double VisitParens([NotNull] ExprParser.ParensContext context)
//         {
//             return Visit(context.expr());
//         }
//     }
// }