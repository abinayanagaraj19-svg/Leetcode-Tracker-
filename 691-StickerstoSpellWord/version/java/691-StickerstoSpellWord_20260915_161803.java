// Last updated: 15/09/2026, 16:18:03
1class Solution {
2    public int minDeletionSize(String[] strs) {
3
4        int rows = strs.length;
5        int cols = strs[0].length();
6
7        int[] dp = new int[cols];
8
9        for (int i = 0; i < cols; i++) {
10            dp[i] = 1;
11        }
12
13        int maxKeep = 1;
14
15        for (int i = 1; i < cols; i++) {
16
17            for (int j = 0; j < i; j++) {
18
19                boolean valid = true;
20
21                for (int row = 0; row < rows; row++) {
22
23                    if (strs[row].charAt(j) >
24                        strs[row].charAt(i)) {
25
26                        valid = false;
27                        break;
28                    }
29                }
30
31                if (valid) {
32                    dp[i] = Math.max(dp[i], dp[j] + 1);
33                }
34            }
35
36            maxKeep = Math.max(maxKeep, dp[i]);
37        }
38
39        return cols - maxKeep;
40    }
41}