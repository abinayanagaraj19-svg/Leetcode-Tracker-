// Last updated: 02/10/2026, 18:37:34
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
18        if (open < n) {
19            backtrack(result, current + "(", open + 1, close, n);
20        }
21
22        if (close < open) {
23            backtrack(result, current + ")", open, close + 1, n);
24        }
25    }
26}