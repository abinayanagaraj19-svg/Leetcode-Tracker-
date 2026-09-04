// Last updated: 04/09/2026, 21:07:33
1class Solution {
2    public int minJumps(int[] arr) {
3
4        int n = arr.length;
5
6        if (n == 1) {
7            return 0;
8        }
9
10        Map<Integer, List<Integer>> map = new HashMap<>();
11
12        for (int i = 0; i < n; i++) {
13            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
14        }
15
16        Queue<Integer> queue = new LinkedList<>();
17        boolean[] visited = new boolean[n];
18
19        queue.offer(0);
20        visited[0] = true;
21
22        int steps = 0;
23
24        while (!queue.isEmpty()) {
25
26            int size = queue.size();
27
28            for (int x = 0; x < size; x++) {
29
30                int i = queue.poll();
31
32                if (i == n - 1) {
33                    return steps;
34                }
35
36                if (i - 1 >= 0 && !visited[i - 1]) {
37                    visited[i - 1] = true;
38                    queue.offer(i - 1);
39                }
40
41                if (i + 1 < n && !visited[i + 1]) {
42                    visited[i + 1] = true;
43                    queue.offer(i + 1);
44                }
45
46                List<Integer> sameValue = map.get(arr[i]);
47
48                for (int next : sameValue) {
49                    if (!visited[next]) {
50                        visited[next] = true;
51                        queue.offer(next);
52                    }
53                }
54
55                map.get(arr[i]).clear();
56            }
57
58            steps++;
59        }
60
61        return -1;
62    }
63}