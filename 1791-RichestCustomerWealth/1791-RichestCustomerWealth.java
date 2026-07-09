// Last updated: 09/07/2026, 15:07:33
class Solution {
    public int maximumWealth(int[][] accounts) {
        int s = 0;

        for (int i = 0; i < accounts.length; i++) {
            int cw = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                cw += accounts[i][j];
            }

            s = Math.max(s, cw);
        }

        return s;
    }
}