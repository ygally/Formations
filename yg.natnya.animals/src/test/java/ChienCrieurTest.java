import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChienCrieurTest {
    @Test
    public void crie() {
        ChienCrieur a = new ChienCrieur(48);
        assertTrue(a.crie().contains("baw"));
    }
}