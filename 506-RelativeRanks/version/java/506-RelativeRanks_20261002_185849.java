// Last updated: 02/10/2026, 18:58:49
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        String[]ans=new String[score.length];
4        Integer[] indices=new Integer[score.length];
5        for(int i=0;i<score.length;i++){
6            indices[i]=i;
7        }
8        Arrays.sort(indices,(a,b)->score[b]-score[a]);
9        for(int i=0;i<score.length;i++){
10            int index=indices[i];
11            if(i==0){
12                ans[index]="Gold Medal";
13            }else if(i==1){
14                ans[index]="Silver Medal";
15            }else if(i==2){
16                ans[index]="Bronze Medal";
17            }else {
18                ans[index]=String.valueOf(i+1);
19            }
20        }return ans;
21        
22    }
23}