// Last updated: 31/08/2026, 16:13:06
1import java.util.*;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5
6        Stack<Integer> stack = new Stack<>();
7        stack.push(-1);
8
9        int maxLength = 0;
10
11        for (int i = 0; i < s.length(); i++) {
12
13            if (s.charAt(i) == '(') {
14                stack.push(i);
15            } 
16            else {
17                stack.pop();
18
19                if (stack.isEmpty()) {
20                    stack.push(i);
21                } 
22                else {
23                    maxLength = Math.max(maxLength, i - stack.peek());
24                }
25            }
26        }
27
28        return maxLength;
29    }
30}