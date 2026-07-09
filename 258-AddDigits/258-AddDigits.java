// Last updated: 09/07/2026, 15:09:03
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                int a=num%10;
                sum+=a;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}