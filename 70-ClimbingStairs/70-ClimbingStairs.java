// Last updated: 09/07/2026, 15:10:13
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            
        }
        return c;
        

        
    }
}