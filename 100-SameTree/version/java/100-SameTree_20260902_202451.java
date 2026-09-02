// Last updated: 02/09/2026, 20:24:51
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> result = new ArrayList<>();
4        backtrack(s, 0, 0, "", result);
5        return result;
6    }
7
8    private void backtrack(String s, int index, int parts,
9                            String current, List<String> result) {
10
11        if (parts == 4) {
12            if (index == s.length()) {
13                result.add(current.substring(0, current.length() - 1));
14            }
15            return;
16        }
17
18        for (int len = 1; len <= 3; len++) {
19
20            if (index + len > s.length()) {
21                break;
22            }
23
24            String part = s.substring(index, index + len);
25
26            if (part.length() > 1 && part.charAt(0) == '0') {
27                break;
28            }
29
30            int value = Integer.parseInt(part);
31
32            if (value > 255) {
33                break;
34            }
35
36            backtrack(
37                s,
38                index + len,
39                parts + 1,
40                current + part + ".",
41                result
42            );
43        }
44    }
45}