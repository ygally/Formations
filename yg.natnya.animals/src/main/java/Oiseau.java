class Oiseau extends Animal {
    int nbAiles;
    int size;
    Oiseau(int size) {
        super(TypeAnimal.OISEAU);
        this.nbAiles = 2;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Oiseau " + nbAiles + " ailes, " + size + " cm";
    }
}
