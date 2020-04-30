class Chien extends Animal {
    int nbPattes;
    int size;
    Chien(int size) {
        super(TypeAnimal.CHIEN);
        this.nbPattes = 4;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chien " + nbPattes + " pattes, " + size + " cm";
    }
}
