
public class Word implements SentenceMember {
    private Letter[] letters;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder wordToString = new StringBuilder();
        for (Letter letter : letters) {
            wordToString.append(letter);
        }
        return wordToString.toString();
    }
}
