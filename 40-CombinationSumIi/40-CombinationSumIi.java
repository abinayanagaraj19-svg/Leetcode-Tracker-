// Last updated: 09/07/2026, 15:10:30
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        method(arr,candidates,target,temp,0);
        return arr;
    }
    void method(List<List<Integer>>arr,int[]ans,int required,List<Integer>temp,int start){
        if(required==0){
            if(! arr.contains(temp))
            arr.add(new ArrayList<>(temp));
            return;
        }
        if(required<0)return;
        for(int i=start;i<ans.length;i++){
            if(i>start && ans[i]==ans[i-1])continue;
            temp.add(ans[i]);
            method(arr,ans,required-ans[i],temp,i+1);
            temp.remove(temp.size()-1);
            
        }
        
    }
}