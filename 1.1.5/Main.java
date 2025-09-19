import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(scanner.nextLine());

        if (0.0 < x && x < 1.0 && 0.0 < y && y < 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
