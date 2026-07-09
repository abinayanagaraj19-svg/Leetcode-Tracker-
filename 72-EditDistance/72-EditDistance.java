// Last updated: 09/07/2026, 15:10:11
class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
         int[][]arr=new int[n1+1][n2+1];
         for(int i=0;i<n1+1;i++){
            arr[i][0]=i;
        }
        for(int j=0;j<n2+1;j++){
            arr[0][j]=j;
        }
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=1+Math.min((Math.min(arr[i-1][j],arr[i][j-1])),(arr[i-1][j-1]));
                }
            }
           
        }
         return arr[n1][n2];

        
    }
}