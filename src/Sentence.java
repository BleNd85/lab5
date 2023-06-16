import java.util.Map;
import java.util.TreeMap;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    private static final String PUNCTUATION = "\\p{Punct}";

    public Sentence(String sentences) {
        String[] sentenceMember = sentences.split("(?=" + PUNCTUATION + ")| ");
        sentenceMembers = new SentenceMember[sentenceMember.length];
        for (int i = 0; i < sentenceMember.length; i++) {
            if (sentenceMember[i].matches(PUNCTUATION)) {
                sentenceMembers[i] = new Punctuation(sentenceMember[i]);
            } else {
                sentenceMembers[i] = new Word(sentenceMember[i]);
            }
        }
    }

    public static void sortByAmountOfWords(Sentence[] sentences) {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence);
        }
        String[] textSplit = text.toString().trim().split("(?<=[.?!])");
        int[] amountOfWords = new int[textSplit.length];
        for (int i = 0; i < textSplit.length; i++) {
            amountOfWords[i] = textSplit[i].trim().split("\\s+").length;
        }
        Map<Integer, String> sentenceMap = new TreeMap<>();
        for (int i = 0; i < textSplit.length; i++) {
            sentenceMap.put(amountOfWords[i], textSplit[i]);
        }
        StringBuilder sortedText = new StringBuilder();
        for (String s : sentenceMap.values()) {
            sortedText.append(s.trim()).append(" ");
        }
        System.out.println(sortedText);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember.getClass().isAssignableFrom(Word.class)) {
                string.append(" ");
            }
            string.append(sentenceMember);
        }
        return string.toString();
    }
}
