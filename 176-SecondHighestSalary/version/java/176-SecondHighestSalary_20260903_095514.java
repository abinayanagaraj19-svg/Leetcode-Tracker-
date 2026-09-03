// Last updated: 03/09/2026, 09:55:14
1class Solution {
2    public String removeDuplicateLetters(String s) {
3
4        int[] lastIndex = new int[26];
5
6        for (int i = 0; i < s.length(); i++) {
7            lastIndex[s.charAt(i) - 'a'] = i;
8        }
9
10        boolean[] used = new boolean[26];
11
12        StringBuilder stack = new StringBuilder();
13
14        for (int i = 0; i < s.length(); i++) {
15
16            char ch = s.charAt(i);
17            int index = ch - 'a';
18
19            if (used[index]) {
20                continue;
21            }
22
23            while (stack.length() > 0 &&
24                   stack.charAt(stack.length() - 1) > ch &&
25                   lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {
26
27                char removed = stack.charAt(stack.length() - 1);
28                stack.deleteCharAt(stack.length() - 1);
29
30                used[removed - 'a'] = false;
31            }
32
33            stack.append(ch);
34            used[index] = true;
35        }
36
37        return stack.toString();
38    }
39}