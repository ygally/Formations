import static org.junit.Assert.assertEquals;

public class GiftPrintableTest {
    @org.junit.Test
    public void getPrintablePrice() {
        assertEquals("Price of gift should has a value of '4.5 €'",
                "4.5 €",
                new GiftPrintable(new Gift(4.50f)).getPrice());
    }
}