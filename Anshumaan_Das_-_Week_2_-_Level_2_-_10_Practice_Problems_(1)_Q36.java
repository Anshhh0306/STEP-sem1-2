public class W2L2Q36 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}