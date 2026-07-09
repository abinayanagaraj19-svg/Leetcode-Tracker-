// Last updated: 09/07/2026, 15:07:23
class Solution {
    public int[] getConcatenation(int[] nums) {
        int []result=new int [nums.length*2];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
            result[i+nums.length]=nums[i];

        }
        return result;
        
    }
}