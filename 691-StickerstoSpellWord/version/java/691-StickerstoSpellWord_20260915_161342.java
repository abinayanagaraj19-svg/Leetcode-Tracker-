// Last updated: 15/09/2026, 16:13:42
1class Solution {
2    public int minStickers(String[] stickers, String target) {
3
4        int n = target.length();
5        int total = 1 << n;
6
7        int[] dp = new int[total];
8
9        for (int i = 0; i < total; i++) {
10            dp[i] = n + 1;
11        }
12
13        dp[0] = 0;
14
15        int[][] count = new int[stickers.length][26];
16
17        for (int i = 0; i < stickers.length; i++) {
18            for (char c : stickers[i].toCharArray()) {
19                count[i][c - 'a']++;
20            }
21        }
22
23        for (int mask = 0; mask < total; mask++) {
24
25            if (dp[mask] == n + 1) {
26                continue;
27            }
28
29            for (int[] sticker : count) {
30
31                int newMask = mask;
32                int[] temp = sticker.clone();
33
34                for (int i = 0; i < n; i++) {
35
36                    if ((newMask & (1 << i)) == 0) {
37
38                        char c = target.charAt(i);
39
40                        if (temp[c - 'a'] > 0) {
41                            temp[c - 'a']--;
42                            newMask |= (1 << i);
43                        }
44                    }
45                }
46
47                dp[newMask] = Math.min(
48                    dp[newMask],
49                    dp[mask] + 1
50                );
51            }
52        }
53
54        int answer = dp[total - 1];
55
56        return answer == n + 1 ? -1 : answer;
57    }
58}