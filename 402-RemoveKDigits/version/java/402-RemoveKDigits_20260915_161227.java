// Last updated: 15/09/2026, 16:12:27
1class Solution {
2    public String removeKdigits(String num, int k) {
3
4        StringBuilder stack = new StringBuilder();
5
6        for (char digit : num.toCharArray()) {
7
8            while (k > 0 && stack.length() > 0 &&
9                   stack.charAt(stack.length() - 1) > digit) {
10
11                stack.deleteCharAt(stack.length() - 1);
12                k--;
13            }
14
15            stack.append(digit);
16        }
17
18        while (k > 0) {
19            stack.deleteCharAt(stack.length() - 1);
20            k--;
21        }
22        int i = 0;
23        while (i < stack.length() && stack.charAt(i) == '0') {
24            i++;
25        }
26
27        String result = stack.substring(i);
28
29        return result.length() == 0 ? "0" : result;
30    }
31}