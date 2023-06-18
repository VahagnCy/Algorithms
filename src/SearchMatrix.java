public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15, 15},
                          {2, 5, 8, 12, 19, 16},
                          {3, 6, 9, 16, 19, 22},
                          {10, 13, 14, 17, 24, 27},
                          {18, 21, 23, 26, 30, 36}};
        System.out.println(searchMatrix(matrix, 14));
    }

    public static boolean searchMatrix(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == k) {
                return true;
            }
            if (matrix[i][j] > k) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
