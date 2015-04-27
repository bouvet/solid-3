using System;

namespace RefactoredSolid.LSP.Example1
{
    public class Duck : FlyingBird
    {
        public override void Eat()
        {
            Console.WriteLine("Eating");
        }

        public override void Fly()
        {
            Console.WriteLine("Flying");
        }
    }
}
