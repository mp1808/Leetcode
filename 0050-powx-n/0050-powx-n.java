class Solution {
    public double myPow(double x, int n) {
        long absN = Math.abs((long) n); // Use long to avoid integer overflow
        double result = Math.pow(x, absN);
        return n < 0 ? 1 / result : result;
    }
}