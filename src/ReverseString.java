public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse2("Hello World"));
        System.out.println(reverse2(""));
        System.out.println(reverse2(null));
        System.out.println(reverse2("Sally is a great worker"));   //reverse the sentence
        System.out.println(reverseEachWord("Sally is a great worker")); // reverse each word in sentence
        System.out.println(reverse2("what can I do today"));
    }

    public static String reverse(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String reverse2(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        return  sb.reverse().toString();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
    public static String reverseEachWord(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            result.append(reverse(arr[i]));
            if (i != arr.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
