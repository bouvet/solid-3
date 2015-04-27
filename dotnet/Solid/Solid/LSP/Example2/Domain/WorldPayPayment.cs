using Solid.LSP.Example2.External;

namespace Solid.LSP.Example2.Domain
{
    public class WorldPayPayment : Payment
    {
        public string Username { private get; set; }
        public string Password { private get; set; }
        public string ProductId { private get; set; }

        public override string Refund(decimal amount, string transactionId)
        {
            WorldPayWebService worldPayWebService = new WorldPayWebService();
            string response = worldPayWebService.MakeRefund(amount, transactionId, Username, Password, ProductId);
            return response;
        }
    }
}
