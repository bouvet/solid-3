using System;

namespace RefactoredSolid.ISP.Example1
{
    public class DatabaseStore : IDatabaseConnection, IDatabaseOperation
    {
        public string ConnectionString { get; set; }
        
        public void Open()
        {
            Console.WriteLine("Opening connection");
        }

        public string ExecuteQuery(string query)
        {
            return "Query result!";
        }

        public void Close()
        {
            Console.WriteLine("Closing connection");
        }
    }
}
