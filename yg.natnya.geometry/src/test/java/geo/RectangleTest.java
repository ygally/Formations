package geo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        Rectangle[] rectangles = new Rectangle[]{
                clt.createRectangle(3, 5),
                clt.createRectangle(9, 5),
                clt.createRectangle(2, 7)
        };
        int[] attendedAreas = new int[]{15, 45, 14};
        for (int i = 0; i < rectangles.length; ++i) {
            assertEquals("area should be " + attendedAreas[i], attendedAreas[i], rectangles[i].getArea());
        }
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(5);
        assertEquals(16, rectangle.getPerimeter());
    }

    @Test
    public void verifyReduceBy() {
        Rectangle shape = new Rectangle();
        shape.setWidth(12);
        shape.setHeight(4);
        shape.reduceBy(4);
        assertEquals(3, shape.getWidth());
        assertEquals(1, shape.getHeight());
    }

    @Test
    public void verifyRotateRight90() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(5);
        rectangle.rotateRight90();
        assertEquals(5, rectangle.getWidth());
        assertEquals(3, rectangle.getHeight());
    }

    @Test
    public void verifyDrawingIsNotEmpty() {
        Rectangle shape = new Rectangle();
        shape.setWidth(3);
        shape.setHeight(5);
        assertNotEquals(0, shape.draw().length());
    }
}