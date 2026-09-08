// Last updated: 08/09/2026, 09:06:36
1import java.util.*;
2
3class Solution {
4    public String largestNumber(int[] nums) {
5
6        String[] arr = new String[nums.length];
7
8        for (int i = 0; i < nums.length; i++) {
9            arr[i] = String.valueOf(nums[i]);
10        }
11
12        Arrays.sort(arr, (a, b) -> {
13            return (b + a).compareTo(a + b);
14        });
15
16        if (arr[0].equals("0")) {
17            return "0";
18        }
19
20        StringBuilder ans = new StringBuilder();
21
22        for (String s : arr) {
23            ans.append(s);
24        }
25
26        return ans.toString();
27    }
28}