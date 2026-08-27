// Last updated: 27/08/2026, 16:22:25
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        if (s1.length() + s2.length() != s3.length()) {
5            return false;
6        }
7
8        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
9
10        dp[0][0] = true;
11
12        for (int i = 0; i <= s1.length(); i++) {
13            for (int j = 0; j <= s2.length(); j++) {
14
15                if (i == 0 && j == 0) {
16                    continue;
17                }
18
19                if (i > 0 && dp[i - 1][j]
20                        && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
21                    dp[i][j] = true;
22                }
23
24                if (j > 0 && dp[i][j - 1]
25                        && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
26                    dp[i][j] = true;
27                }
28            }
29        }
30
31        return dp[s1.length()][s2.length()];
32    }
33}