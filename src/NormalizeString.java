public class NormalizeString {
    public static void main(String[] args) {
        System.out.println(normalizeString("   Hello, BUDDY "));
    }

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }
}
