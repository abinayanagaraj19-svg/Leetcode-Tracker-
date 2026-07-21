// Last updated: 21/07/2026, 20:58:11
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        List<List<Integer>> ans = new ArrayList<>();
6
7        Arrays.sort(nums);
8        int n = nums.length;
9
10        for (int i = 0; i < n - 3; i++) {
11
12            // Skip duplicate first elements
13            if (i > 0 && nums[i] == nums[i - 1])
14                continue;
15
16            for (int j = i + 1; j < n - 2; j++) {
17
18                // Skip duplicate second elements
19                if (j > i + 1 && nums[j] == nums[j - 1])
20                    continue;
21
22                int left = j + 1;
23                int right = n - 1;
24
25                while (left < right) {
26
27                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
28
29                    if (sum == target) {
30                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
31
32                        left++;
33                        right--;
34
35                        // Skip duplicate third elements
36                        while (left < right && nums[left] == nums[left - 1])
37                            left++;
38
39                        // Skip duplicate fourth elements
40                        while (left < right && nums[right] == nums[right + 1])
41                            right--;
42
43                    } else if (sum < target) {
44                        left++;
45                    } else {
46                        right--;
47                    }
48                }
49            }
50        }
51
52        return ans;
53    }
54}