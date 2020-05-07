/**
 * 2 raisons de changer cette classe :
 * - format d'affichage de la lettre du père noël
 * - format de traitement des prix pour la facturation
 */
public class Gift {
    private float price;

    public Gift(float price) {
        this.price = price;
    }

    static float getNumericPriceFrom(Gift gift) {
        return Float.parseFloat(gift.getPrice().replace(" €", ""));
    }

    public String getPrice() {
        return price + " EUR";
    }
}
