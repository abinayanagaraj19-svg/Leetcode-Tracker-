// Last updated: 13/10/2026, 19:25:59
1
2class Solution {
3    public long maxAlternatingSum(int[] nums) {
4        long[] a = new long[nums.length];
5
6        for (int i = 0; i < nums.length; i++) {
7            a[i] = (long) nums[i] * nums[i];
8        }
9
10        Arrays.sort(a);
11
12        long ans = 0;
13        int k = nums.length / 2;
14
15        for (int i = 0; i < k; i++) {
16            ans -= a[i];
17        }
18
19        for (int i = k; i < nums.length; i++) {
20            ans += a[i];
21        }
22
23        return ans;
24    }
25}