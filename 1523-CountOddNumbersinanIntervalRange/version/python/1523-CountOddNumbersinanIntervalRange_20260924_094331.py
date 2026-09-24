# Last updated: 24/09/2026, 09:43:31
1class Solution:
2    def countOdds(self, low: int, high: int) -> int:
3        count=(high+1)//2-low//2
4        return count