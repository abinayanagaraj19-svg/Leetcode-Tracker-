// Last updated: 04/09/2026, 21:05:40
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3
4        int n = s.length();
5        int[] count = new int[26];
6
7        for (char c : s.toCharArray()) {
8            count[c - 'a']++;
9        }
10
11        int matched = 0;
12
13        while (matched < n) {
14            int idx = target.charAt(matched) - 'a';
15
16            if (count[idx] == 0) {
17                break;
18            }
19
20            count[idx]--;
21            matched++;
22        }
23
24        for (int i = matched; i >= 0; i--) {
25
26            if (i < matched) {
27                count[target.charAt(i) - 'a']++;
28            }
29
30            if (i == n) {
31                continue;
32            }
33
34            int targetChar = target.charAt(i) - 'a';
35
36            for (int c = targetChar + 1; c < 26; c++) {
37
38                if (count[c] > 0) {
39
40                    StringBuilder ans = new StringBuilder();
41
42                    ans.append(target, 0, i);
43
44                    ans.append((char) ('a' + c));
45
46                    count[c]--;
47
48                    for (int j = 0; j < 26; j++) {
49                        while (count[j] > 0) {
50                            ans.append((char) ('a' + j));
51                            count[j]--;
52                        }
53                    }
54
55                    return ans.toString();
56                }
57            }
58        }
59
60        return "";
61    }
62}