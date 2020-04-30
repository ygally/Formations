import java.util.ArrayList;
import java.util.List;

public class Animalerie {
    static List<AnimalCrieur> ANIMALS;
    static{
        ANIMALS = new ArrayList<>(4);
        ANIMALS.add(new ChienCrieur(40));
        ANIMALS.add(new ChienCrieur(25));
        ANIMALS.add(new ChienCrieur(30));
        ANIMALS.add(new ChatCrieur(30));
        ANIMALS.add(new OiseauCrieur(10));
    }
    public static void main(String[] args) {
        new Dresseur().faitCrier(ANIMALS, System.out);
    }
}
