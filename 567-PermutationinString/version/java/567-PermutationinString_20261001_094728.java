// Last updated: 01/10/2026, 09:47:28
1import java.util.*;
2
3class Solution {
4    public boolean checkInclusion(String s1, String s2) {
5
6        if (s1.length() > s2.length()) {
7            return false;
8        }
9
10        int[] count1 = new int[26];
11        int[] window = new int[26];
12
13        for (int i = 0; i < s1.length(); i++) {
14            count1[s1.charAt(i) - 'a']++;
15        }
16
17        for (int i = 0; i < s1.length(); i++) {
18            window[s2.charAt(i) - 'a']++;
19        }
20
21        if (Arrays.equals(count1, window)) {
22            return true;
23        }
24
25        for (int i = s1.length(); i < s2.length(); i++) {
26
27            window[s2.charAt(i) - 'a']++;
28
29            window[s2.charAt(i - s1.length()) - 'a']--;
30
31            if (Arrays.equals(count1, window)) {
32                return true;
33            }
34        }
35
36        return false;
37    }
38}