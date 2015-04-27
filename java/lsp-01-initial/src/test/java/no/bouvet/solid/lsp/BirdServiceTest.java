package no.bouvet.solid.lsp;

import java.util.Arrays;
import java.util.List;

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
        subject.feedThemAll(allBirds());
    }

    @Test
    public void testLetThemGo() {
        subject.letThemGo(allBirds());
    }

    private List<Bird> allBirds() {
        return Arrays.asList(new Duck(), new Penguin(), new Crow());
    }

}
