// Last updated: 04/10/2026, 20:44:48
1class Solution {
2    public boolean checkValidString(String s) {
3        int min = 0;
4        int max = 0;
5
6        for (char c : s.toCharArray()) {
7
8            if (c == '(') {
9                min++;
10                max++;
11            } 
12            else if (c == ')') {
13                min--;
14                max--;
15            } 
16            else { // '*'
17                min--;
18                max++;
19            }
20
21            if (max < 0) {
22                return false;
23            }
24
25            if (min < 0) {
26                min = 0;
27            }
28        }
29
30        return min == 0;
31    }
32}