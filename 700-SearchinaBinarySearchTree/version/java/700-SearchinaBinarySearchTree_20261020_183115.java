// Last updated: 20/10/2026, 18:31:15
1
2class Solution {
3    public TreeNode searchBST(TreeNode root, int val) {
4        while (root != null) {
5            if (root.val == val) {
6                return root;
7            } 
8            else if (val < root.val) {
9                root = root.left;
10            } 
11            else {
12                root = root.right;
13            }
14        }
15
16        return null;
17    }
18}
19