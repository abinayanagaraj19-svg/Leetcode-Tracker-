// Last updated: 23/09/2026, 18:15:12
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int pro=1;
4        int sum=0;
5        while(n!=0){
6            sum+=n%10;
7            pro*=n%10;
8            n=n/10;
9
10        }
11        
12        return pro-sum;
13    }
14}