// Last updated: 09/10/2026, 15:43:04
1
2/**
3 * The guess API is already defined in the parent class.
4 * int guess(int num);
5 */
6
7public class Solution extends GuessGame {
8    public int guessNumber(int n) {
9        int low = 1;
10        int high = n;
11
12        while (low <= high) {
13            int mid = low + (high - low) / 2;
14
15            int result = guess(mid);
16
17            if (result == 0) {
18                return mid;
19            } else if (result == -1) {
20                high = mid - 1;
21            } else {
22                low = mid + 1;
23            }
24        }
25
26        return -1;
27    }
28}
29