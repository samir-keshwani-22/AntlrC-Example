using System.Net;
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

        var inputs = new List<string>
        {

            // Test cases for the variable name 
            "Q1_count,  Q2_sum",


            // "#{account} is {source} AND #{trans_type} = {Withdrawal , Transfer} AND #{acct_bal + amount} >= {10000} AND #{(amount/(acct_bal + amount))*100} >= {60}"
// trigger examples 

            // "#{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "#{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "#{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT(*)FROM DATAWHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT(*)FROM DATAWHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT(*)FROM DATAWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "#{account} is {dest}   AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT(*) FROM DATA WHERE #{amount} = {50} OR #{currency} = {ALL}"
            // ,

// result examples 
    

            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM transaction date",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{amount} = {50} OR #{currency} = {ALL}"

            // 4 for the result example 
            // "Q1_count >= 3 AND Q1_sum >= 10000",
            // "(Q1_count >= 3 AND Q1_sum >= 10000) OR (Q2_count >= 3 AND Q2_sum >= 10000)",
            // "Q1_sum >= 10000 AND ((Q1_sum-Q2_sum)/Q2_sum)*100 >= 200",
            // "Q2_count > 0 AND Q1_count >= 3 AND (Q1_count/Q2_count)*100 >= 150 AND (Q1_sum/Q2_sum)*100 >= 150",
            // "Q1_count = 5 OR (Q1_count = 5) AND Q1_count <= Q1_count"
            // "Q2_count > 0 AND Q1_count >= 3 AND (Q1_count/Q2_count)*100 >= 150 AND (Q1_sum/Q2_sum)*100 >= 150",
            // "(Q1_count >= 3 AND Q1_sum >= 10000) OR (Q2_count >= 3 AND Q2_sum >= 10000)",
            // "Q1_sum >= 10000 AND ((Q1_sum-Q2_sum)/Q2_sum)*100 >= 200",
            // "Q2_count > 0 AND Q1_count >= 3 AND (Q1_count/Q2_count)*100 >= 150 AND (Q1_sum/Q2_sum)*100 >= 150",
            //  "#{account} is {dest} AND #{trans_type} = {Deposit,Payment}",
            //  "#{account} is {dest} AND #{trans_type} = {Deposit,Payment} AND (#{trans_type} = { } AND ((#{trans_date} = {2025-07-10 10:56:39})))",
            //   "#{account} is {source} AND #{trans_type} = {Withdrawal}",

            // "#{account} is {source} AND #{amount} > {100}", 
            // "#{account} is {dest} AND  #{amount} > {100}", 
            // "QUERY COUNT(*)FROM DATAWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY COUNT(*)FROM DATA WHERE #{account} is {dest} AND #{amount} > {100}",

            // For query example 

            // "QUERY COUNT({trnasaction})FROM DATAPAST 7 day FROM transaction date",

            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{amount} > {100}",
            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {dest} AND #{amount} > {100}",

            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date",

            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{amount} > {100}",
            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY COUNT({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{amount} > {100}",

            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction date",

            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{amount} > {100}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {dest} AND #{amount} > {100}",

            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date WHERE #{amount} > {100}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{amount} > {100}",

            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction date",

            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{amount} > {100}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {dest} AND #{amount} > {100}",

            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date",

            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date WHERE #{amount} > {100}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {source} AND #{amount} > {100}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{amount} > {100}" ,

            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM transaction date",
            // "QUERY COUNT({amount})FROM DATA PAST 7 day FROM transaction date WHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}" ,
            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM transaction date WHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM transaction date WHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date",
            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date WHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}) FROM DATA PAST 7 day FROM 2 hour before transaction date WHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}) FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",

            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction date",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date WHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",

            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction date",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM transaction dateWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction date WHERE #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {source} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}",
            // "QUERY COUNT({amount}), SUM({amount})FROM DATAPAST 7 day FROM 2 hour before transaction dateWHERE #{account} is {dest} AND #{trans_type} = {Deposit} AND #{amount} = {50} OR #{currency} = {ALL}"
        };

        int i = 1;
        foreach (var input in inputs)
        {
            var inputStream = new AntlrInputStream(input);
            var lexer = new VariableNameLexer(inputStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new VariableNameParser(tokenStream);

            var errorListener = new ErrorListener();
            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorListener);

            var tree = parser.start();

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