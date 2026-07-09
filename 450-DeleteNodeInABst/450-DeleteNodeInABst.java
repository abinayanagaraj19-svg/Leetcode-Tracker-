// Last updated: 09/07/2026, 15:08:34
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } 
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } 
        else {
            // Node found

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            TreeNode min = minValue(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, min.val);
        }

        return root;
    }

    private TreeNode minValue(TreeNode node) {
        while (node.left != null) {
            node=node.left;
        }
        return node;
    }
}