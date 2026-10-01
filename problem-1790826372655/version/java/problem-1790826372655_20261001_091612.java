// Last updated: 01/10/2026, 09:16:12
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
5
6            int j;
7
8            for (j = 0; j < needle.length(); j++) {
9
10                if (haystack.charAt(i + j) != needle.charAt(j)) {
11                    break;
12                }
13            }
14
15            if (j == needle.length()) {
16                return i;
17            }
18        }
19
20        return -1;
21    }
22}