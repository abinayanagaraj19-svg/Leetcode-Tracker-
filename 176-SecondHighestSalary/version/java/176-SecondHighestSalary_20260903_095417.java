// Last updated: 03/09/2026, 09:54:17
1class Solution {
2
3    List<String> result = new ArrayList<>();
4    String num;
5    long target;
6
7    public List<String> addOperators(String num, int target) {
8        this.num = num;
9        this.target = target;
10
11        backtrack(0, 0, 0, "");
12
13        return result;
14    }
15
16    private void backtrack(int index, long value, long prev, String expression) {
17
18        if (index == num.length()) {
19            if (value == target) {
20                result.add(expression);
21            }
22            return;
23        }
24
25        for (int i = index; i < num.length(); i++) {
26
27            if (i > index && num.charAt(index) == '0') {
28                break;
29            }
30
31            String currentStr = num.substring(index, i + 1);
32            long current = Long.parseLong(currentStr);
33
34            if (index == 0) {
35                backtrack(
36                    i + 1,
37                    current,
38                    current,
39                    currentStr
40                );
41            } else {
42
43                backtrack(
44                    i + 1,
45                    value + current,
46                    current,
47                    expression + "+" + currentStr
48                );
49
50                backtrack(
51                    i + 1,
52                    value - current,
53                    -current,
54                    expression + "-" + currentStr
55                );
56
57                backtrack(
58                    i + 1,
59                    value - prev + prev * current,
60                    prev * current,
61                    expression + "*" + currentStr
62                );
63            }
64        }
65    }
66}