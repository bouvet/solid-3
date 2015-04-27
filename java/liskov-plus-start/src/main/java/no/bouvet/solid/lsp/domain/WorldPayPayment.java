package no.bouvet.solid.lsp.domain;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.external.WorldPayWebService;

public class WorldPayPayment extends Payment {

    private String username;
    private String password;
    private String productId;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String refund(BigDecimal amount, String transactionId) {
        WorldPayWebService worldPayWebService = new WorldPayWebService();
        String response = worldPayWebService.makeRefund(amount, transactionId, username, password, productId);
        return response;
    }

}
