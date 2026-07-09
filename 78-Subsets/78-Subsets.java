// Last updated: 09/07/2026, 15:10:06
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        method(ans,temp,nums,0);
        return ans;
    }
    void method(List<List<Integer>> ans,List<Integer>temp,int[]nums,int idx){
        ans.add(new ArrayList(temp));
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            method(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}