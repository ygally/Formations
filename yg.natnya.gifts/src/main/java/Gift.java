/**
 * 1 raison de changer cette classe :
 * - stockage/maniement/lecture de la valeur numérique du prix en euros.
 */
public class Gift {
    private float price;
    public Gift(float price) {
        this.price = price;
    }
    public float getEuroPrice() {
        return price;
    }
}
