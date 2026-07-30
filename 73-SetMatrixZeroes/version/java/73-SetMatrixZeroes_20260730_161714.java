// Last updated: 30/07/2026, 16:17:14
1class Solution {
2    public String shortestPalindrome(String s) {
3
4        String rev = new StringBuilder(s).reverse().toString();
5        String str = s + "#" + rev;
6
7        int[] lps = new int[str.length()];
8
9        for (int i = 1; i < str.length(); i++) {
10            int j = lps[i - 1];
11
12            while (j > 0 && str.charAt(i) != str.charAt(j)) {
13                j = lps[j - 1];
14            }
15
16            if (str.charAt(i) == str.charAt(j)) {
17                j++;
18            }
19
20            lps[i] = j;
21        }
22
23        return rev.substring(0, s.length() - lps[str.length() - 1]) + s;
24    }
25}