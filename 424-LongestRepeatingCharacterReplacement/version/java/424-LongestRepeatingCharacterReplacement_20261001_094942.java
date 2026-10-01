// Last updated: 01/10/2026, 09:49:42
1class Solution {
2    public int characterReplacement(String s, int k) {
3
4        int[] count = new int[26];
5
6        int left = 0;
7        int maxCount = 0;
8        int maxLength = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11
12            count[s.charAt(right) - 'A']++;
13
14            maxCount = Math.max(maxCount,
15                    count[s.charAt(right) - 'A']);
16
17            while ((right - left + 1) - maxCount > k) {
18                count[s.charAt(left) - 'A']--;
19                left++;
20            }
21
22            maxLength = Math.max(maxLength,
23                    right - left + 1);
24        }
25
26        return maxLength;
27    }
28}