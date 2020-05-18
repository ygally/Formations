package sys;

import geo.*;

import java.util.ArrayList;
import java.util.List;

public class DrawerSystem {
    public void draw(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Drawing a shape :\n"+shape.draw());
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
        List<Shape> shapes = new ArrayList<Shape>(4);
        shapes.add(client.createRectangle(9, 11));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        shapes.add(new Square(6));
        new DrawerSystem().draw(shapes);
    }
}
