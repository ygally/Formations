/**
 * Dans la facture éditée par la comptable (la femme du père noël) les prix sont en nombre flottant.
 */
public class SantaWife {
    static Gift[] GIFTS = new Gift[]{
            new Gift(3.25f),
            new Gift(700.99f)
    };

    public static void main(String[] args) {
        System.out.println("=== Facture ===");
        float price1 = Gift.getNumericPriceFrom(GIFTS[0]);
        float price2 = Gift.getNumericPriceFrom(GIFTS[1]);
        System.out.println("Le total numérique " + (price1+price2));
        System.out.println("Falbala.");
    }

}
