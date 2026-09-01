// Last updated: 01/09/2026, 16:13:15
1class Solution {
2    public boolean isNumber(String s) {
3        boolean digit = false;
4        boolean dot = false;
5        boolean exponent = false;
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9
10            if (c >= '0' && c <= '9') {
11                digit = true;
12            }
13
14            else if (c == '.') {
15                if (dot || exponent) {
16                    return false;
17                }
18                dot = true;
19            }
20
21            else if (c == 'e' || c == 'E') {
22                if (exponent || !digit) {
23                    return false;
24                }
25
26                exponent = true;
27                digit = false; 
28            }
29
30            else if (c == '+' || c == '-') {
31                if (i != 0 &&
32                    s.charAt(i - 1) != 'e' &&
33                    s.charAt(i - 1) != 'E') {
34                    return false;
35                }
36            }
37
38            else {
39                return false;
40            }
41        }
42
43        return digit;
44    }
45}