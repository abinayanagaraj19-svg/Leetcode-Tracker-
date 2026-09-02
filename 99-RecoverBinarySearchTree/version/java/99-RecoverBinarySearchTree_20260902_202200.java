// Last updated: 02/09/2026, 20:22:00
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5
6        for (int i = 0; i < m; i++) {
7            dfs(board, i, 0);
8            dfs(board, i, n - 1);
9        }
10
11        for (int j = 0; j < n; j++) {
12            dfs(board, 0, j);
13            dfs(board, m - 1, j);
14        }
15
16        for (int i = 0; i < m; i++) {
17            for (int j = 0; j < n; j++) {
18                if (board[i][j] == 'O') {
19                    board[i][j] = 'X';
20                } else if (board[i][j] == '#') {
21                    board[i][j] = 'O';
22                }
23            }
24        }
25    }
26
27    private void dfs(char[][] board, int row, int col) {
28        int m = board.length;
29        int n = board[0].length;
30
31        if (row < 0 || row >= m ||
32            col < 0 || col >= n ||
33            board[row][col] != 'O') {
34            return;
35        }
36
37        board[row][col] = '#';
38
39        dfs(board, row + 1, col);
40        dfs(board, row - 1, col);
41        dfs(board, row, col + 1);
42        dfs(board, row, col - 1);
43    }
44}