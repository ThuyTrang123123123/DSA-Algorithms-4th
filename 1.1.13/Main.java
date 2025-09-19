public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 5},
                {3, 6, 9, 0},
                {4, 2, 8, 7}
        };

        int M = a.length;
        int N = a[0].length;

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
