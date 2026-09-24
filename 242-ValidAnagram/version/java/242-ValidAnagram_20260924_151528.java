// Last updated: 24/09/2026, 15:15:28
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        int count[]=new int[26];
7        for(int i=0;i<s.length();i++){
8            count[s.charAt(i)-'a']++;
9            count[t.charAt(i)-'a']--;
10        }
11        for(int i=0;i<26;i++){
12            if(count[i]!=0){
13                return false;
14            }
15        }
16        return true;
17    }
18}