public class histogram {
    public static int[] histogram(int[] a, int M) {
        int[] array = new int[M];
        for (int i = 0; i < a.length; i++) {
            array[a[i]]++;
        }
        return array;
    }
}
