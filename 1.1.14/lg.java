public class lg {
    public static int lg(int N) {
        int count = 0;
        while (N > 1) {
            count++;
            N /= 2;
        }
        return count;
    }
}
