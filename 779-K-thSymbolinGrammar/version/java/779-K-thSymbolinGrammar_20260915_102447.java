// Last updated: 15/09/2026, 10:24:47
1class Solution {
2    public int kthGrammar(int n, int k) {
3        if (n == 1) {
4            return 0;
5        }
6        int middle = (int)Math.pow(2, n - 2);
7
8        if (k <= middle) {
9            return kthGrammar(n - 1, k);
10        } else {
11            return 1 - kthGrammar(n - 1, k - middle);
12        }
13    }
14}