// Last updated: 15/09/2026, 16:07:27
1class Solution {
2
3    List<List<Integer>> result = new ArrayList<>();
4
5    public List<List<Integer>> findSubsequences(int[] nums) {
6
7        backtrack(nums, 0, new ArrayList<>());
8
9        return result;
10    }
11
12    void backtrack(int[] nums, int start, List<Integer> current) {
13
14        if (current.size() >= 2) {
15            result.add(new ArrayList<>(current));
16        }
17
18        HashSet<Integer> used = new HashSet<>();
19
20        for (int i = start; i < nums.length; i++) {
21
22            if (!current.isEmpty() &&
23                nums[i] < current.get(current.size() - 1)) {
24                continue;
25            }
26
27            if (used.contains(nums[i])) {
28                continue;
29            }
30
31            used.add(nums[i]);
32
33            current.add(nums[i]);
34
35            backtrack(nums, i + 1, current);
36
37            current.remove(current.size() - 1);
38        }
39    }
40}