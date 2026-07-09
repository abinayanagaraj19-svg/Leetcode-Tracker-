// Last updated: 09/07/2026, 15:09:15
class Solution {
    void travel(char[][] grid,int row,int col) {
        if (row<0 || row>=grid.length ||
            col<0 || col>=grid[0].length ||
            grid[row][col]=='0') {
            return;
        }

        grid[row][col]='0';

        travel(grid,row,col+1);
        travel(grid,row,col-1);
        travel(grid,row+1,col);
        travel(grid,row-1,col);
    }

    public int numIslands(char[][]grid) {
        int c=0;
        int row=grid.length;
        int col=grid[0].length;

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (grid[i][j]=='1') {
                    c++;
                    travel(grid,i,j);
                }
            }
        }
        return c;
    }
}