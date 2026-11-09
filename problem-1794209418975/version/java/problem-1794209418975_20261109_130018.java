// Last updated: 09/11/2026, 13:00:18
1class Solution {
2    public int countSegments(String s) {
3      int count =0;
4      for(int i=0;i<s.length();i++){
5         if (s.charAt(i) != ' ' &&
6                (i == 0 || s.charAt(i - 1) == ' ')) {
7            count++;
8        }
9      }  
10      return count;
11    }
12}