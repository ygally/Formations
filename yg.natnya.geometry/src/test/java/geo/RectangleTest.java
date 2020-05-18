package geo;

import geo.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void getAndSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void getAndSetHeight() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void getArea() {
        Client clt = new Client();
        Rectangle[] rectangles = new Rectangle[] {
                clt.createRectangle(3,5),
                clt.createRectangle(9,5),
                clt.createRectangle(2, 7)
        };
        int[] attendedAreas = new int[] {15, 45, 14};
        for (int i=0; i<rectangles.length; ++i) {
            assertEquals("area should be "+attendedAreas[i], attendedAreas[i], rectangles[i].getArea());
        }
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(5);
        assertEquals(16, rectangle.getPerimeter());
    }
}