// Last updated: 27/07/2026, 20:24:35
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int minPrice = Integer.MAX_VALUE;
5        int maxProfit = 0;
6
7        for (int price : prices) {
8
9            if (price < minPrice) {
10                minPrice = price;
11            } else {
12                maxProfit = Math.max(maxProfit, price - minPrice);
13            }
14        }
15
16        return maxProfit;
17    }
18}