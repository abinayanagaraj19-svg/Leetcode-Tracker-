// Last updated: 20/10/2026, 18:35:01
1
2import java.util.*;
3
4class Solution {
5    public int numFactoredBinaryTrees(int[] arr) {
6        Arrays.sort(arr);
7
8        int n = arr.length;
9        long mod = 1_000_000_007L;
10
11        Map<Integer, Long> dp = new HashMap<>();
12
13        for (int i = 0; i < n; i++) {
14            dp.put(arr[i], 1L);
15
16            for (int j = 0; j < i; j++) {
17                int a = arr[j];
18                int b = arr[i] / a;
19
20                if (arr[i] % a == 0 && dp.containsKey(b)) {
21                    long ways = dp.get(a) * dp.get(b) % mod;
22                    dp.put(arr[i], (dp.get(arr[i]) + ways) % mod);
23                }
24            }
25        }
26
27        long ans = 0;
28
29        for (long ways : dp.values()) {
30            ans = (ans + ways) % mod;
31        }
32
33        return (int) ans;
34    }
35}
36