// Last updated: 15/09/2026, 16:19:40
1class Solution {
2    public int countTriplets(int[] nums) {
3
4        int MAX = 1 << 16;
5
6        int[] count = new int[MAX];
7
8        for (int x : nums) {
9            for (int y : nums) {
10                count[x & y]++;
11            }
12        }
13
14        int answer = 0;
15
16        for (int x : nums) {
17
18            for (int mask = 0; mask < MAX; mask++) {
19
20                if ((mask & x) == 0) {
21                    answer += count[mask];
22                }
23            }
24        }
25
26        return answer;
27    }
28}