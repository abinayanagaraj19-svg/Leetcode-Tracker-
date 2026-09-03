// Last updated: 03/09/2026, 16:23:57
1import java.util.*;
2
3class Solution {
4    public int numberOfArithmeticSlices(int[] nums) {
5        int n = nums.length;
6        
7       
8        Map<Long, Integer>[] dp = new HashMap[n];
9        
10        for (int i = 0; i < n; i++) {
11            dp[i] = new HashMap<>();
12        }
13
14        long ans = 0;
15
16        for (int i = 0; i < n; i++) {
17            for (int j = 0; j < i; j++) {
18                
19                long diff = (long) nums[i] - nums[j];
20
21                int count = dp[j].getOrDefault(diff, 0);
22
23                
24                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + count + 1);
25
26                ans += count;
27            }
28        }
29
30        return (int) ans;
31    }
32}