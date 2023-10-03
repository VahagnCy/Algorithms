public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome(""));

    }
    public static Boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) {
            return null;
        }

        StringBuilder reversedString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }

        return reversedString.toString().equals(s.toString()) ? true : false;
    }
}
