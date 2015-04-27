using RefactoredSolid.LSP.Example2.External;

namespace RefactoredSolid.LSP.Example2.Domain
{
    public class PayPalPayment : Payment
    {
        private readonly string _username;
        private readonly string _password;

        public PayPalPayment(string username, string password)
        {
            _username = username;
            _password = password;
        }

        public override bool Refund(decimal amount, string transactionId)
        {
            PayPalWebService payPalWebService = new PayPalWebService();
            string token = payPalWebService.GetTransactionToken(_username, _password);
            string response = payPalWebService.MakeRefund(amount, transactionId, token);

            return response.Contains("Authorized");
        }
    }
}
