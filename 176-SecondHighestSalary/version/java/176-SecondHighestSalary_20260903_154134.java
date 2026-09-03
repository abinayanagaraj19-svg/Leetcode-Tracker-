// Last updated: 03/09/2026, 15:41:34
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3
4        int n = triangle.size();
5
6        int[] dp = new int[n];
7
8        for (int i = 0; i < n; i++) {
9            dp[i] = triangle.get(n - 1).get(i);
10        }
11
12        for (int row = n - 2; row >= 0; row--) {
13
14            for (int col = 0; col <= row; col++) {
15
16                dp[col] = triangle.get(row).get(col)
17                        + Math.min(dp[col], dp[col + 1]);
18            }
19        }
20
21        return dp[0];
22    }
23}