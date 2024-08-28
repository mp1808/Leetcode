class Solution {
    public int reverse(int x) {
        long z = 0;
        while (x != 0) {
            int r = x % 10;
            z = z * 10 + r;
            x = x / 10;
        }
        if (z > Integer.MAX_VALUE || z < Integer.MIN_VALUE) {
            return 0; 
        } else {
            return (int) z; 
        }
    }
}