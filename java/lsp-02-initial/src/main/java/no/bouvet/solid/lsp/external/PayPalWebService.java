package no.bouvet.solid.lsp.external;

import java.math.BigDecimal;

public class PayPalWebService {

    public String getTransactionToken(String username, String password) {
        return "Paypal token";
    }

    public String makeRefund(BigDecimal amount, String transactionId, String token) {
        return "Authorized";
    }

}
