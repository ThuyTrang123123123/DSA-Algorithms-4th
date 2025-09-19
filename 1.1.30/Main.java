import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        boolean[][] a = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (gcd(i, j) == 1) {
                    a[i][j] = true;
                }
                else {
                    a[i][j] = false;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j]) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
