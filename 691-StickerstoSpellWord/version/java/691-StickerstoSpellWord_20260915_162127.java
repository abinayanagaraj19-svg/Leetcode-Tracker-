// Last updated: 15/09/2026, 16:21:27
1class Solution {
2    public boolean isCousins(TreeNode root, int x, int y) {
3
4        Queue<TreeNode> queue = new LinkedList<>();
5        queue.offer(root);
6
7        while (!queue.isEmpty()) {
8
9            int size = queue.size();
10
11            boolean foundX = false;
12            boolean foundY = false;
13
14            for (int i = 0; i < size; i++) {
15
16                TreeNode node = queue.poll();
17
18                if (node.left != null && node.right != null) {
19
20                    if ((node.left.val == x && node.right.val == y) ||
21                        (node.left.val == y && node.right.val == x)) {
22
23                        return false;
24                    }
25                }
26
27                if (node.val == x) {
28                    foundX = true;
29                }
30
31                if (node.val == y) {
32                    foundY = true;
33                }
34
35                if (node.left != null) {
36                    queue.offer(node.left);
37                }
38
39                if (node.right != null) {
40                    queue.offer(node.right);
41                }
42            }
43
44            if (foundX && foundY) {
45                return true;
46            }
47
48            if (foundX || foundY) {
49                return false;
50            }
51        }
52
53        return false;
54    }
55}