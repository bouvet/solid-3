namespace Solid.ISP.Example1
{
    public interface IPersistenceMedium
    {
        string FileName { get; set; }

        string ConnectionString { get; set; }

        void Open();
        string ExecuteQuery(string query);
        string ReadFile();
        void Close();
    }
}
