package no.bouvet.solid.lsp;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import no.bouvet.solid.lsp.services.PaymentType;
import no.bouvet.solid.lsp.services.RefundService;

import org.junit.Before;
import org.junit.Test;

public class RefundServiceTest {
    private RefundService subject;

    @Before
    public void setUp() {
        subject = new RefundService();
    }

    @Test
    public void testRefundPayPal() {
        // when
        Boolean result = subject.refund(PaymentType.PayPal, new BigDecimal(100), "ABC123");

        // then
        assertTrue(result);
    }

    @Test
    public void testRefundWorldPay() {
        // when
        Boolean result = subject.refund(PaymentType.WorldPay, new BigDecimal(100), "ABC123");

        // then
        assertTrue(result);
    }

}
