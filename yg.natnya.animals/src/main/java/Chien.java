class Chien extends Animal {
    int nbPattes;
    int size;
    Chien(int size) {
        super();
        this.nbPattes = 4;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chien " + nbPattes + " pattes, " + size + " cm";
    }
}
