// Last updated: 15/09/2026, 15:48:27
1class Solution {
2    public int totalNumbers(int[] digits) {
3
4        boolean[] used = new boolean[1000];
5        int count = 0;
6
7        for (int i = 0; i < digits.length; i++) {
8
9            for (int j = 0; j < digits.length; j++) {
10
11                for (int k = 0; k < digits.length; k++) {
12
13                    if (i == j || j == k || i == k) {
14                        continue;
15                    }
16
17                    int num = digits[i] * 100
18                            + digits[j] * 10
19                            + digits[k];
20
21                    if (digits[i] == 0) {
22                        continue;
23                    }
24
25                    if (digits[k] % 2 != 0) {
26                        continue;
27                    }
28
29                    if (!used[num]) {
30                        used[num] = true;
31                        count++;
32                    }
33                }
34            }
35        }
36
37        return count;
38    }
39}