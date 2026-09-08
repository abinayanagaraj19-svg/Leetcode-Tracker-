// Last updated: 08/09/2026, 09:05:42
1class Solution {
2    public int minDepth(TreeNode root) {
3
4        if (root == null) {
5            return 0;
6        }
7
8        if (root.left == null) {
9            return 1 + minDepth(root.right);
10        }
11
12        if (root.right == null) {
13            return 1 + minDepth(root.left);
14        }
15
16        return 1 + Math.min(
17            minDepth(root.left),
18            minDepth(root.right)
19        );
20    }
21}