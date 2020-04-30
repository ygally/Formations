import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DresseurTest {
    @Test
    public void faitCrier() throws UnsupportedEncodingException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final String utf8 = StandardCharsets.UTF_8.name();
        try (PrintStream ps = new PrintStream(baos, true, utf8)) {
            AnimalCrieur babyCat = new ChatCrieur(12);
            new Dresseur().faitCrier(Arrays.asList(babyCat), ps);
            assertTrue(baos.toString(utf8).contains("mia"));
        }
    }
}