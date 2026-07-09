// Last updated: 09/07/2026, 15:06:42
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int sos=0;
        while(n>0){
            int ans=n%10;
            d+=ans;
            sos+=ans*ans;
            n/=10;
        }
        return(sos-d)>=50;
        
    }
}