public class OiseauCrieur extends Oiseau implements AnimalCrieur {
    OiseauCrieur(int size) {
        super(size);
    }

    public String crie() {
        return "cui cui cui!!!";
    }
}
