// Last updated: 24/09/2026, 10:03:28
1class Solution {
2    public int[] twoSum(int[] n, int t) {
3        int left=0;
4        int right=n.length-1;
5        while(left<right){
6            if(n[left]+n[right]==t){
7                return new int[]{left+1,right+1};
8            }else if(n[left]+n[right]<t){
9                left++;
10            }
11            else{
12                right--;
13            }
14        }
15        
16        return new int[]{-1, -1};
17    }
18}