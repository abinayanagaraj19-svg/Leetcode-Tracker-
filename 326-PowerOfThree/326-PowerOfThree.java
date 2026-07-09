// Last updated: 09/07/2026, 15:08:50
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
        
    }
}