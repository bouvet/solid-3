package no.bouvet.solid.isp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseStoreTest {

    private DatabaseStore subject;

    @Before
    public void beforeTest() {
        subject = new DatabaseStore();
        subject.open();
    }

    @After
    public void afterTest() {
        subject.close();
    }

    @Test
    public void test() {
        // when
        String result = subject.executeQuery("advancedQuery");

        // then
        assertEquals("Query result!", result);
    }

}
