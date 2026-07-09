// Last updated: 09/07/2026, 15:08:59
class Solution {
    public int missingNumber(int[] nums) {
        int av=0;
        for(int i=0;i<=nums.length;i++){
            av+=i;
        }
        int gv=0;
        for(int b:nums){
            gv+=b;
        }
       
        return av-gv;
        
    }
}