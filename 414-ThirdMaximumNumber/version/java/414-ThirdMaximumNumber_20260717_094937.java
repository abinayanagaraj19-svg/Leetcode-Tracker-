// Last updated: 17/07/2026, 09:49:37
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max=nums[0];
4        int index=0;
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>max){
7                max=nums[i];
8                index=i;
9
10            }
11            
12        }
13        for (int i = 0; i < nums.length; i++) {
14            if (i != index && max < 2 * nums[i]) {
15                return -1;
16            }
17        }
18
19        return index;
20    }
21}