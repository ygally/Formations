class ChienCrieur extends Chien implements AnimalCrieur{
    ChienCrieur(int size) {
        super(size);
    }

    public String crie() {
        return "baw baw baw!!";
    }
}
