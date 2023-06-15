public class IsPasswordComplex {
    public static void main(String[] args) {
        System.out.println(isPasswordComplex("Hello World 2023"));
        System.out.println(isPasswordComplex("hello world"));
        System.out.println(isPasswordComplex("hello world 2023"));
        System.out.println(isPasswordComplex("Hello World "));
        System.out.println(isPasswordComplex(""));
    }

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }
}
