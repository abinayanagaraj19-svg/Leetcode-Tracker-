// Last updated: 23/09/2026, 09:27:22
1class Solution {
2    public void sortColors(int[] nums) {
3        int left=0;
4        int i=0;
5        int right=nums.length-1;
6        while(i<=right){
7
8            if(nums[i]==0){
9            int temp=nums[i];
10            nums[i]=nums[left];
11            nums[left]=temp;
12            left++;
13            }
14        
15            if(nums[i]==2){
16                int tempt=nums[i];
17                nums[i]=nums[right];
18                nums[right]=tempt;
19                right--;
20            }
21            else{
22                i++;
23            }
24        }
25    
26        
27    }
28}