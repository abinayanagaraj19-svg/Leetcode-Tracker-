// Last updated: 02/09/2026, 20:21:13
1class Solution {
2    TreeNode first = null;
3    TreeNode second = null;
4    TreeNode prev = null;
5
6    public void recoverTree(TreeNode root) {
7        inorder(root);
8
9        int temp = first.val;
10        first.val = second.val;
11        second.val = temp;
12    }
13
14    private void inorder(TreeNode root) {
15        if (root == null) {
16            return;
17        }
18
19        inorder(root.left);
20
21        if (prev != null && prev.val > root.val) {
22            if (first == null) {
23                first = prev;
24            }
25
26            second = root;
27        }
28
29        prev = root;
30
31        inorder(root.right);
32    }
33}