// Last updated: 30/07/2026, 16:17:54
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5        Stack<Integer> stack = new Stack<>();
6        int result = 0;
7        int number = 0;
8        int sign = 1;
9
10        for (int i = 0; i < s.length(); i++) {
11            char ch = s.charAt(i);
12
13            if (Character.isDigit(ch)) {
14                number = number * 10 + (ch - '0');
15            } 
16            else if (ch == '+') {
17                result += sign * number;
18                number = 0;
19                sign = 1;
20            } 
21            else if (ch == '-') {
22                result += sign * number;
23                number = 0;
24                sign = -1;
25            } 
26            else if (ch == '(') {
27                stack.push(result);
28                stack.push(sign);
29
30                result = 0;
31                sign = 1;
32            } 
33            else if (ch == ')') {
34                result += sign * number;
35                number = 0;
36
37                result *= stack.pop(); // sign
38                result += stack.pop(); // previous result
39            }
40        }
41
42        result += sign * number;
43
44        return result;
45    }
46}