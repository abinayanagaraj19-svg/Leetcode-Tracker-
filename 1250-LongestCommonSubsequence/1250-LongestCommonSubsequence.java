// Last updated: 09/07/2026, 15:07:50
class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n1 = t1.length();
        int n2 = t2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n1][n2];
    }
}