public class OiseauCrieur extends Oiseau implements AnimalCrieur {
    OiseauCrieur(int size) {
        super(size);
    }

    public void crie() {
        System.out.println(this.toString() + " : cui cui cui!!!");
    }
}
