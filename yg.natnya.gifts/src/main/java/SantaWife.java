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
        System.out.println("Le total numérique " + (GIFTS[0].getEuroPrice()+GIFTS[1].getEuroPrice()));
        System.out.println("Falbala.");
    }

}
