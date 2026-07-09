// Last updated: 09/07/2026, 15:10:41
class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[ans]=nums[j];
                ans++;
            }
        }
        return ans;
        
    }
}