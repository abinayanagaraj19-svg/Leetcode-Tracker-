// Last updated: 09/07/2026, 15:09:10

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=0;
        int m1=0;
        int m2=0;
        if (n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            m1=Math.max(a,b+nums[i]);
            b=a;
            a=m1;
         }
         int x=0;
         int y=0;
         for(int i=n-1;i>=1;i--){
            m2=Math.max(x,y+nums[i]);
            y=x;
            x=m2;
         }
         return Math.max(m1,m2);
        
        
    }
}
    