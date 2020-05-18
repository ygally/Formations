package geo;

import org.apache.commons.lang3.StringUtils;

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
    public String draw() {
        final StringBuilder sb = new StringBuilder();
        sb.append("+----------+\n");
        sb.append("| ");
        sb.append(StringUtils.rightPad(String.valueOf(getArea()), 9, " "));
        sb.append("|\n");
        sb.append("+----------+");
        return sb.toString();
    }
}