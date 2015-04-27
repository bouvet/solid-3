using RefactoredSolid.LSP.Example2.Domain;

namespace RefactoredSolid.LSP.Example2.Services
{
    public class RefundService
    {
        public bool Refund(PaymentType paymentServiceType, decimal amount, string transactionId)
        {
            Payment payment = PaymentFactory.GetPayment(paymentServiceType);
            return payment.Refund(amount, transactionId);
        }
    }
}
