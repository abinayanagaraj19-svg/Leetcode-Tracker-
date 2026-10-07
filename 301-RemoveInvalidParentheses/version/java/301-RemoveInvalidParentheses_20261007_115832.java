// Last updated: 07/10/2026, 11:58:32
1import java.util.*;
2
3class Solution {
4
5    public List<String> removeInvalidParentheses(String s) {
6
7        List<String> result = new ArrayList<>();
8
9        Queue<String> queue = new LinkedList<>();
10        Set<String> visited = new HashSet<>();
11
12        queue.add(s);
13        visited.add(s);
14
15        boolean found = false;
16
17        while (!queue.isEmpty()) {
18
19            String current = queue.poll();
20
21            if (isValid(current)) {
22                result.add(current);
23                found = true;
24            }
25
26            if (found) {
27                continue;
28            }
29            for (int i = 0; i < current.length(); i++) {
30
31                char ch = current.charAt(i);
32
33                if (ch != '(' && ch != ')') {
34                    continue;
35                }
36
37                String next = current.substring(0, i)
38                           + current.substring(i + 1);
39
40                if (!visited.contains(next)) {
41                    visited.add(next);
42                    queue.add(next);
43                }
44            }
45        }
46
47        return result;
48    }
49
50    private boolean isValid(String s) {
51
52        int count = 0;
53
54        for (char ch : s.toCharArray()) {
55
56            if (ch == '(') {
57                count++;
58            } 
59            else if (ch == ')') {
60                count--;
61
62                if (count < 0) {
63                    return false;
64                }
65            }
66        }
67
68        return count == 0;
69    }
70}