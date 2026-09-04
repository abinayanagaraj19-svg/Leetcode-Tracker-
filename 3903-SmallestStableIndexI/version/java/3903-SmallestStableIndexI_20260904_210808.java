// Last updated: 04/09/2026, 21:08:08
1class Solution {
2    public int minimumDistance(int[] nums) {
3
4        Map<Integer, List<Integer>> map = new HashMap<>();
5
6        for (int i = 0; i < nums.length; i++) {
7            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
8        }
9
10        int answer = Integer.MAX_VALUE;
11
12        for (List<Integer> list : map.values()) {
13
14            for (int i = 0; i + 2 < list.size(); i++) {
15
16                int first = list.get(i);
17                int third = list.get(i + 2);
18
19                int distance = 2 * (third - first);
20
21                answer = Math.min(answer, distance);
22            }
23        }
24
25        return answer == Integer.MAX_VALUE ? -1 : answer;
26    }
27}