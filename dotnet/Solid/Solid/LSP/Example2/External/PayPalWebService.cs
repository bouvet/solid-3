namespace Solid.LSP.Example2.External
{
    public class PayPalWebService
    {
        public string GetTransactionToken(string username, string password)
        {
            return "PayPal token";
        }

        public string MakeRefund(decimal amount, string transactionId, string token)
        {
            return "Authorized";
        }
    }
}
