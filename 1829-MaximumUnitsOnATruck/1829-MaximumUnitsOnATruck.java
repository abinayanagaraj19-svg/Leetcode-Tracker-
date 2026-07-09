// Last updated: 09/07/2026, 15:07:30
import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] bt, int t) {

        Arrays.sort(bt, (a, b) -> b[1] - a[1]);

        int tu = 0;

        for (int i = 0; i < bt.length && t > 0; i++) {
             int boxes = Math.min(bt[i][0], t);
             tu+= boxes * bt[i][1];
            t-= boxes;
        }

        return tu;
    }
}