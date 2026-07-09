// Last updated: 09/07/2026, 15:07:01
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;

        else if (k<=(numOnes+numZeros))
        return numOnes;
        else{ 
        int rem = k-(numOnes+numZeros);
        return numOnes-rem;
        }
    }
}