using Solid.LSP.Example2.External;

namespace Solid.LSP.Example2.Domain
{
    public class PayPalPayment : Payment
    {
        public string Username { private get; set; }
        public string Password { private get; set; }

        public override string Refund(decimal amount, string transactionId)
        {
            PayPalWebService payPalWebService = new PayPalWebService();
            string token = payPalWebService.GetTransactionToken(Username, Password);
            string response = payPalWebService.MakeRefund(amount, transactionId, token);
            return response;
        }
    }
}
