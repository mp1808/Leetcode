class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        long[] dp = new long[n];
        
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }
        
        for (int i = 1; i < m; i++) {
            long[] newDp = new long[n];
            
            long maxLeft = dp[0];
            for (int j = 0; j < n; j++) {
                maxLeft = Math.max(maxLeft - 1, dp[j]);
                newDp[j] = maxLeft + points[i][j];
            }
            
            long maxRight = dp[n - 1];
            for (int j = n - 1; j >= 0; j--) {
                maxRight = Math.max(maxRight - 1, dp[j]);
                newDp[j] = Math.max(newDp[j], maxRight + points[i][j]);
            }
            
            dp = newDp;
        }
        
        long maxPoints = 0;
        for (int j = 0; j < n; j++) {
            maxPoints = Math.max(maxPoints, dp[j]);
        }
        
        return maxPoints;
    }
}
