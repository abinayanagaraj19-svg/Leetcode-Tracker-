// Last updated: 27/09/2026, 17:46:09
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int ans[]=new int[nums.length];
4        int a=0;
5        int b=n;
6        int c=0;
7        for(int i=0;i<n;i++){
8           ans[c]=nums[a];
9            a++;
10            c++;
11           ans[c]=nums[b];
12            c++;
13            b++;
14           
15
16        }
17        return ans;
18    }
19}