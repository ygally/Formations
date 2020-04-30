public class ChatCrieur extends Chat implements AnimalCrieur{
    ChatCrieur(int size) {
        super(size);
    }

    public String crie() {
        return "miaaaaaaaouh!";
    }
}
