namespace Solid.LSP.Example2.Domain
{
    public abstract class Payment
    {
        public abstract string Refund(decimal amount, string transactionId);
    }
}
