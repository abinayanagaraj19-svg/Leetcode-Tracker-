// Last updated: 31/08/2026, 16:19:36
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        backtrack(candidates, target, 0, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] candidates, int target, int start,
14                            List<Integer> current,
15                            List<List<Integer>> result) {
16
17        if (target == 0) {
18            result.add(new ArrayList<>(current));
19            return;
20        }
21
22        if (target < 0) {
23            return;
24        }
25
26        for (int i = start; i < candidates.length; i++) {
27
28            current.add(candidates[i]);
29
30            backtrack(
31                candidates,
32                target - candidates[i],
33                i,
34                current,
35                result
36            );
37
38            current.remove(current.size() - 1);
39        }
40    }
41}