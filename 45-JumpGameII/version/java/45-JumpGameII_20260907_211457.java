// Last updated: 07/09/2026, 21:14:57
1class Solution {
2    public int jump(int[] nums) {
3        int jump=0;
4        int l=0;
5        int r=0;
6        int n=nums.length;
7        for(int i=0;i<n-1;i++){
8            r=Math.max(r,i+nums[i]);
9            if(i==l){
10                jump++;
11                l=r;
12            }
13        }
14        return jump;
15        
16    }
17}