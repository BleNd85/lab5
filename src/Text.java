public class Text {
    private Sentence[] sentences;

    public Text(String text) {
        String[] splitText = text.split("(?=[.!?]+)| ");
        sentences = new Sentence[splitText.length];
        for (int i = 0; i < splitText.length; i++) {
            sentences[i] = new Sentence(splitText[i]);
        }
    }

    public void sortByAmountOfWords() {
        Sentence.sortByAmountOfWords(sentences);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Sentence sentence : sentences) {
            string.append(sentence.toString());
        }
        return string.toString().strip();
    }
}
