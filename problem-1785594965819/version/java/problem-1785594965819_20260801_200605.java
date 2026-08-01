// Last updated: 01/08/2026, 20:06:05
1class Solution {
2    public int countValidPrefixes(String s) {
3        int a=0;
4        int b=0;
5        int ans=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='0'){
8                a++;
9            }else{
10                b++;
11            }
12            if(Math.abs(a-b)<=1){
13                ans++;
14            }
15        }
16        return ans;
17    }
18}