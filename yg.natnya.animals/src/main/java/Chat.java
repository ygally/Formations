class Chat extends Animal {
    boolean poildoux;
    int size;
    Chat(int size) {
        super();
        poildoux = true;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "poildoux=" + poildoux +
                ", size=" + size +
                '}';
    }
}
