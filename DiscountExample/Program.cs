
using Antlr4.Runtime;
using DiscountExample;

class Program
{
    static void Main(string[] args)
    {
        // string input = "if     then apply 10% discount";
        // // string input = "if product is \"mobile\" then apply 10% discount";
        // AntlrInputStream inputStream = new AntlrInputStream(input);
        // var lexer = new DiscountRulesLexer(inputStream);
        // var tokens = new CommonTokenStream(lexer);
        // var parser = new DiscountRulesParser(tokens);
        // var tree = parser.rules();
        // try
        // {
        //     var visitor = new DiscountRuleVisitor();
        //     visitor.Visit(tree);
        // }
        // catch (Exception ex)
        // {
        //     Console.WriteLine("Error: " + ex.Message);
        // }

        // for mathematical expression 

        string input = "3.5 * 2.1";
        var inputStream = new AntlrInputStream(input);
        var lexer = new ExprLexer(inputStream);
        var tokens = new CommonTokenStream(lexer);
        var parser = new ExprParser(tokens);
        var tree = parser.expr();

        var visitor = new ExprEvalVisitor();
        double result = visitor.Visit(tree);
        Console.WriteLine($"Result: {result}");
    }
}