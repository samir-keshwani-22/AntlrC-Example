using System.Diagnostics.CodeAnalysis;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace DiscountExample
{
    public class ErrorListener : BaseErrorListener
    {
        public bool HasErrors { get; private set; } = false;

        public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            HasErrors = true;
            Console.WriteLine($"Syntax error at line {line}:{charPositionInLine} - {msg}");
        }
    }

}