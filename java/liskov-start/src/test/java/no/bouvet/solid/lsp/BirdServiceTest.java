package no.bouvet.solid.lsp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BirdServiceTest {
    private BirdService subject;

    @Before
    public void setUp() {
        subject = new BirdService();
    }

    @Test
    public void testFeedThemAll() {
        subject.feedThemAll();
    }

    @Test
    public void testLetThemGo() {
        subject.letThemGo();
    }

}
