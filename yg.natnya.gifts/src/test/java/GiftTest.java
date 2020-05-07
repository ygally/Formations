import static org.junit.Assert.*;

public class GiftTest {
    @org.junit.Test
    public void getPrice() {
        assertEquals("Price of gift should has a value of '4.5'",
                Float.floatToIntBits(4.5f),
                Float.floatToIntBits(new Gift(4.50f).getEuroPrice()));
    }
}