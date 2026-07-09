// Last updated: 09/07/2026, 15:07:56
class Solution {
    int m, n;
    boolean[][] visited;
    List<int[]> border = new ArrayList<>();

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n];
        int original = grid[row][col];

        dfs(grid, row, col, original);

        for (int[] cell : border) {
            grid[cell[0]][cell[1]] = color;
        }

        return grid;
    }

    private void dfs(int[][] grid, int r, int c, int original) {
        visited[r][c] = true;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean isBorder = false;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                isBorder = true;
            } else if (grid[nr][nc] != original) {
                isBorder = true;
            } else if (!visited[nr][nc]) {
                dfs(grid, nr, nc, original);
            }
        }

        if (isBorder) {
            border.add(new int[]{r, c});
        }
    }
}