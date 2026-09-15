// Last updated: 15/09/2026, 15:47:24
1class Solution {
2
3    int n;
4    int k;
5    String s;
6
7    boolean[][] palindrome;
8    int[] dp;
9
10    public int maxPalindromes(String s, int k) {
11
12        this.s = s;
13        this.k = k;
14        this.n = s.length();
15
16        palindrome = new boolean[n][n];
17        dp = new int[n];
18
19        for (int i = n - 1; i >= 0; i--) {
20
21            palindrome[i][i] = true;
22
23            for (int j = i + 1; j < n; j++) {
24
25                if (s.charAt(i) == s.charAt(j)) {
26
27                    if (j - i == 1) {
28                        palindrome[i][j] = true;
29                    } 
30                    else {
31                        palindrome[i][j] = palindrome[i + 1][j - 1];
32                    }
33                }
34            }
35        }
36
37        return solve(0);
38    }
39
40    int solve(int start) {
41
42        if (start >= n) {
43            return 0;
44        }
45
46        if (dp[start] != 0) {
47            return dp[start];
48        }
49
50        // Option 1: skip current character
51        int answer = solve(start + 1);
52
53        // Option 2: choose a palindrome
54        for (int end = start + k - 1; end < n; end++) {
55
56            if (palindrome[start][end]) {
57
58                answer = Math.max(
59                    answer,
60                    1 + solve(end + 1)
61                );
62            }
63        }
64
65        dp[start] = answer;
66
67        return answer;
68    }
69}