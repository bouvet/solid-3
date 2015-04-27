using System;

namespace Solid.ISP.Example1
{
    public class JsonStore : IPersistenceMedium
    {
        public string FileName { get; set; }

        public string ConnectionString
        {
            get
            {
                throw new NotSupportedException("Not supported");
            }
            set
            {
                throw new NotSupportedException("Not supported");                
            }
        }

        public void Open()
        {
            Console.WriteLine("Opening file");
        }

        public string ExecuteQuery(string query)
        {
            throw new NotSupportedException("Not supported");
        }

        public string ReadFile()
        {
            return "File content!";
        }

        public void Close()
        {
            Console.WriteLine("Closing file");
        }
    }
}
