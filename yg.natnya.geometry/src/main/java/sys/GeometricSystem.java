package sys;

import geo.Client;
import geo.Rectangle;

public class GeometricSystem {
    public static void main(String[] args) {
        Client client = new Client();
        Rectangle rect = client.createRectangle(9, 24);
        Rectangle sq = client.createSquare(27);
        System.out.println(" Rectangle d'aire "+rect.getArea()+" [attended 216]");
        System.out.println(" Carré d'aire "+sq.getArea()+" [attended 729]");
        // thumbnails
        Rectangle rectPITI = client.createRectangle(rect.getWidth(), rect.getHeight());
        rectPITI.reduction(3);
        Rectangle sqPITI = client.createSquare(sq.getWidth());
        sqPITI.reduction(3);
        System.out.println(" mini Rectangle d'aire "+rectPITI.getArea()+" [attended 24]");
        System.out.println(" mini Carré d'aire "+sqPITI.getArea()+" [attended 81]");
    }
}
