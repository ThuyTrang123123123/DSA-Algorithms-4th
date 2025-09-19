import java.util.Scanner;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int left, int right, int depth) {
        System.out.println(" ".repeat(depth) + "Left: " + left + " Right: " + right);
        if(left > right) return -1;
        int mid = left + (right - left) / 2;
        if (key < a[mid]) return rank(key, a, left, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, right, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key;
        System.out.print("Enter key: ");
        key = scanner.nextInt();

        int array_length;
        System.out.print("Enter array length: ");
        array_length = scanner.nextInt();

        int[] a = new int[array_length];
        System.out.print("Enter sorted array: ");
        for (int i = 0; i < array_length; i++) {
            a[i] = scanner.nextInt();
        }

        int index = rank(key, a);
        if(index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found at index: " + index);
        }
    }
}
