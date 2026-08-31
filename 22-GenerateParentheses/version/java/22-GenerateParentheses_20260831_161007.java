// Last updated: 31/08/2026, 16:10:07
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        if (dividend == Integer.MIN_VALUE && divisor == -1) {
5            return Integer.MAX_VALUE;
6        }
7
8        long a = Math.abs((long) dividend);
9        long b = Math.abs((long) divisor);
10
11        int result = 0;
12
13        while (a >= b) {
14            long temp = b;
15            int multiple = 1;
16
17            while (a >= (temp << 1)) {
18                temp <<= 1;
19                multiple <<= 1;
20            }
21
22            a -= temp;
23            result += multiple;
24        }
25
26        if ((dividend < 0) ^ (divisor < 0)) {
27            result = -result;
28        }
29
30        return result;
31    }
32}