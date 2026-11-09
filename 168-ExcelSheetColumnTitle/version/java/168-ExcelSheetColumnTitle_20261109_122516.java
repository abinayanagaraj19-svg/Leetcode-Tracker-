// Last updated: 09/11/2026, 12:25:16
1
2class Solution {
3    public String convertToTitle(int columnNumber) {
4        StringBuilder result = new StringBuilder();
5
6        while (columnNumber > 0) {
7            columnNumber--;
8
9            int remainder = columnNumber % 26;
10
11            char ch = (char) ('A' + remainder);
12
13            result.append(ch);
14
15            columnNumber /= 26;
16        }
17
18        return result.reverse().toString();
19    }
20}
21