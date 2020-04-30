import java.util.ArrayList;
import java.util.List;

class Dresseur {
    void faitCrier(List<AnimalCrieur> animals) {
        for (AnimalCrieur animal: animals) {
            animal.crie();
        }
    }
}
