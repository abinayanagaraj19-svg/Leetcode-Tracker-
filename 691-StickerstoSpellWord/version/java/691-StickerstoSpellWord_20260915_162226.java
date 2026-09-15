// Last updated: 15/09/2026, 16:22:26
1class Solution {
2
3    public List<String> braceExpansionII(String expression) {
4
5        Set<String> result = solve(expression);
6
7        List<String> answer = new ArrayList<>(result);
8
9        Collections.sort(answer);
10
11        return answer;
12    }
13
14    private Set<String> solve(String s) {
15
16        Set<String> result = new HashSet<>();
17
18        Set<String> current = new HashSet<>();
19        current.add("");
20
21        int i = 0;
22
23        while (i < s.length()) {
24
25            char ch = s.charAt(i);
26
27            if (ch == ',') {
28
29                result.addAll(current);
30
31                current = new HashSet<>();
32                current.add("");
33
34                i++;
35            }
36
37            else if (ch == '{') {
38
39                int start = i + 1;
40                int balance = 1;
41
42                i++;
43
44                while (balance > 0) {
45
46                    if (s.charAt(i) == '{') {
47                        balance++;
48                    }
49
50                    if (s.charAt(i) == '}') {
51                        balance--;
52                    }
53
54                    i++;
55                }
56
57                String inside = s.substring(start, i - 1);
58
59                Set<String> part = solve(inside);
60
61                current = combine(current, part);
62            }
63
64            else {
65
66                Set<String> part = new HashSet<>();
67
68                for (String str : current) {
69                    part.add(str + ch);
70                }
71
72                current = part;
73
74                i++;
75            }
76        }
77
78        result.addAll(current);
79
80        return result;
81    }
82
83    private Set<String> combine(Set<String> a, Set<String> b) {
84
85        Set<String> result = new HashSet<>();
86
87        for (String x : a) {
88            for (String y : b) {
89                result.add(x + y);
90            }
91        }
92
93        return result;
94    }
95}