// Last updated: 09/07/2026, 15:09:18
class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int m=0;
        for(int i :nums){
            m=Math.max(a,b+i);
            b=a;
            a=m;
         }
         return m;
        
    }
}