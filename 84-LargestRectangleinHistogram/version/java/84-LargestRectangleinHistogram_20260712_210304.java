// Last updated: 12/07/2026, 21:03:04
1import java.util.*;
2
3class Solution {
4    public int largestRectangleArea(int[] heights) {
5        Deque<Integer> stack = new ArrayDeque<>();
6        int maxArea = 0;
7        int n = heights.length;
8
9        for (int i = 0; i <= n; i++) {
10            int currentHeight = (i == n) ? 0 : heights[i];
11
12            while (!stack.isEmpty() && heights[stack.peek()] >= currentHeight) {
13                int height = heights[stack.pop()];
14                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
15                maxArea = Math.max(maxArea, height * width);
16            }
17
18            stack.push(i);
19        }
20
21        return maxArea;
22    }
23}