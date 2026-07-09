// Last updated: 09/07/2026, 15:07:47
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int [][]arr=new int [n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
         int[] dp = new int[n + 1];
         dp[n]=0;
         Arrays.sort(startTime);
        for (int i=n-1; i>=0;i--) {
            int current=arr[i][2];
            int after=0;
            int end=arr[i][1];
            int index=n;
            for(int k=i+1;k<n;k++){
                if(end<=startTime[k]){
                    index=k;
                    break;
                }
            }
            if(index!=-1){
                after=dp[index];
                int tot=current+after;
                dp[i]=Math.max(tot,dp[i+1]);
            }
            }return dp[0];
    }
}