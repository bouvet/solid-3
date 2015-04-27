using System;

namespace Solid.ISP.Example1
{
    public class DatabaseStore : IPersistenceMedium
    {
        public string FileName
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

        public string ConnectionString { get; set; }

        public void Open()
        {
            Console.WriteLine("Opening connection");
        }

        public string ExecuteQuery(string query)
        {
            return "Query result!";
        }

        public string ReadFile()
        {
            throw new NotSupportedException("Not supported");
        }

        public void Close()
        {
            Console.WriteLine("Closing connection");
        }
    }
}
