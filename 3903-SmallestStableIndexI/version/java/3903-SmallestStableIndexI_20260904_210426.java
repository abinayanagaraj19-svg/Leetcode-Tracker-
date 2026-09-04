// Last updated: 04/09/2026, 21:04:26
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4
5        int[] right = new int[n];
6
7        right[n - 1] = nums[n - 1];
8
9        for (int i = n - 2; i >= 0; i--) {
10            right[i] = Math.min(right[i + 1], nums[i]);
11        }
12
13        int left = 0;
14
15        for (int i = 0; i < n; i++) {
16            left = Math.max(left, nums[i]);
17
18            if (left - right[i] <= k) {
19                return i;
20            }
21        }
22
23        return -1;
24    }
25}