// Last updated: 03/09/2026, 09:51:22
1class Solution {
2    TreeNode prev = null;
3
4    public boolean isValidBST(TreeNode root) {
5        if (root == null) {
6            return true;
7        }
8
9        if (!isValidBST(root.left)) {
10            return false;
11        }
12
13        if (prev != null && root.val <= prev.val) {
14            return false;
15        }
16
17        prev = root;
18
19        return isValidBST(root.right);
20    }
21}