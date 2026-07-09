// Last updated: 09/07/2026, 15:10:42
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int j =0;j<nums.length;j++){
            if(nums[ans]!=nums[j]){
                ans++;
                nums[ans]=nums[j];
            }
        }
        return ans+1;
    }
}