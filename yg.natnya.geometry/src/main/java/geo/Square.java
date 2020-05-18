package geo;

import org.apache.commons.lang3.StringUtils;

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
        side /= ratio;
    }

    public void rotate() {
        // turn right 90 does not do anything
    }

    public int getSide() {
        return side;
    }

    public String draw() {
        final StringBuilder sb = new StringBuilder();
        sb.append("  ");
        sb.append(side);
        sb.append("\n");
        sb.append("+----------+\n");
        sb.append("|          |\n");
        sb.append("|   ");
        sb.append(StringUtils.rightPad(String.valueOf(getArea()), 7, " "));
        sb.append("|\n");
        sb.append("|          |\n");
        sb.append("+----------+");
        return sb.toString();
    }
}