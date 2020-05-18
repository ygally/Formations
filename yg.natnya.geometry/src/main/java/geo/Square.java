
package geo;

public class Square extends Shape {
    public int side;
    public Square(int side) {
        this.side = side;
    }
    public int getArea() {
        return side * side;
    }
    public int getPerimeter() {
        return 4 * side;
    }
    public void reduction(int ratio) {
        side/=ratio;
    }

    public int getSide() {
        return side;
    }
}