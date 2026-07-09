// Last updated: 09/07/2026, 15:06:49
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for (int x:nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
        
    }
}