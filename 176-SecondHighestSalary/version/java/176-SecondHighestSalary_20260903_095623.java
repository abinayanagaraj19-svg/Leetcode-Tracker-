// Last updated: 03/09/2026, 09:56:23
1class Solution {
2    public List<List<Integer>> palindromePairs(String[] words) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        Map<String, Integer> map = new HashMap<>();
7
8        for (int i = 0; i < words.length; i++) {
9            map.put(words[i], i);
10        }
11
12        for (int i = 0; i < words.length; i++) {
13
14            String word = words[i];
15
16            for (int j = 0; j <= word.length(); j++) {
17
18                String left = word.substring(0, j);
19                String right = word.substring(j);
20
21                
22                if (isPalindrome(left)) {
23
24                    String reverseRight = reverse(right);
25
26                    if (map.containsKey(reverseRight)
27                            && map.get(reverseRight) != i) {
28
29                        result.add(Arrays.asList(
30                            map.get(reverseRight),
31                            i
32                        ));
33                    }
34                }
35
36               
37                if (j != word.length() && isPalindrome(right)) {
38
39                    String reverseLeft = reverse(left);
40
41                    if (map.containsKey(reverseLeft)
42                            && map.get(reverseLeft) != i) {
43
44                        result.add(Arrays.asList(
45                            i,
46                            map.get(reverseLeft)
47                        ));
48                    }
49                }
50            }
51        }
52
53        return result;
54    }
55
56    private boolean isPalindrome(String s) {
57
58        int left = 0;
59        int right = s.length() - 1;
60
61        while (left < right) {
62
63            if (s.charAt(left) != s.charAt(right)) {
64                return false;
65            }
66
67            left++;
68            right--;
69        }
70
71        return true;
72    }
73
74    private String reverse(String s) {
75        return new StringBuilder(s).reverse().toString();
76    }
77}