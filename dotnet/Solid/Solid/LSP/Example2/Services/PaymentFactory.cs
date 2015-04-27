using System;
using Solid.LSP.Example2.Domain;

namespace Solid.LSP.Example2.Services
{
    public class PaymentFactory
    {
        public static Payment GetPayment(PaymentType paymentServiceType)
        {
            switch (paymentServiceType)
            {
                case PaymentType.PayPal:
                    return new PayPalPayment();
                case PaymentType.WorldPay:
                    return new WorldPayPayment();
                default:
                    throw new NotSupportedException("No such service");
            }
        }
    }
}
