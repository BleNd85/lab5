public class Punctuation implements SentenceMember {
    private String charachter;

    public Punctuation(String character) {
        this.charachter = character;
    }

    @Override
    public String toString() {
        return charachter;
    }
}
