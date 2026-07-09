// Last updated: 09/07/2026, 15:09:26
class Solution {
    public void reverse (int[] arr,int start,int end){
        while(start<end){
            int t =arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        

        
    }
}