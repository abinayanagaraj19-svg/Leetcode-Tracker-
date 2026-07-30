// Last updated: 30/07/2026, 15:16:22
1import java.util.*;
2
3class Solution {
4
5    private Map<String, Boolean> memo = new HashMap<>();
6
7    public boolean isScramble(String s1, String s2) {
8
9        if (s1.equals(s2))
10            return true;
11
12        String key = s1 + "#" + s2;
13
14        if (memo.containsKey(key))
15            return memo.get(key);
16
17        if (s1.length() != s2.length()) {
18            memo.put(key, false);
19            return false;
20        }
21
22        // Check character frequency
23        int[] count = new int[26];
24
25        for (int i = 0; i < s1.length(); i++) {
26            count[s1.charAt(i) - 'a']++;
27            count[s2.charAt(i) - 'a']--;
28        }
29
30        for (int c : count) {
31            if (c != 0) {
32                memo.put(key, false);
33                return false;
34            }
35        }
36
37        int n = s1.length();
38
39        for (int i = 1; i < n; i++) {
40
41            // Without swapping
42            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
43                isScramble(s1.substring(i), s2.substring(i))) {
44
45                memo.put(key, true);
46                return true;
47            }
48
49            // With swapping
50            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
51                isScramble(s1.substring(i), s2.substring(0, n - i))) {
52
53                memo.put(key, true);
54                return true;
55            }
56        }
57
58        memo.put(key, false);
59        return false;
60    }
61}