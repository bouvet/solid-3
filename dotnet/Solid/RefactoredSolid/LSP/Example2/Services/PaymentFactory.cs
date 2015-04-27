using System;
using RefactoredSolid.LSP.Example2.Domain;

namespace RefactoredSolid.LSP.Example2.Services
{
    public class PaymentFactory
    {
        public static Payment GetPayment(PaymentType paymentServiceType)
        {
            switch (paymentServiceType)
            {
                case PaymentType.PayPal:
                    return new PayPalPayment("...", "Passw0rd");
                case PaymentType.WorldPay:
                    return new WorldPayPayment("...", "Passw0rd", "ABC");
                default:
                    throw new NotSupportedException("No such service");
            }
        }
    }
}
