// Last updated: 23/09/2026, 15:29:17
1class Solution {
2    public int numberOfSteps(int num) {
3        int count=0;
4        while(num!=0){
5            if(num%2==0){
6                int temp=num/2;
7                num=temp;
8            }else{
9                num=num-1;
10            }
11            count++;
12
13        }
14        return count;
15    }
16}