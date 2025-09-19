import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append(n % 2);
            n /= 2;
        }
        System.out.println(s);
        scanner.close();
    }
}
