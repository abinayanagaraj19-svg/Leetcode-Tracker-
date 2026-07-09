// Last updated: 09/07/2026, 15:07:41
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=candies[0];
        for(int i=0;i<n;i++){
            candies[i]+=extraCandies;
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean >visited=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                visited.add(true);
            }else{
                visited.add(false);
            }
        }  
        return visited; 
    }
}