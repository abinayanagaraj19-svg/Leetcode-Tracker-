// Last updated: 09/07/2026, 15:10:19
class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}