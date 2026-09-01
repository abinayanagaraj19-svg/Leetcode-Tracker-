// Last updated: 01/09/2026, 09:35:34
1import java.util.*;
2
3class Solution {
4    int[] dx = {1, -1, 0, 0};
5    int[] dy = {0, 0, 1, -1};
6
7    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
8        int n = grid.size();
9        int m = grid.get(0).size();
10
11        int[][] maxHealth = new int[n][m];
12        for (int i = 0; i < n; i++) {
13            Arrays.fill(maxHealth[i], -1);
14        }
15
16        int initialH = health - grid.get(0).get(0);
17        if (initialH <= 0) return false;
18
19        Queue<int[]> q = new LinkedList<>();
20        q.offer(new int[]{initialH, 0, 0});
21        maxHealth[0][0] = initialH;
22
23        while (!q.isEmpty()) {
24            int[] curr = q.poll();
25
26            int currH = curr[0];
27            int r = curr[1];
28            int c = curr[2];
29
30            if (r == n - 1 && c == m - 1) {
31                return true;
32            }
33
34            for (int d = 0; d < 4; d++) {
35                int nr = r + dx[d];
36                int nc = c + dy[d];
37
38                if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
39
40                int remH = currH - grid.get(nr).get(nc);
41
42                if (remH <= 0) continue;
43                if (remH <= maxHealth[nr][nc]) continue;
44
45                maxHealth[nr][nc] = remH;
46                q.offer(new int[]{remH, nr, nc});
47            }
48        }
49
50        return false;
51    }
52}