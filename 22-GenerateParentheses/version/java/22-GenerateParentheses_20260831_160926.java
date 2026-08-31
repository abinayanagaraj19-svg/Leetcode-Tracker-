// Last updated: 31/08/2026, 16:09:26
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        long a = Math.abs((long) dividend);
10        long b = Math.abs((long) divisor);
11
12        int result = 0;
13
14        // Keep subtracting the largest possible multiple
15        while (a >= b) {
16            long temp = b;
17            int multiple = 1;
18
19            while (a >= (temp << 1)) {
20                temp <<= 1;
21                multiple <<= 1;
22            }
23
24            a -= temp;
25            result += multiple;
26        }
27
28        // Determine the sign
29        if ((dividend < 0) ^ (divisor < 0)) {
30            result = -result;
31        }
32
33        return result;
34    }
35}