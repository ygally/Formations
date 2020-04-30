import org.junit.Test;

import static org.junit.Assert.*;

public class ChatCrieurTest {
    @Test
    public void crie() {
        ChatCrieur a = new ChatCrieur(25);
        assertTrue(a.crie().contains("mia"));
    }
}