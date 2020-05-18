package geo;

public class Square extends Rectangle {
    @Override
    void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
