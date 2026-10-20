// Last updated: 20/10/2026, 18:38:08
1
2import java.util.*;
3
4class Solution {
5    public String[] findRestaurant(String[] list1, String[] list2) {
6        HashMap<String, Integer> map = new HashMap<>();
7
8        for (int i = 0; i < list1.length; i++) {
9            map.put(list1[i], i);
10        }
11
12        List<String> result = new ArrayList<>();
13        int minSum = Integer.MAX_VALUE;
14
15        for (int j = 0; j < list2.length; j++) {
16            String restaurant = list2[j];
17
18            if (map.containsKey(restaurant)) {
19                int sum = map.get(restaurant) + j;
20
21                if (sum < minSum) {
22                    result.clear();
23                    result.add(restaurant);
24                    minSum = sum;
25                } else if (sum == minSum) {
26                    result.add(restaurant);
27                }
28            }
29        }
30
31        return result.toArray(new String[0]);
32    }
33}
34