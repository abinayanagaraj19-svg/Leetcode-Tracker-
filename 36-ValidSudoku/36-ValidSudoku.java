// Last updated: 09/07/2026, 15:10:34
class Solution {
    public boolean check(char[][] board,int row,int col) {
        for (int i=0;i<9;i++) {
            if (i!=col && board[row][col]==board[row][i]) return false;
            if (i!=row && board[row][col]==board[i][col]) return false;
        }

        int start_row=(row/3)*3;
        int start_col=(col/3)*3;

        for (int i=start_row;i<start_row+3;i++) {
            for (int j=start_col;j<start_col+3;j++) {
                if (!(i==row && j==col)) {
                    if (board[i][j]==board[row][col]) return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (board[i][j]!='.') {
                    if (!check(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}