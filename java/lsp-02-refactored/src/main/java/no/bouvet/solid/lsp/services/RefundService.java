package no.bouvet.solid.lsp.services;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.domain.Payment;

public class RefundService {

    public boolean refund(PaymentType paymentServiceType, BigDecimal amount, String transactionId) {

        Payment payment = PaymentFactory.getPayment(paymentServiceType);
        return payment.refund(amount, transactionId);

    }

}
