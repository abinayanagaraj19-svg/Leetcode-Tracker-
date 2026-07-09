// Last updated: 09/07/2026, 15:08:36
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=0;int end=Integer.MIN_VALUE;int n=intervals.length;
        for(int[] i: intervals){
            if(end>i[0]){
                count++;
            }else{
                end=i[1];
            }
            
        }
        return count++;
    }
}