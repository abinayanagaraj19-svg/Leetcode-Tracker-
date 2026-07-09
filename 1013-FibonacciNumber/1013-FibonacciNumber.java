// Last updated: 09/07/2026, 15:07:59
class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
        
    }
}