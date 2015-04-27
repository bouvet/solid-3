using Solid.LSP.Example2.Domain;

namespace Solid.LSP.Example2.Services
{
    public class RefundService
    {
        public bool Refund(PaymentType paymentServiceType,
                           decimal amount,
                           string transactionId)
        {
            Payment payment = PaymentFactory.GetPayment(paymentServiceType);
            bool refundSuccess = false;

            if (payment is PayPalPayment)
            {
                ((PayPalPayment) payment).Username = "...";
                ((PayPalPayment) payment).Password = "Passw0rd";
            }
            else if (payment is WorldPayPayment)
            {
                ((WorldPayPayment) payment).Username = "...";
                ((WorldPayPayment) payment).Password = "Passw0rd";
                ((WorldPayPayment) payment).ProductId = "ABC";
            }

            string serviceResponse = payment.Refund(amount, transactionId);

            if (serviceResponse.Contains("Auth") || serviceResponse.Contains("Success"))
            {
                refundSuccess = true;
            }

            return refundSuccess;
        }
    }
}
