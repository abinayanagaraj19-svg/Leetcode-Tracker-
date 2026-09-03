// Last updated: 03/09/2026, 09:53:22
1class Solution {
2
3    class TrieNode {
4        TrieNode[] children = new TrieNode[26];
5        String word = null;
6    }
7
8    private TrieNode root = new TrieNode();
9    private int rows, cols;
10    private char[][] board;
11    private List<String> result = new ArrayList<>();
12
13    public List<String> findWords(char[][] board, String[] words) {
14
15        this.board = board;
16        rows = board.length;
17        cols = board[0].length;
18
19        for (String word : words) {
20            insert(word);
21        }
22
23        for (int i = 0; i < rows; i++) {
24            for (int j = 0; j < cols; j++) {
25                dfs(i, j, root);
26            }
27        }
28
29        return result;
30    }
31
32    private void insert(String word) {
33        TrieNode current = root;
34
35        for (char c : word.toCharArray()) {
36            int index = c - 'a';
37
38            if (current.children[index] == null) {
39                current.children[index] = new TrieNode();
40            }
41
42            current = current.children[index];
43        }
44
45        current.word = word;
46    }
47
48    private void dfs(int r, int c, TrieNode node) {
49
50        if (r < 0 || r >= rows || c < 0 || c >= cols) {
51            return;
52        }
53
54        char ch = board[r][c];
55
56        if (ch == '#') {
57            return;
58        }
59
60        TrieNode next = node.children[ch - 'a'];
61
62        if (next == null) {
63            return;
64        }
65
66        if (next.word != null) {
67            result.add(next.word);
68            next.word = null; 
69        }
70
71        board[r][c] = '#';
72
73        dfs(r + 1, c, next);
74        dfs(r - 1, c, next);
75        dfs(r, c + 1, next);
76        dfs(r, c - 1, next);
77
78        board[r][c] = ch;
79    }
80}