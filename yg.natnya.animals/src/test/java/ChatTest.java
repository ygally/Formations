import org.junit.Test;

import static org.junit.Assert.*;

public class ChatTest {
    @Test
    public void testToString() {
        Chat a = new Chat(25);
        String string = a.toString();
        assertTrue(string.contains("Chat"));
        assertTrue(string.contains("poildoux"));
        assertTrue(string.contains("25"));
    }
}