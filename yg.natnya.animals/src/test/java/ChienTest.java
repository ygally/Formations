import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChienTest {
    @Test
    public void testToString() {
        Chien a = new Chien(53);
        String string = a.toString();
        assertTrue(string.contains("Chien"));
        assertTrue(string.contains("pattes"));
        assertTrue(string.contains("53"));
    }
}