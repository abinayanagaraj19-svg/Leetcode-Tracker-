// Last updated: 10/10/2026, 11:59:54
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int n = nums1.length, m = 0;
4        long k = (long) k1 + k2;
5        int[] diff = new int[n];
6
7        for (int i = 0; i < n; i++)
8            m = Math.max(m, diff[i] = Math.abs(nums1[i] - nums2[i]));
9
10        int[] bucket = new int[m + 1];
11        for (int x : diff) bucket[x]++;
12
13        for (int i = m; i > 0 && k > 0; i--) {
14            int take = (int) Math.min(bucket[i], k);
15            bucket[i] -= take;
16            bucket[i - 1] += take;
17            k -= take;
18        }
19
20        long ans = 0;
21        for (int i = 1; i <= m; i++)
22            ans += (long) bucket[i] * i * i;
23
24        return ans;
25    }
26}