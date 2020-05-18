package geo;

public class Circle extends Shape {
    private int r;
    public int getArea() {
        return (int)(Math.PI * r * r);
    }
    public int getPerimeter() {
        return 2 * (int)(Math.PI * r);
    }
}
