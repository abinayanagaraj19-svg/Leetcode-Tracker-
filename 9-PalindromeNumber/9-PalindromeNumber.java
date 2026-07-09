// Last updated: 09/07/2026, 15:10:59
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int org=x;
        int rev=0;
        while (x!=0){
            rev=rev*10 + x%10;
            x=x/10;
        }
        if (rev==org){
            return true;
        }else{
            return false;
        }
    }
}