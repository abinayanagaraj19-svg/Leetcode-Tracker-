// Last updated: 15/09/2026, 15:49:05
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3
4        int left = Math.max(rec1[0], rec2[0]);
5        int right = Math.min(rec1[2], rec2[2]);
6
7        int bottom = Math.max(rec1[1], rec2[1]);
8        int top = Math.min(rec1[3], rec2[3]);
9
10        return left < right && bottom < top;
11    }
12}