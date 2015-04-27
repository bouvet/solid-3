using System;

namespace Solid.LSP.Example1
{
    public class Penguin : Bird
    {
        public override void Eat()
        {
            Console.WriteLine("Eating");
        }

        public override void Fly()
        {
            throw new NotSupportedException("Nope!");
        }
    }
}
