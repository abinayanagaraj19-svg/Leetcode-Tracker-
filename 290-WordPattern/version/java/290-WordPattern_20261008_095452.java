// Last updated: 08/10/2026, 09:54:52
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3
4        String[] words = s.split(" ");
5
6        if (pattern.length() != words.length) {
7            return false;
8        }
9
10        String[] map = new String[26];
11
12        for (int i = 0; i < pattern.length(); i++) {
13
14            char c = pattern.charAt(i);
15
16            if (map[c - 'a'] == null) {
17
18                for (int j = 0; j < 26; j++) {
19
20                    if (map[j] != null && map[j].equals(words[i])) {
21                        return false;
22                    }
23                }
24
25                map[c - 'a'] = words[i];
26
27            } else {
28
29                if (!map[c - 'a'].equals(words[i])) {
30                    return false;
31                }
32            }
33        }
34
35        return true;
36    }
37}