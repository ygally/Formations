package geo;

import org.apache.commons.lang3.StringUtils;

public class Rectangle extends Shape {
    private int width;
    private int height;
    Rectangle() {
        width = 0;
        height = 0;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    void setWidth(int width) {
        this.width = width;
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
        width /= ratio;
        height /= ratio;
    }
    public void rotate() {
        // turn right 90 switches width and height
        int tmp = width;
        width = height;
        height = tmp;
    }

    public String draw() {
        final StringBuilder sb = new StringBuilder();
        sb.append("    ");
        sb.append(width);
        sb.append("\n");
        sb.append("+--------+\n");
        if (height >= width) {
            if (height > width) {
                sb.append("|        |\n");
            }
            sb.append("|        |\n");
        }
        sb.append("|  ");
        sb.append(StringUtils.rightPad(String.valueOf(getArea()), 6, " "));
        sb.append("| " + height + "\n");
        if (height >= width) {
            if (height > width) {
                sb.append("|        |\n");
            }
            sb.append("|        |\n");
        }
        sb.append("+--------+");
        return sb.toString();
    }
}