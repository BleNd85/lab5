public class Letter {
    private char character;

    public Letter(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "" + character;
    }
}
