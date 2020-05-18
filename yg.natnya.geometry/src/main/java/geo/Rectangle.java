package geo;

public class Rectangle extends Shape {
    private int width;
    private int height;
    Rectangle(){
        width = 0;
        height = 0;
    }
    public int getWidth() {
        return width;
    }
    void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return this.width * this.height;
    }
    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }
    public void reduction(int ratio) {
        setWidth(width / ratio);
        setHeight(height / ratio);
    }
}