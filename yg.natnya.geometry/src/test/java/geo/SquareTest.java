package geo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SquareTest {
    @Test
    public void getArea() {
        Square[] shapes = new Square[]{
                new Square(3),
                new Square(9),
                new Square(2)
        };
        int[] attendedAreas = new int[]{9, 81, 4};
        for (int i = 0; i < shapes.length; ++i) {
            assertEquals("area should be " + attendedAreas[i], attendedAreas[i], shapes[i].getArea());
        }
    }

    @Test
    public void getPerimeter() {
        Square shape = new Square(8);
        assertEquals(32, shape.getPerimeter());
    }

    @Test
    public void verifyReduceBy() {
        Square shape = new Square(27);
        shape.reduceBy(3);
        assertEquals(9, shape.getSide());
    }

    @Test
    public void verifyRotateRight90() {
        Square shape = new Square(8);
        assertEquals(8, shape.getSide());
    }

    @Test
    public void verifyDrawingIsNotEmpty() {
        Square shape = new Square(8);
        assertNotEquals(0, shape.draw().length());
    }
}