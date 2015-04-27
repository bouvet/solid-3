namespace RefactoredSolid.ISP.Example1
{
    public interface IDatabaseConnection
    {
        string ConnectionString { get; set; }

        void Open();

        void Close();

    }
}
