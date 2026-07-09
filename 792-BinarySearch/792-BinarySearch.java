// Last updated: 09/07/2026, 15:08:03
class Solution {
    public int search(int[] nums, int target) {
        int ans=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
               
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
}