// Last updated: 09/10/2026, 09:58:00
1class Solution {
2    public int minInsertions(String s) {
3        int open = 0;
4        int insertions = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7
8            if (s.charAt(i) == '(') {
9                open++;
10            } 
11            else {
12                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
13        
14                    i++;
15                } 
16                else {
17                    insertions++;
18                }
19
20                if (open > 0) {
21                    open--;
22                } 
23                else {
24                
25                    insertions++;
26                }
27            }
28        }
29
30    
31        insertions += open * 2;
32
33        return insertions;
34    }
35}