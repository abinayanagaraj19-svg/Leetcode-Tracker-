// Last updated: 01/10/2026, 09:44:36
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5
6        List<Integer> ans = new ArrayList<>();
7
8        if (s.length() < p.length()) {
9            return ans;
10        }
11
12        int[] pCount = new int[26];
13        int[] window = new int[26];
14
15        for (int i = 0; i < p.length(); i++) {
16            pCount[p.charAt(i) - 'a']++;
17        }
18
19        for (int i = 0; i < p.length(); i++) {
20            window[s.charAt(i) - 'a']++;
21        }
22
23        if (Arrays.equals(pCount, window)) {
24            ans.add(0);
25        }
26
27        for (int i = p.length(); i < s.length(); i++) {
28
29            window[s.charAt(i) - 'a']++;
30
31            window[s.charAt(i - p.length()) - 'a']--;
32
33            if (Arrays.equals(pCount, window)) {
34                ans.add(i - p.length() + 1);
35            }
36        }
37
38        return ans;
39    }
40}