// Last updated: 03/09/2026, 16:24:42
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        int[] result = new int[m * n];
7        int index = 0;
8
9        int row = 0;
10        int col = 0;
11
12        for (int i = 0; i < m * n; i++) {
13            result[index++] = mat[row][col];
14
15            if ((row + col) % 2 == 0) {
16                if (col == n - 1) {
17                    row++;
18                } else if (row == 0) {
19                    col++;
20                } else {
21                    row--;
22                    col++;
23                }
24            }
25            else {
26                if (row == m - 1) {
27                    col++;
28                } else if (col == 0) {
29                    row++;
30                } else {
31                    row++;
32                    col--;
33                }
34            }
35        }
36
37        return result;
38    }
39}