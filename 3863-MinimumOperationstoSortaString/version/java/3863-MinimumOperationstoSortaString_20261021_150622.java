// Last updated: 21/10/2026, 15:06:22
1import java.util.*;
2
3class Solution {
4    public int minOperations(String s) {
5        int n = s.length();
6        if (IntStream.range(1, n).allMatch(i -> s.charAt(i - 1) <= s.charAt(i))) return 0;  
7        if (n == 2) return -1;  
8        IntSummaryStatistics mid = s.chars().skip(1).limit(n - 2).summaryStatistics(); 
9        int first = s.charAt(0), last = s.charAt(n - 1), lo = mid.getMin(), hi = mid.getMax();
10        if (first <= Math.min(lo, last) || Math.max(first, hi) <= last) return 1;  
11        return last < lo && hi < first ? 3 : 2;  
12    }
13}