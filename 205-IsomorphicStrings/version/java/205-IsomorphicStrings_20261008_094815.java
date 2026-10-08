// Last updated: 08/10/2026, 09:48:15
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        HashMap<Character,Character>mapST=new HashMap<>();
7        HashMap<Character,Character>mapTS=new HashMap<>();
8        for(int i=0;i<s.length();i++){
9            char a =s.charAt(i);
10            char b=t.charAt(i);
11            if(mapST.containsKey(a)&&mapST.get(a)!=b){
12                return false;
13            }
14            if(mapTS.containsKey(b)&&mapTS.get(b)!=a){
15                return false;
16            }
17            mapST.put(a,b);
18            mapTS.put(b,a);
19        }
20        return true;
21
22    }
23}
24