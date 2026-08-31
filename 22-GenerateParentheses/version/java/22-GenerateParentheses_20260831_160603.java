// Last updated: 31/08/2026, 16:06:03
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4
5        backtrack(result, "", 0, 0, n);
6
7        return result;
8    }
9
10    private void backtrack(List<String> result, String current,
11                            int open, int close, int n) {
12
13        if (current.length() == 2 * n) {
14            result.add(current);
15            return;
16        }
17
18        // Add '(' if we still have opening brackets available
19        if (open < n) {
20            backtrack(result, current + "(", open + 1, close, n);
21        }
22
23        if (close < open) {
24            backtrack(result, current + ")", open, close + 1, n);
25        }
26    }
27}