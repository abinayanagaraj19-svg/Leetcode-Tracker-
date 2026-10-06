// Last updated: 06/10/2026, 08:54:07
1class Solution {
2    public int minAddToMakeValid(String s) {
3
4        int open = 0;
5        int add = 0;
6
7        for (char ch : s.toCharArray()) {
8
9            if (ch == '(') {
10                open++;
11            } else {
12                if (open > 0) {
13                    open--;
14                } else {
15                    add++;
16                }
17            }
18        }
19
20        return add + open;
21    }
22}