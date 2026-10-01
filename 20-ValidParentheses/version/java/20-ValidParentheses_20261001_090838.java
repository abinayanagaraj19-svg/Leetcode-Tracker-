// Last updated: 01/10/2026, 09:08:38
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>stack=new Stack<>();
4        
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='(' ||ch=='{' || ch=='['){
8                stack.push(ch);
9            }else{
10                if(stack.isEmpty()){
11                    return false;
12                }
13                char top=stack.pop();
14                if(ch=='}'&& top!='{'){
15                    return false;
16                }
17                if(ch==']'&&top!='['){
18                    return false;
19                }
20                if(ch==')'&&top!='('){
21                    return false;
22                }
23            }
24        }
25        return stack.isEmpty();
26        
27    }
28}