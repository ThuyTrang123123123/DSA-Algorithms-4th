public class LnFactorial {
    public static double lnFactorial(double N) {
        if (N <= 1)
            return 0.0;
        return Math.log(N) + lnFactorial(N - 1);
    }
}
