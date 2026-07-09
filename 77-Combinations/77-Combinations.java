// Last updated: 09/07/2026, 15:10:08
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        method(arr,n,k,temp,1);
        return arr;
    }
    void method(List<List<Integer>>arr, int n,int k,List<Integer>temp,int start){
        if(temp.size()==k){
            arr.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            method(arr,n,k,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}