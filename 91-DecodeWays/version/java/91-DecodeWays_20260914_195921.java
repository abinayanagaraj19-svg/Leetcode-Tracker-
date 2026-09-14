// Last updated: 14/09/2026, 19:59:21
1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5
6        preorder(root, result);
7
8        return result;
9    }
10
11    public void preorder(TreeNode root, List<Integer> result) {
12
13        if (root == null) {
14            return;
15        }
16
17        result.add(root.val);
18
19        preorder(root.left, result);
20
21        preorder(root.right, result);
22    }
23}