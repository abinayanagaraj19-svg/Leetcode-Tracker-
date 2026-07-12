// Last updated: 12/07/2026, 21:02:16
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permuteUnique(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums); 
7        boolean[] used = new boolean[nums.length];
8        backtrack(nums, used, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(int[] nums, boolean[] used, 
13                            List<Integer> current, List<List<Integer>> result) {
14        if (current.size() == nums.length) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18
19        for (int i = 0; i < nums.length; i++) {
20            if (used[i]) continue;
21
22            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
23
24            used[i] = true;
25            current.add(nums[i]);
26
27            backtrack(nums, used, current, result);
28
29            used[i] = false;
30            current.remove(current.size() - 1);
31        }
32    }
33}