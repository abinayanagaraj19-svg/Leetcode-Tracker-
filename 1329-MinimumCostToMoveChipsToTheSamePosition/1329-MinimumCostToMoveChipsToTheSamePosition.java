// Last updated: 09/07/2026, 15:07:48
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int p : position){
            if(p%2==0)even++;
            else odd++;

        }
 

        return Math.min(even,odd);
    }
}