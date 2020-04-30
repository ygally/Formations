import java.util.ArrayList;
import java.util.List;

class Dresseur {
    void faitCrier(List<Animal> animals) {
        for (Animal animal: animals) {
            switch (animal.type) {
                case CHIEN:
                    new ActionChien().aboie((Chien)animal);
                    break;
                case OISEAU:
                    new ActionOiseau().piaille((Oiseau)animal);
                    break;
            }
        }
    }
}
