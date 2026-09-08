// Last updated: 08/09/2026, 09:07:30
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3
4        if (prices.length == 0 || k == 0) {
5            return 0;
6        }
7
8        int[][] dp = new int[k + 1][2];
9
10
11        for (int j = 1; j <= k; j++) {
12            dp[j][1] = -prices[0];
13        }
14
15        for (int i = 1; i < prices.length; i++) {
16
17            for (int j = k; j >= 1; j--) {
18
19                dp[j][0] = Math.max(
20                    dp[j][0],
21                    dp[j][1] + prices[i]
22                );
23
24                dp[j][1] = Math.max(
25                    dp[j][1],
26                    dp[j - 1][0] - prices[i]
27                );
28            }
29        }
30
31        return dp[k][0];
32    }
33}