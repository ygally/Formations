package yg.natnya.honivo;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void calculTotalSurfaceFromHome() {
        int surf = new Calculator(new Interface() {
            public Home getHome(int index) {
                return new Gson().fromJson("{nbFloors:4,surface:5}", Home.class);
            }
        }).calculTotalSurfaceFromHome();
        Assert.assertEquals("surf should be 20", 20, surf);
    }
}