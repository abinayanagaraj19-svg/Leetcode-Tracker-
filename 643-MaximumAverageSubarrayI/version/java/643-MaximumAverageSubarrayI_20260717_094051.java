// Last updated: 17/07/2026, 09:40:51
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int maxSum=sum;
8        for (int i = k; i < nums.length; i++) {
9            sum = sum - nums[i - k] + nums[i];
10
11            if (sum > maxSum) {
12                maxSum = sum;
13            }
14        }
15
16        return (double) maxSum / k;
17      
18
19        
20        
21    }
22}