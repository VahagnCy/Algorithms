import java.util.HashMap;
import java.util.Map;

public class WordCountingInText {
    public static void main(String[] args) {
        String text = "This is a sample text. Sample, text is useful for testing purposes.";

        Map<String, Integer> wordFrequency = countWordFrequency(text);

        // Displaying the word frequency
        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            System.out.println(word + ": " + frequency);
        }
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            // Remove punctuation and convert to lowercase for better counting accuracy
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                wordFrequency.put(cleanedWord, wordFrequency.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        return wordFrequency;
    }
}


