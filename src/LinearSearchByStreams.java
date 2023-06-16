import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchByStreams {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        linearSearch(arr, 1).ifPresent(System.out::println);
        linearSearch(arr, 8).ifPresent(System.out::println);
        linearSearch(arr, 4).ifPresent(System.out::println);
    }

    public static OptionalInt linearSearch(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }
}
