public class Gift {
    static float getNumericPriceFrom(Gift gift) {
        return Float.parseFloat(gift.getPrice().replace(" €", ""));
    }
    private float price;
    public Gift(float price) {
        this.price = price;
    }
    public String getPrice() {
        return price+" €";
    }
}
