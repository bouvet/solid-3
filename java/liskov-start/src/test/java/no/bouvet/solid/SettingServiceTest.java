package no.bouvet.solid;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SettingServiceTest {

    private SettingService subject;

    @Before
    public void init() {
        subject = new SettingService();
    }

    @Test
    public void testLoadAll() {
        // Given

        // When
        List<String> result = subject.loadAll();

        // Then
        assertEquals(3, result.size());
    }

    @Test
    public void testSaveAll() {
        // Given

        // When
        subject.saveAll();

        // Then
        // No errors should occur :)
    }
}
