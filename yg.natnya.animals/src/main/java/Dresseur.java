import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Dresseur {
    void faitCrier(List<AnimalCrieur> animals, PrintStream out) {
        for (AnimalCrieur animal: animals) {
            out.println(animal.toString() + " : " +animal.crie());
        }
    }
}
