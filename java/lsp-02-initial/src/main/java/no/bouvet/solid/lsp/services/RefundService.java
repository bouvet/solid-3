package no.bouvet.solid.lsp.services;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.domain.PayPalPayment;
import no.bouvet.solid.lsp.domain.Payment;
import no.bouvet.solid.lsp.domain.WorldPayPayment;

public class RefundService {

    public boolean refund(PaymentType paymentServiceType, BigDecimal amount, String transactionId) {
        Payment payment = PaymentFactory.getPayment(paymentServiceType);
        boolean refundSuccess = false;

        if (payment instanceof PayPalPayment) {
            ((PayPalPayment) payment).setUsername("Andras");
            ((PayPalPayment) payment).setPassword("Passw0rd");
        } else if (payment instanceof WorldPayPayment) {
            ((WorldPayPayment) payment).setUsername("Andras");
            ((WorldPayPayment) payment).setPassword("Passw0rd");
            ((WorldPayPayment) payment).setProductId("ABC");
        }

        String serviceResponse = payment.refund(amount, transactionId);

        if (serviceResponse.contains("Auth") || serviceResponse.contains("Success")) {
            refundSuccess = true;
        }
        return refundSuccess;
    }

}
