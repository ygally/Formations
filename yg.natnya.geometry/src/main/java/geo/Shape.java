package geo;

public abstract class Shape {
    public abstract int getArea(); // metrics
    public abstract int getPerimeter(); // metrics
    public abstract String draw(); // drawing
    public abstract void reduction(int ratio); // transform
    public abstract void rotate(); // transform
}
