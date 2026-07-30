// Last updated: 30/07/2026, 15:16:59
1class Solution {
2    public int numDistinct(String s, String t) {
3
4        int m = s.length();
5        int n = t.length();
6
7        long[][] dp = new long[m + 1][n + 1];
8
9        // Empty string t can always be formed
10        for (int i = 0; i <= m; i++) {
11            dp[i][0] = 1;
12        }
13
14        for (int i = 1; i <= m; i++) {
15            for (int j = 1; j <= n; j++) {
16
17                if (s.charAt(i - 1) == t.charAt(j - 1)) {
18                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
19                } else {
20                    dp[i][j] = dp[i - 1][j];
21                }
22
23            }
24        }
25
26        return (int) dp[m][n];
27    }
28}