// Last updated: 14/09/2026, 19:58:40
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5
6        inorder(root, result);
7
8        return result;
9    }
10
11    public void inorder(TreeNode root, List<Integer> result) {
12
13        if (root == null) {
14            return;
15        }
16
17        inorder(root.left, result);
18
19        result.add(root.val);
20
21        inorder(root.right, result);
22    }
23}