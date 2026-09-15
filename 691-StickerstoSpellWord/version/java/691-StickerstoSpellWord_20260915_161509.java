// Last updated: 15/09/2026, 16:15:09
1class Solution {
2    public int nthMagicalNumber(int n, int a, int b) {
3
4        long MOD = 1000000007;
5
6        long left = 1;
7        long right = (long) n * Math.min(a, b);
8
9        long lcm = (long) a / gcd(a, b) * b;
10
11        while (left < right) {
12
13            long mid = left + (right - left) / 2;
14
15            long count = mid / a + mid / b - mid / lcm;
16
17            if (count < n) {
18                left = mid + 1;
19            } else {
20                right = mid;
21            }
22        }
23
24        return (int)(left % MOD);
25    }
26
27    private long gcd(long a, long b) {
28
29        while (b != 0) {
30            long temp = a % b;
31            a = b;
32            b = temp;
33        }
34
35        return a;
36    }
37}