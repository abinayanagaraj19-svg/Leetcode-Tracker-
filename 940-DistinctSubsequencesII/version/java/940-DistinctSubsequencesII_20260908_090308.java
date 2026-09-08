// Last updated: 08/09/2026, 09:03:08
1class Solution {
2    public int distinctSubseqII(String s) {
3        final int MOD = 1_000_000_007;
4
5        int[] dp = new int[26];
6
7        for (char c : s.toCharArray()) {
8            int index = c - 'a';
9
10            int sum = 0;
11
12            for (int x : dp) {
13                sum = (sum + x) % MOD;
14            }
15
16            dp[index] = (sum + 1) % MOD;
17        }
18
19        int ans = 0;
20
21        for (int x : dp) {
22            ans = (ans + x) % MOD;
23        }
24
25        return ans;
26    }
27}