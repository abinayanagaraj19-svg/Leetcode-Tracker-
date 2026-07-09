// Last updated: 09/07/2026, 15:08:02
class Solution {
    public int maxi(int[]piles){
        int m=0;
        for(int i:piles){
            m=Math.max(m,i);
           
        }
        return m;
    }
    
    public int calculate(int[]piles,int mid){
        int c=0;
        for(int i :piles){
            c+=(i/mid);
            if (i%mid!=0){
                c++;
            }
        }
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=maxi(piles);
        while(start<end){
            int mid=(start+end)/2;
            int cal_hours=calculate(piles,mid);
            if(cal_hours>h){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;

        
    }
}