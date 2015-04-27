package no.bouvet.solid.lsp.services;

import no.bouvet.solid.lsp.domain.PayPalPayment;
import no.bouvet.solid.lsp.domain.Payment;
import no.bouvet.solid.lsp.domain.WorldPayPayment;

public class PaymentFactory {

    public static Payment getPayment(PaymentType paymentServiceType) {

        switch (paymentServiceType) {
        case PayPal:
            return new PayPalPayment();
        case WorldPay:
            return new WorldPayPayment();
        default:
            throw new UnsupportedOperationException("No such service");
        }

    }

}
