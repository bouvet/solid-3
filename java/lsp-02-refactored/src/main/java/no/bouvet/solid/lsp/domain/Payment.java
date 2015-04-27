package no.bouvet.solid.lsp.domain;

import java.math.BigDecimal;

public abstract class Payment {

    abstract public Boolean refund(BigDecimal amount, String transactionId);

}
