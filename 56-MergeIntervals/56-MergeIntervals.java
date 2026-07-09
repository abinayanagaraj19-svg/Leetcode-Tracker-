// Last updated: 09/07/2026, 15:10:21
class Solution {
    public int[][] merge(int[][] il) {
        Arrays.sort(il,(a,b)->Integer.compare(a[0],b[0]));
        int k=0;
        for(int i=0;i<il.length;i++){
            if(il[k][1]>=il[i][0]){
                il[k][1]=Math.max(il[i][1],il[k][1]);
            }else{
                k++;
                il[k]=il[i];
            }
        }
        return Arrays.copyOfRange(il,0,k+1);
    }
}