// Last updated: 03/09/2026, 16:23:03
1class Solution {
2    public int findNthDigit(int n) {
3        long digits = 1;
4        long count = 9;
5        long start = 1;
6
7        while (n > digits * count) {
8            n -= digits * count;
9            digits++;
10            count *= 10;
11            start *= 10;
12        }
13
14        long num = start + (n - 1) / digits;
15
16        int index = (int) ((n - 1) % digits);
17
18        return String.valueOf(num).charAt(index) - '0';
19    }
20}