# Last updated: 09/11/2026, 13:01:26
1class Solution:
2    def countSegments(self, s: str) -> int:
3        count=0
4        for i in range(len(s)):
5            if s[i] != ' ' and (i == 0 or s[i-1] == ' '):
6                count += 1
7
8        return count