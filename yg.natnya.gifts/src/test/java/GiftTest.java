import static org.junit.Assert.*;

public class GiftTest {
    @org.junit.Test
    public void getPrice() {
        assertEquals("Price of 1st gift should has a value of 4.5 in euros",
                Float.floatToIntBits(4.5f),
                Float.floatToIntBits(Gift.getNumericPriceFrom(new Gift(4.50f))));
    }
}