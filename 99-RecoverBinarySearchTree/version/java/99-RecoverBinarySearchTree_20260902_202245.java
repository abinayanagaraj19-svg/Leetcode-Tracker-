// Last updated: 02/09/2026, 20:22:45
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones = 0;
4        int twos = 0;
5
6        for (int num : nums) {
7
8            ones = (ones ^ num) & ~twos;
9
10            twos = (twos ^ num) & ~ones;
11        }
12
13        return ones;
14    }
15}