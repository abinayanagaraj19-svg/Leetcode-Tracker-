// Last updated: 09/07/2026, 15:07:27
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){

            if(num.charAt(i)%2==1){
            return num.substring(0,i+1);
            }

        }
        return "";

        
    }
}