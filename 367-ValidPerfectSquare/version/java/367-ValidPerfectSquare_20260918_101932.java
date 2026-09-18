// Last updated: 18/09/2026, 10:19:32
1class Solution {
2    public boolean isPerfectSquare(int num) {
3
4        long left = 1;
5        long right = num;
6
7        while (left <= right) {
8
9            long mid = left + (right - left) / 2;
10            long square = mid * mid;
11
12            if (square == num) {
13                return true;
14            }
15            else if (square < num) {
16                left = mid + 1;
17            }
18            else {
19                right = mid - 1;
20            }
21        }
22
23        return false;
24    }
25}