// Last updated: 23/09/2026, 20:06:10
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];               
6        }
7        int target=sum-x;
8        if(target<0){
9            return -1;
10        }if(target==0){
11            return nums.length;
12        }
13        int left=0;
14        int tot=0;
15        int max=-1;
16        for(int right=0;right<nums.length;right++){
17            tot+=nums[right];
18            while(left<=right && tot>target){
19                tot-=nums[left];
20                left++;
21            }
22            if(tot==target){
23                max=Math.max(max,right-left+1);
24            }
25           
26        }
27        if (max==-1){
28            return -1;
29        }
30        return nums.length-max;
31
32        
33    }
34}