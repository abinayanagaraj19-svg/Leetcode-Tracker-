// Last updated: 02/09/2026, 20:20:29
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        if (n == 0) {
4            return new ArrayList<>();
5        }
6
7        return build(1, n);
8    }
9
10    private List<TreeNode> build(int start, int end) {
11        List<TreeNode> result = new ArrayList<>();
12
13        if (start > end) {
14            result.add(null);
15            return result;
16        }
17
18        for (int root = start; root <= end; root++) {
19
20            List<TreeNode> leftTrees = build(start, root - 1);
21
22            List<TreeNode> rightTrees = build(root + 1, end);
23
24            for (TreeNode left : leftTrees) {
25                for (TreeNode right : rightTrees) {
26
27                    TreeNode node = new TreeNode(root);
28
29                    node.left = left;
30                    node.right = right;
31
32                    result.add(node);
33                }
34            }
35        }
36
37        return result;
38    }
39}