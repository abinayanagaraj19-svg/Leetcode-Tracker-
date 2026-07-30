// Last updated: 30/07/2026, 16:15:50
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean firstRow = false;
7        boolean firstCol = false;
8
9        // Check first row
10        for (int j = 0; j < n; j++) {
11            if (matrix[0][j] == 0) {
12                firstRow = true;
13                break;
14            }
15        }
16
17        // Check first column
18        for (int i = 0; i < m; i++) {
19            if (matrix[i][0] == 0) {
20                firstCol = true;
21                break;
22            }
23        }
24
25        // Use first row and column as markers
26        for (int i = 1; i < m; i++) {
27            for (int j = 1; j < n; j++) {
28                if (matrix[i][j] == 0) {
29                    matrix[i][0] = 0;
30                    matrix[0][j] = 0;
31                }
32            }
33        }
34
35        // Set rows to zero
36        for (int i = 1; i < m; i++) {
37            if (matrix[i][0] == 0) {
38                for (int j = 1; j < n; j++) {
39                    matrix[i][j] = 0;
40                }
41            }
42        }
43
44        // Set columns to zero
45        for (int j = 1; j < n; j++) {
46            if (matrix[0][j] == 0) {
47                for (int i = 1; i < m; i++) {
48                    matrix[i][j] = 0;
49                }
50            }
51        }
52
53        // Zero first row if needed
54        if (firstRow) {
55            for (int j = 0; j < n; j++) {
56                matrix[0][j] = 0;
57            }
58        }
59
60        // Zero first column if needed
61        if (firstCol) {
62            for (int i = 0; i < m; i++) {
63                matrix[i][0] = 0;
64            }
65        }
66    }
67}