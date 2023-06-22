import java.util.HashMap;

public class LetterCountInString {
    public static void main(String[] args) {
        String inputString = "Hello World!";
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            // if the character is already in the hashmap, increment its count
            if (letterCount.containsKey(c)) {
                letterCount.put(c, letterCount.get(c) + 1);
            } else { // otherwise, add the character to the hashmap with count 1
                letterCount.put(c, 1);
            }
        }

        // print out the results
        for (char c : letterCount.keySet()) {
            System.out.println(c + ": " + letterCount.get(c));
        }
    }
}