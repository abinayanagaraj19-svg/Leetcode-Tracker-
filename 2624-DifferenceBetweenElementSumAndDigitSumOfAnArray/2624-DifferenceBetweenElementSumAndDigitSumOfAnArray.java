// Last updated: 09/07/2026, 15:07:08
class Solution {
    public int differenceOfSum(int[] nums) {
        int last,sum1=0,sum2=0;
        for (int x : nums){
            sum1+=x;
            int org=x;
            while(org!=0){
                last=org%10;
                sum2+=last;
                org/=10;
            }
        } 
           return sum1-sum2;
    }
}