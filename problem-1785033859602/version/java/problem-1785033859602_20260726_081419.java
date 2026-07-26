// Last updated: 26/07/2026, 08:14:19
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n)return-1;
4        StringBuilder sb =new StringBuilder();
5        for(int i=0;i<n;i++){
6            int digit=Math.min(9,s);
7            sb.append(digit);
8            s-=digit;
9        }
10        int i=0;
11        while(i < sb.length() -1 && sb.charAt(i)=='0'){
12            i++;
13        }
14        return
15            Integer.parseInt(sb.substring(i));
16        
17    }
18}