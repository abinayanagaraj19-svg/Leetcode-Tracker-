// Last updated: 07/09/2026, 21:28:59
1class Solution {
2    public boolean canJump(int[] nums) {
3
4        if (nums.length == 1) {
5            return true;
6        }
7
8        int r = 0;
9        int n = nums.length - 1;
10
11        for (int i = 0; i < n; i++) {
12
13            if (i > r) {
14                return false;
15            }
16
17            r = Math.max(r, i + nums[i]);
18
19            if (r >= n) {
20                return true;
21            }
22        }
23
24        return false;
25    }
26}