// Last updated: 09/07/2026, 15:09:53
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
        
    }
}