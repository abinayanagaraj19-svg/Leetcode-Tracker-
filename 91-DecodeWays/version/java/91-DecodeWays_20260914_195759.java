// Last updated: 14/09/2026, 19:57:59
1class Solution {
2    public int numDecodings(String s) {
3
4        int n = s.length();
5
6        if (s.charAt(0) == '0') {
7            return 0;
8        }
9
10        int[] dp = new int[n + 1];
11
12        dp[0] = 1;
13        dp[1] = 1;
14
15        for (int i = 2; i <= n; i++) {
16
17            // Take one digit
18            if (s.charAt(i - 1) != '0') {
19                dp[i] += dp[i - 1];
20            }
21
22            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
23
24            if (twoDigit >= 10 && twoDigit <= 26) {
25                dp[i] += dp[i - 2];
26            }
27        }
28
29        return dp[n];
30    }
31}