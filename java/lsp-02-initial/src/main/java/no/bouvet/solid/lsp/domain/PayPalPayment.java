package no.bouvet.solid.lsp.domain;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.external.PayPalWebService;

public class PayPalPayment extends Payment {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String refund(BigDecimal amount, String transactionId) {
        PayPalWebService payPalWebService = new PayPalWebService();
        String token = payPalWebService.getTransactionToken(username, password);
        String response = payPalWebService.makeRefund(amount, transactionId, token);
        return response;
    }

}
