// Last updated: 03/09/2026, 09:52:09
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3
4        int m = dungeon.length;
5        int n = dungeon[0].length;
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        for (int i = 0; i <= m; i++) {
10            for (int j = 0; j <= n; j++) {
11                dp[i][j] = Integer.MAX_VALUE;
12            }
13        }
14
15        dp[m][n - 1] = 1;
16        dp[m - 1][n] = 1;
17
18        for (int i = m - 1; i >= 0; i--) {
19            for (int j = n - 1; j >= 0; j--) {
20
21                int minHealth = Math.min(dp[i + 1][j], dp[i][j + 1])
22                                - dungeon[i][j];
23
24                dp[i][j] = Math.max(1, minHealth);
25            }
26        }
27
28        return dp[0][0];
29    }
30}