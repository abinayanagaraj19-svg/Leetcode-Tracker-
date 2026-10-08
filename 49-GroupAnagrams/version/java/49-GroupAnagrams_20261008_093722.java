// Last updated: 08/10/2026, 09:37:22
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>>map=new HashMap<>();
4        for(String s:strs){
5            char[]arr=s.toCharArray();
6            Arrays.sort(arr);
7            String key =new String(arr);
8            if(!map.containsKey(key)){
9                map.put(key,new ArrayList<>());
10            }
11            map.get(key).add(s);
12        }        
13        return new ArrayList<>(map.values());
14    }
15}