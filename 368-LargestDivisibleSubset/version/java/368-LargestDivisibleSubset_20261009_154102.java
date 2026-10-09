// Last updated: 09/10/2026, 15:41:02
1
2import java.util.*;
3
4class Solution {
5    public List<Integer> largestDivisibleSubset(int[] nums) {
6        int n = nums.length;
7
8        Arrays.sort(nums);
9
10        int[] dp = new int[n];
11        int[] prev = new int[n];
12
13        Arrays.fill(dp, 1);
14        Arrays.fill(prev, -1);
15
16        int maxIndex = 0;
17
18        for (int i = 1; i < n; i++) {
19            for (int j = 0; j < i; j++) {
20                if (nums[i] % nums[j] == 0 &&
21                    dp[j] + 1 > dp[i]) {
22
23                    dp[i] = dp[j] + 1;
24                    prev[i] = j;
25                }
26            }
27
28            if (dp[i] > dp[maxIndex]) {
29                maxIndex = i;
30            }
31        }
32
33        List<Integer> result = new ArrayList<>();
34
35        while (maxIndex != -1) {
36            result.add(nums[maxIndex]);
37            maxIndex = prev[maxIndex];
38        }
39
40        return result;
41    }
42}
43