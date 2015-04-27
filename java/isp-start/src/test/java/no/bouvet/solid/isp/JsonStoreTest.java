package no.bouvet.solid.isp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JsonStoreTest {

    private JsonStore subject;

    @Before
    public void beforeTest() {
        subject = new JsonStore();
        subject.open();
    }

    @After
    public void afterTest() {
        subject.close();
    }

    @Test
    public void test() {
        // when
        String result = subject.readFile();

        // then
        assertEquals("File content!", result);
    }

}
