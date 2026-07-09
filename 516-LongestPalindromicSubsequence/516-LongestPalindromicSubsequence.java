// Last updated: 09/07/2026, 15:08:26
class Solution {
    public int recursion(String s,int start,int end,HashMap<String,Integer>map){
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        String t=start+","+end;
        if(map.containsKey(t)){
            return map.get(t);
        }
        int ans;
        if(s.charAt(start)==s.charAt(end)){
            ans=2+recursion(s,start+1,end-1,map);
        }else{
            ans= Math.max(recursion(s,start,end-1,map),recursion(s,start+1,end,map));
            map.put(t,ans);
            return ans;
        }
        map.put(t,ans);
        return ans;
    }
    public int longestPalindromeSubseq(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        return recursion(s,0,s.length()-1,map);
        
    }
}