namespace RefactoredSolid.LSP.Example2.Domain
{
    public abstract class Payment
    {
        abstract public bool Refund(decimal amount, string transactionId);
    }
}
