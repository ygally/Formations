package geo;

public class Client {
    public Rectangle createRectangle(int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        return rectangle;
    }
    public Rectangle createSquare(int side) {
        Square square = new Square();
        square.setWidth(side);
        return square;
    }
}
