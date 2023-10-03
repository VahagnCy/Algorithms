public class CalculateArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {10, -5, 8, 4, -45};
        System.out.println((calculateArraySum(array)));
        System.out.println((calculateArraySum(array2)));
    }

    public static int calculateArraySum(int[] arr) {

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

}
