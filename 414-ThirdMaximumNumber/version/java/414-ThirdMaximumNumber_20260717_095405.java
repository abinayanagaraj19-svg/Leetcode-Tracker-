// Last updated: 17/07/2026, 09:54:05
1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4        for(int i=digits.length-1;i>=0;i--){
5            if(digits[i]<9){
6                digits[i]++;
7                return digits;
8
9            }
10            digits[i]=0;
11
12        }
13        int[]result=new int[digits.length+1];
14        result[0]=1;
15        return result;
16        
17    }
18}