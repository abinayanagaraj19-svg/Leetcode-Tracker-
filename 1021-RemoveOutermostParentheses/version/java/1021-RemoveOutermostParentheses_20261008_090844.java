// Last updated: 08/10/2026, 09:08:44
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder  ans=new StringBuilder();
4        int count=0;
5        for(char c:s.toCharArray()){
6            if(c=='('){
7                if(count>0){
8                    ans.append(c);
9                   
10                }count++;
11            }
12
13            else{
14                count--;
15                if(count>0){
16                    ans.append(c);
17                }
18            }
19        }
20        return ans.toString();
21    
22        
23    }
24}