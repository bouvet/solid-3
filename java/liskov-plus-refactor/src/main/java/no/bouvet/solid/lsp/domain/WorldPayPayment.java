package no.bouvet.solid.lsp.domain;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.external.WorldPayWebService;

public class WorldPayPayment extends Payment {

    private String username;
    private String password;
    private String productId;

    public WorldPayPayment(String username, String password, String productId) {
        this.username = username;
        this.password = password;
        this.productId = productId;
    }

    @Override
    public Boolean refund(BigDecimal amount, String transactionId) {
        WorldPayWebService worldPayWebService = new WorldPayWebService();
        String response = worldPayWebService.makeRefund(amount, transactionId, username, password, productId);
        return response.contains("Success");
    }

}
