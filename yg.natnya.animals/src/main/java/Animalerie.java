import java.util.ArrayList;
import java.util.List;

public class Animalerie {
    static List<Animal> ANIMALS;
    static{
        ANIMALS = new ArrayList<Animal>(4);
        ANIMALS.add(new Chien(40));
        ANIMALS.add(new Chien(25));
        ANIMALS.add(new Chien(30));
        ANIMALS.add(new Chat(30));
        ANIMALS.add(new Oiseau(10));
    }
    public static void main(String[] args) {
        new Dresseur().faitCrier(ANIMALS);
    }
}
