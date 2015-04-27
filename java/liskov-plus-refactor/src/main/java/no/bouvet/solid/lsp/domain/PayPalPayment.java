package no.bouvet.solid.lsp.domain;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.external.PayPalWebService;

public class PayPalPayment extends Payment {

    private String username;
    private String password;

    public PayPalPayment(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Boolean refund(BigDecimal amount, String transactionId) {
        PayPalWebService payPalWebService = new PayPalWebService();
        String token = payPalWebService.getTransactionToken(username, password);
        String response = payPalWebService.makeRefund(amount, transactionId, token);
        return response.contains("Authorized");
    }

}
