// Last updated: 30/07/2026, 16:16:40
1import java.util.*;
2
3class Solution {
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5
6        Set<String> set = new HashSet<>(wordList);
7
8        if (!set.contains(endWord))
9            return 0;
10
11        Queue<String> queue = new LinkedList<>();
12        queue.offer(beginWord);
13
14        int level = 1;
15
16        while (!queue.isEmpty()) {
17
18            int size = queue.size();
19
20            for (int i = 0; i < size; i++) {
21
22                String word = queue.poll();
23
24                if (word.equals(endWord))
25                    return level;
26
27                char[] arr = word.toCharArray();
28
29                for (int j = 0; j < arr.length; j++) {
30
31                    char original = arr[j];
32
33                    for (char c = 'a'; c <= 'z'; c++) {
34
35                        arr[j] = c;
36                        String next = new String(arr);
37
38                        if (set.contains(next)) {
39                            queue.offer(next);
40                            set.remove(next); // Mark as visited
41                        }
42                    }
43
44                    arr[j] = original;
45                }
46            }
47
48            level++;
49        }
50
51        return 0;
52    }
53}