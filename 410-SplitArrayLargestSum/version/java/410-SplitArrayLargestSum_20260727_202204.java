// Last updated: 27/07/2026, 20:22:04
1class Solution {
2
3    public int smallestDistancePair(int[] nums, int k) {
4
5        Arrays.sort(nums);
6
7        int low = 0;
8        int high = nums[nums.length - 1] - nums[0];
9
10        while (low < high) {
11
12            int mid = low + (high - low) / 2;
13
14            if (countPairs(nums, mid) >= k) {
15                high = mid;
16            } else {
17                low = mid + 1;
18            }
19        }
20
21        return low;
22    }
23
24    private int countPairs(int[] nums, int maxDistance) {
25
26        int count = 0;
27        int left = 0;
28
29        for (int right = 0; right < nums.length; right++) {
30
31            while (nums[right] - nums[left] > maxDistance) {
32                left++;
33            }
34
35            count += right - left;
36        }
37
38        return count;
39    }
40}