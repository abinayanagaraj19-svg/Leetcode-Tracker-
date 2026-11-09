# Last updated: 09/11/2026, 12:31:03
1class Solution:
2    def convertToTitle(self, columnNumber: int) -> str:
3        result=""
4        while columnNumber>0:
5            columnNumber-=1
6            reminder=columnNumber%26
7            ch=chr(ord('A')+reminder)
8            result+=ch
9            columnNumber//=26
10        return result[::-1]