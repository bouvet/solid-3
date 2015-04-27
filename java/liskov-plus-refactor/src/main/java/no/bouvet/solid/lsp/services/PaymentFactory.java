package no.bouvet.solid.lsp.services;

import no.bouvet.solid.lsp.domain.PayPalPayment;
import no.bouvet.solid.lsp.domain.Payment;
import no.bouvet.solid.lsp.domain.WorldPayPayment;

public class PaymentFactory {

    public static Payment getPayment(PaymentType paymentServiceType) {

        switch (paymentServiceType) {
        case PayPal:
            return new PayPalPayment("Andras", "Passw0rd");
        case WorldPay:
            return new WorldPayPayment("Andras", "Passw0rd", "ABC");
        default:
            throw new UnsupportedOperationException("No such service");
        }

    }

}
