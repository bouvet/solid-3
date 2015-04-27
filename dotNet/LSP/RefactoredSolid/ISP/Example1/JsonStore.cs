using System;

namespace RefactoredSolid.ISP.Example1
{
    public class JsonStore : IFileConnection, IFileOperation
    {
        public string Filename { get; set; }

        public void Open()
        {
            Console.WriteLine("Opening file");
        }

        public void Close()
        {
            Console.WriteLine("Closing file");
        }

        public string ReadFile()
        {
            return "File content!";
        }
    }
}
