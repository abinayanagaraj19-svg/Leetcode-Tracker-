// Last updated: 27/07/2026, 20:21:02
1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        int low = 0;
5        int high = 0;
6
7        // Find search range
8        for (int num : nums) {
9            low = Math.max(low, num);
10            high += num;
11        }
12
13        while (low < high) {
14
15            int mid = low + (high - low) / 2;
16
17            if (canSplit(nums, k, mid)) {
18                high = mid;
19            } else {
20                low = mid + 1;
21            }
22        }
23
24        return low;
25    }
26
27    private boolean canSplit(int[] nums, int k, int maxSum) {
28
29        int count = 1;
30        int sum = 0;
31
32        for (int num : nums) {
33
34            if (sum + num > maxSum) {
35                count++;
36                sum = num;
37
38                if (count > k)
39                    return false;
40            } else {
41                sum += num;
42            }
43        }
44
45        return true;
46    }
47}