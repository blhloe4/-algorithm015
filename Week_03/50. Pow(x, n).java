class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return firstPow(x, n);
    }

    private double firstPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = firstPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}