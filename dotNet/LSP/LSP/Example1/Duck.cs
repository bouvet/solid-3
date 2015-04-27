using System;

namespace Solid.LSP.Example1
{
    public class Duck : Bird
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
