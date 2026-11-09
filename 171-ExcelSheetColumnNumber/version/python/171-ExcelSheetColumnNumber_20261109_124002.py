# Last updated: 09/11/2026, 12:40:02
1class Solution:
2    def titleToNumber(self, columnTitle: str) -> int:
3        res=0
4        for ch in columnTitle:
5            res=res*26+(ord(ch)-ord('A')+1)
6        return res