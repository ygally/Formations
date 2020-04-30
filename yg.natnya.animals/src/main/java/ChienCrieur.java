class ChienCrieur extends Chien implements AnimalCrieur{
    ChienCrieur(int size) {
        super(size);
    }

    public void crie() {
        System.out.println(this.toString() + " : baw baw baw!!");
    }
}
