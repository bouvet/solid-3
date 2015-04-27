namespace RefactoredSolid.ISP.Example1
{
    public interface IFileConnection
    {
        string Filename { get; set; }

        void Open();

        void Close();
    }
}
