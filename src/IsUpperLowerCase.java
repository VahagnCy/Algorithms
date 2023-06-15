public class IsUpperLowerCase {

    public static void main(String[] args) {
        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HELLO"));

        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("HELLO"));
    }

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }


}
