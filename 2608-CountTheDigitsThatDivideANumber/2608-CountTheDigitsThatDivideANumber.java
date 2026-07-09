// Last updated: 09/07/2026, 15:07:10
class Solution {
    public int countDigits(int num) {
        int digit,count=0;
        int org=num;
        while(num!=0){
            digit=num%10;
            if(org%digit==0){
                count++;
            }
            num=num/10;
        }
        return count;

        
    }
}