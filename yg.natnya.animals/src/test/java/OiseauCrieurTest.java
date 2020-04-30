import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OiseauCrieurTest {
    @Test
    public void crie() {
        OiseauCrieur a = new OiseauCrieur(8);
        assertTrue(a.crie().contains("cui"));
    }
}