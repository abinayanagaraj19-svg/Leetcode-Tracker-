// Last updated: 20/10/2026, 18:15:16
1
2class Solution {
3    public boolean canPartition(int[] nums) {
4        int sum = 0;
5
6        for (int num : nums) {
7            sum += num;
8        }
9
10        if (sum % 2 != 0) {
11            return false;
12        }
13
14        int target = sum / 2;
15
16        boolean[] dp = new boolean[target + 1];
17        dp[0] = true;
18
19        for (int num : nums) {
20            for (int j = target; j >= num; j--) {
21                dp[j] = dp[j] || dp[j - num];
22            }
23        }
24
25        return dp[target];
26    }
27}
28