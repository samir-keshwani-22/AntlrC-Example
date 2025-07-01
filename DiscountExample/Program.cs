using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using DiscountExample;

class Program
{
    static void Main(string[] args)
    {
        // string input = "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date";

        // AntlrInputStream inputStream = new AntlrInputStream(input);
        // var lexer = new QueryGrammarLexer(inputStream);

        // var tokenStream = new CommonTokenStream(lexer);
        // var parser = new QueryGrammarParser(tokenStream);

        // var errorListener = new ErrorListener();
        // parser.RemoveErrorListeners();
        // parser.AddErrorListener(errorListener);
        // var tree = parser.query();
        // if (errorListener.HasErrors)
        // {
        //     Console.WriteLine(" Input is INVALID according to the grammar.");
        // }
        // else
        // {
        //     Console.WriteLine("  Input is VALID.");
        //     Console.WriteLine(tree.ToStringTree(parser));
        // }

        var inputs = new List<string>{
                "QUERY COUNT(*)\nFROM DATA\nWHERE expression",
                "QUERY COUNT(*)\nFROM DATA\nWHERE #{account} is {source} AND expression",
                "QUERY COUNT(*)\nFROM DATA\nWHERE #{account} is {dest} AND expression",

                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM transaction date",

                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE expression",
                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {dest} AND expression",

                "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date",

                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE expression",
                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY COUNT({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {dest} AND expression",

                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date",

                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE expression",
                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {dest} AND expression",

                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date",
                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\n WHERE expression",
                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {dest} AND expression",

                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date",

                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE expression",
                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM transaction date\nWHERE #{account} is {dest} AND expression",

                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date",

                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\n WHERE expression",
                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {source} AND expression",
                "QUERY COUNT({amount}), SUM({amount})\nFROM DATA\nPAST 7 day FROM 2 hour before transaction date\nWHERE #{account} is {dest} AND expression"
        }; 

        int i = 1;
        foreach (var input in inputs)
        {
            var inputStream = new AntlrInputStream(input);
            var lexer = new QueryGrammarLexer(inputStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new QueryGrammarParser(tokenStream);

            var errorListener = new ErrorListener();
            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorListener);

            var tree = parser.query();

            Console.WriteLine($"Query {i}:");


            if (errorListener.HasErrors)
            {
                Console.WriteLine("INVALID input.");
            }
            else
            {
                Console.WriteLine("VALID input."); 
                Console.WriteLine(tree.ToStringTree(parser));
            }
            Console.WriteLine();
            i++;
        }

    }
}