// Last updated: 20/10/2026, 18:13:55
1
2class Solution {
3    public int sortableIntegers(int[] nums) {
4        int n = nums.length;
5
6        int[] prefMax = new int[n + 1];
7        for (int i = 0; i < n; i++) {
8            prefMax[i + 1] = Math.max(prefMax[i], nums[i]);
9        }
10
11        int[] suffMin = new int[n + 1];
12        suffMin[n] = Integer.MAX_VALUE;
13
14        for (int i = n - 1; i >= 0; i--) {
15            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
16        }
17
18        int[] prefDrop = new int[n];
19
20        for (int i = 1; i < n; i++) {
21            prefDrop[i] = prefDrop[i - 1];
22
23            if (nums[i - 1] > nums[i]) {
24                prefDrop[i]++;
25            }
26        }
27
28        int ans = 0;
29
30        for (int i = 1; i <= n / i; i++) {
31            if (n % i == 0) {
32                if (check(nums, prefMax, suffMin, prefDrop, i)) {
33                    ans += i;
34                }
35
36                int other = n / i;
37
38                if (other != i &&
39                    check(nums, prefMax, suffMin, prefDrop, other)) {
40                    ans += other;
41                }
42            }
43        }
44
45        return ans;
46    }
47
48    private boolean check(int[] nums, int[] prefMax,
49                          int[] suffMin, int[] prefDrop, int k) {
50        int n = nums.length;
51
52        for (int start = 0; start < n; start += k) {
53            int end = start + k - 1;
54
55            int drops = prefDrop[end] - prefDrop[start];
56
57            if (nums[end] > nums[start]) {
58                drops++;
59            }
60
61            if (drops > 1 || prefMax[start] > suffMin[start]) {
62                return false;
63            }
64        }
65
66        return true;
67    }
68}
69