// Last updated: 03/09/2026, 09:57:38
1class Solution {
2    public int maxSumSubmatrix(int[][] matrix, int k) {
3
4        int rows = matrix.length;
5        int cols = matrix[0].length;
6
7        int answer = Integer.MIN_VALUE;
8
9        if (rows < cols) {
10            int[][] transposed = new int[cols][rows];
11
12            for (int i = 0; i < rows; i++) {
13                for (int j = 0; j < cols; j++) {
14                    transposed[j][i] = matrix[i][j];
15                }
16            }
17
18            matrix = transposed;
19
20            int temp = rows;
21            rows = cols;
22            cols = temp;
23        }
24
25        for (int left = 0; left < cols; left++) {
26
27            int[] rowSum = new int[rows];
28
29            for (int right = left; right < cols; right++) {
30
31                for (int r = 0; r < rows; r++) {
32                    rowSum[r] += matrix[r][right];
33                }
34
35                TreeSet<Integer> prefixSet = new TreeSet<>();
36                prefixSet.add(0);
37
38                int prefixSum = 0;
39
40                for (int sum : rowSum) {
41
42                    prefixSum += sum;
43
44                    Integer previous = prefixSet.ceiling(prefixSum - k);
45
46                    if (previous != null) {
47                        answer = Math.max(
48                            answer,
49                            prefixSum - previous
50                        );
51                    }
52
53                    prefixSet.add(prefixSum);
54                }
55            }
56        }
57
58        return answer;
59    }
60}