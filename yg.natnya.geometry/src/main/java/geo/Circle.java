package geo;


import org.apache.commons.lang3.StringUtils;

public class Circle extends Shape {
    private int r;
    public Circle(int radius) {
        r = radius;
    }
    public int getArea() {
        return (int)(Math.PI * r * r);
    }
    public int getPerimeter() {
        return 2 * (int)(Math.PI * r);
    }
    public void reduction(int ratio) {

    }
    public String draw() {
        final StringBuilder sb = new StringBuilder();
        sb.append("  +------+\n");
        sb.append("/          \\\n");
        sb.append("| ");
        sb.append(StringUtils.rightPad(String.valueOf(getArea()), 9, " "));
        sb.append("|\n");
        sb.append("\\          /\n");
        sb.append("  +------+");
        return sb.toString();
    }
}
