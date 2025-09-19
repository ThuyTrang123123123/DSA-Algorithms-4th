import java.util.Scanner;

public class UpdateBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key;
        System.out.print("Enter a key: ");
        key = scanner.nextInt();

        int arrayLength;
        System.out.print("Enter array length: ");
        arrayLength = scanner.nextInt();

        int[] a = new int[arrayLength];
        System.out.print("Enter a sorted array: ");
        for(int i = 0; i < arrayLength; i++)
            a[i] = scanner.nextInt();

        int firstFoundPosition = rank(key, a);
        if(firstFoundPosition == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("There are " + firstFoundPosition + " numbers that are smaller than key");
        }
        System.out.println("There are " + count(key, a) + " numbers that are equal to key");
    }

    public static int rank(int key, int[] a) {
        int firstFoundPosition = foundPosition(key, a, 0, a.length - 1);
        if (firstFoundPosition == -1) return -1;
        while(a[firstFoundPosition - 1] == key) {
            firstFoundPosition--;
            if(firstFoundPosition == 0) return 0;
        }
        return firstFoundPosition;
    }

    public static int count(int key, int[] a) {
        int firstFoundPosition = rank(key, a);
        if (firstFoundPosition == -1) return 0;
        int lastFoundPosition = firstFoundPosition;
        while(a[lastFoundPosition + 1] == key) {
            lastFoundPosition++;
            if(lastFoundPosition == a.length - 1)
                break;
        }
        return lastFoundPosition - firstFoundPosition + 1;
    }

    public static int foundPosition(int key, int[] a, int left, int right) {
        if(left > right) return -1;

        int mid = left + (right - left) / 2;
        if(key > a[mid]) return foundPosition(key, a, mid + 1, right);
        else if(key < a[mid]) return foundPosition(key, a, left, mid - 1);
        else return mid;
    }
}
