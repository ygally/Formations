package geo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CircleTest {
    @Test
    public void getArea() {
        Circle[] shapes = new Circle[]{
                new Circle(3),
                new Circle(9),
                new Circle(2)
        };
        int[] attendedAreas = new int[]{(int) (9 * Math.PI), (int) (81 * Math.PI), (int) (4 * Math.PI)};
        for (int i = 0; i < shapes.length; ++i) {
            assertEquals("area should be " + attendedAreas[i], attendedAreas[i], shapes[i].getArea());
        }
    }

    @Test
    public void getPerimeter() {
        Circle shape = new Circle(8);
        assertEquals((int) (16 * Math.PI), shape.getPerimeter());
    }

    @Test
    public void verifyReduceBy() {
        Circle shape = new Circle(9);
        shape.reduceBy(3);
        assertEquals(3, shape.getRadius());
        shape = new Circle(64);
        shape.reduceBy(8);
        assertEquals(8, shape.getRadius());
    }

    @Test
    public void verifyRotateRight90() {
        Circle shape = new Circle(12);
        assertEquals(12, shape.getRadius());
    }

    @Test
    public void verifyDrawingIsNotEmpty() {
        Circle shape = new Circle(11);
        assertNotEquals(0, shape.draw().length());
    }
}