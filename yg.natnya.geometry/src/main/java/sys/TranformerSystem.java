package sys;

import geo.Circle;
import geo.Client;
import geo.Shape;
import geo.Square;

import java.util.ArrayList;
import java.util.List;

public class TranformerSystem {
    public static void main(String[] args) {
        Client client = new Client();
        DrawerSystem drawer = new DrawerSystem();
        List<Shape> shapes = new ArrayList<Shape>(4);
        shapes.add(client.createRectangle(6, 4));
        shapes.add(client.createRectangle(8, 10));
        shapes.add(new Square(10));
        shapes.add(new Circle(12));
        drawer.draw(shapes);
        System.out.println("ROTATE 90 + REDUCTION BY 2");
        for (Shape shape:
             shapes) {
            shape.rotate();
            shape.reduction(2);
        }
        drawer.draw(shapes);
    }
}
