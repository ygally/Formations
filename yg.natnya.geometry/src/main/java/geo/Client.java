package geo;

public class Client {
    public Rectangle createRectangle(int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        return rectangle;
    }
}
