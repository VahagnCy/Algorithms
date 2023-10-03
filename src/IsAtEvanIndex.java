public class IsAtEvanIndex {

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(isAtEvanIndex(s, 'L'));
        System.out.println(isAtEvanIndex(s, 'T'));
        System.out.println(isAtEvanIndex(s, 'H'));
        System.out.println(isAtEvanIndex("", 'H'));
        System.out.println(isAtEvanIndex(null, 'H'));

    }

    public static boolean isAtEvanIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for(int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            if(s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }
}
