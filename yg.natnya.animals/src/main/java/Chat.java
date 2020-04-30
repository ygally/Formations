class Chat extends Animal {
    int nbPattes;
    int size;
    Chat(int size) {
        super(TypeAnimal.CHAT);
        this.nbPattes = 4;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chat " + nbPattes + " pattes, " + size + " cm";
    }
}


