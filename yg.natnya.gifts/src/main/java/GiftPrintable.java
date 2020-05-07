/**
 * 1 raison de changer cette classe :
 * - affichage du prix sur la lettre du père noël.
 */
public class GiftPrintable {
    private final Gift gift;
    GiftPrintable(Gift gift) {
        this.gift = gift;
    }
    public String getPrice() {
        return gift.getEuroPrice() + " EUR";
    }
}
