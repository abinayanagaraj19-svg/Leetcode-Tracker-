// Last updated: 09/07/2026, 15:07:35
class Solution {
    public int diagonalSum(int[][] mat) {
        int a=mat.length;
        int sum=0;
        for (int i=0;i<a;i++){
            sum+=mat[i][i];
            sum+=mat[i][a-1-i];
        }
        if (a%2!=0){
            sum-=mat[a/2][a/2];
        }
        return sum;
  
    }
}