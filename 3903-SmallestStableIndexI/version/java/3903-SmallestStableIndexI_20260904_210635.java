// Last updated: 04/09/2026, 21:06:35
1class Solution {
2
3    public long findKthSmallest(int[] coins, int k) {
4
5        long left = 1;
6        long right = (long) k * getMin(coins);
7
8        while (left < right) {
9
10            long mid = left + (right - left) / 2;
11
12            if (count(mid, coins) >= k) {
13                right = mid;
14            } else {
15                left = mid + 1;
16            }
17        }
18
19        return left;
20    }
21
22    private long count(long x, int[] coins) {
23
24        int n = coins.length;
25        long result = 0;
26
27        for (int mask = 1; mask < (1 << n); mask++) {
28
29            long lcm = 1;
30            int bits = 0;
31            boolean valid = true;
32
33            for (int i = 0; i < n; i++) {
34
35                if ((mask & (1 << i)) != 0) {
36
37                    bits++;
38
39                    lcm = lcm(lcm, coins[i]);
40
41                    if (lcm > x) {
42                        valid = false;
43                        break;
44                    }
45                }
46            }
47
48            if (!valid) {
49                continue;
50            }
51
52            long multiples = x / lcm;
53
54            if (bits % 2 == 1) {
55                result += multiples;
56            } else {
57                result -= multiples;
58            }
59        }
60
61        return result;
62    }
63
64    private long gcd(long a, long b) {
65
66        while (b != 0) {
67            long temp = a % b;
68            a = b;
69            b = temp;
70        }
71
72        return a;
73    }
74
75    private long lcm(long a, long b) {
76        return a / gcd(a, b) * b;
77    }
78
79    private int getMin(int[] coins) {
80
81        int min = coins[0];
82
83        for (int coin : coins) {
84            min = Math.min(min, coin);
85        }
86
87        return min;
88    }
89}