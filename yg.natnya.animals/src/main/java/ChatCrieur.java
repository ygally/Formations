public class ChatCrieur extends Chat implements AnimalCrieur{
    ChatCrieur(int size) {
        super(size);
    }

    public void crie() {
        System.out.println(this.toString() + " : miaaaaaaaouh!");
    }
}
