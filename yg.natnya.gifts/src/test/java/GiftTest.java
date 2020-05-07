import static org.junit.Assert.*;

public class GiftTest {
    @org.junit.Test
    public void getPrice() {
        assertEquals("Price of 1st gift should has a value of '4.5 €'",
                "4.5 €",
                new Gift(4.50f).getPrice());
    }
}