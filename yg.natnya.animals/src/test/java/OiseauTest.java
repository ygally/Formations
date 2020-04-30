import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OiseauTest {
    @Test
    public void testToString() {
        Oiseau a = new Oiseau(12);
        String string = a.toString();
        assertTrue(string.contains("Oiseau"));
        assertTrue(string.contains("ailes"));
        assertTrue(string.contains("12"));
    }
}