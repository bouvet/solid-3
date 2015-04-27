using System;

namespace RefactoredSolid.LSP.Example1
{
    public class Penguin : NonFlyingBird
    {
        public override void Eat()
        {
            Console.WriteLine("Eating");
        }
    }
}
