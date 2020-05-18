package sys;

import geo.Client;
import geo.Rectangle;

public class GeometricSystem {
    public static void main(String[] args) {
        Client client = new Client();
        Rectangle rect = client.createRectangle(9, 24);
        System.out.println(" Rectangle d'aire "+rect.getArea()+" [attended 216]");
        //thumbnails
        Rectangle rectPITI = client.createRectangle(rect.getWidth(), rect.getHeight());
        rectPITI.reduction(3);
        System.out.println(" mini Rectangle d'aire "+rectPITI.getArea()+" [attended 24]");
    }
}
