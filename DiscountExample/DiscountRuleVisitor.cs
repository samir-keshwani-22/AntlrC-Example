// namespace DiscountExample
// {
//     public class DiscountRuleVisitor : DiscountRulesBaseVisitor<object>
//     {
//         public override object VisitRule(DiscountRulesParser.RuleContext context)
//         {
//             string product = context.condition().STRING().GetText().Trim('"');

//             string discountText = context.action().discount().NUMBER().GetText();
//             int discount = int.Parse(discountText);

//             Console.WriteLine($"Apply {discount}% discount to {product}");
//             return null;
//         }
//     }
// }