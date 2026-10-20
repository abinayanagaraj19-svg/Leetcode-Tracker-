// Last updated: 20/10/2026, 18:32:02
1
2class Solution {
3    public boolean hasAlternatingBits(int n) {
4        String s = Integer.toBinaryString(n);
5
6        for (int i = 1; i < s.length(); i++) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                return false;
9            }
10        }
11
12        return true;
13    }
14}
15