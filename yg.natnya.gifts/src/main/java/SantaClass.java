/**
 * Dans la lettre du père noël les prix sont en Euros (avec le signe €)
 */
public class SantaClass {
    static Gift[] GIFTS = new Gift[]{
            new Gift(3.25f),
            new Gift(700.99f)
    };
    public static void main(String[] args) {
        System.out.println("Cher Parents!");
        System.out.println("J'ai un cadeau pas cher pas cher : "+GIFTS[0].getPrice());
        System.out.println("Et j'ai un cadeau de ouf : "+GIFTS[1].getPrice());
        System.out.println("Le Père Noel.");
    }
}
