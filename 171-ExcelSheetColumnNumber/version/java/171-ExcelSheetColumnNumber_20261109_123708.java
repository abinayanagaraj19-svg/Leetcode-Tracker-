// Last updated: 09/11/2026, 12:37:08
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int res=0;
4        for(char ch :columnTitle.toCharArray()){
5            res=res*26+(ch - 'A' + 1);
6
7        }
8        return res;
9    }
10}