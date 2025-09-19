import java.util.Scanner;

public class Gcd {
    public static int gcd(int p, int q) {
        System.out.println("The current value of p is: " + p);
        System.out.println("The current value of q is: " + q);
        System.out.println();
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.print("Enter 2 numbers a and b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(gcd(a, b));
    }
}
