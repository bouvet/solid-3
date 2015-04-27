using RefactoredSolid.LSP.Example2.External;

namespace RefactoredSolid.LSP.Example2.Domain
{
    public class WorldPayPayment : Payment
    {
        private readonly string _username;
        private readonly string _password;
        private readonly string _productId;

        public WorldPayPayment(string username, string password, string productId)
        {
            _username = username;
            _password = password;
            _productId = productId;
        }

        public override bool Refund(decimal amount, string transactionId)
        {
            WorldPayWebService worldPayWebService = new WorldPayWebService();
            string response = worldPayWebService.MakeRefund(amount, transactionId, _username, _password, _productId);
            return response.Contains("Success");
        }
    }
}
