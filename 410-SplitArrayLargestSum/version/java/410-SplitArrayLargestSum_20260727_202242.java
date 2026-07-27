// Last updated: 27/07/2026, 20:22:42
1class Solution {
2
3    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
4
5        double low = 0.0;
6        double high = 1.0;
7
8        while (true) {
9
10            double mid = (low + high) / 2;
11
12            int total = 0;
13
14            int numerator = 0;
15            int denominator = 1;
16
17            int j = 1;
18
19            for (int i = 0; i < arr.length - 1; i++) {
20
21                while (j < arr.length &&
22                       arr[i] > mid * arr[j]) {
23                    j++;
24                }
25
26                if (j == arr.length)
27                    break;
28
29                total += arr.length - j;
30
31                if ((long) numerator * arr[j] <
32                    (long) denominator * arr[i]) {
33
34                    numerator = arr[i];
35                    denominator = arr[j];
36                }
37            }
38
39            if (total == k)
40                return new int[]{numerator, denominator};
41
42            if (total < k)
43                low = mid;
44            else
45                high = mid;
46        }
47    }
48}