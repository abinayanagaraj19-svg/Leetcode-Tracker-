// Last updated: 17/07/2026, 09:42:35
1class Solution {
2    public int thirdMax(int[] nums) {
3        long first = Long.MIN_VALUE;
4        long second = Long.MIN_VALUE;
5        long third = Long.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8
9            if (nums[i] == first || nums[i] == second || nums[i] == third) {
10                continue;
11            }
12
13            if (nums[i] > first) {
14                third = second;
15                second = first;
16                first = nums[i];
17            } 
18            else if (nums[i] > second) {
19                third = second;
20                second = nums[i];
21            } 
22            else if (nums[i] > third) {
23                third = nums[i];
24            }
25        }
26
27        if (third == Long.MIN_VALUE) {
28            return (int) first;
29        }
30
31        return (int) third;
32    }
33}