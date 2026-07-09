// Last updated: 09/07/2026, 15:10:15
class Solution {
    public int mySqrt(int x) {
        int ans=0;
        for(int i=0;i<=x;i++){
            if((long )i*i<=x){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
        
    }
}
