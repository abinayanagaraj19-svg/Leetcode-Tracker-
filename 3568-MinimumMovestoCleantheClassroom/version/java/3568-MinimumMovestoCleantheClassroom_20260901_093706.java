// Last updated: 01/09/2026, 09:37:06
1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int m = classroom.length;
4        int n = classroom[0].length();
5        int[][] litterMap = new int[m][n];
6        int startX = -1, startY = -1;
7        int litterCount = 0;
8        
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                char c = classroom[i].charAt(j);
12                if (c == 'S') {
13                    startX = i;
14                    startY = j;
15                } else if (c == 'L') {
16                    litterMap[i][j] = litterCount++;
17                }
18            }
19        }
20        
21        if (litterCount == 0) return 0;
22        
23        int targetMask = (1 << litterCount) - 1;
24        Queue<int[]> q = new LinkedList<>();
25        q.offer(new int[]{startX, startY, energy, 0, 0});
26        
27        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << litterCount];
28        visited[startX][startY][energy][0] = true;
29        
30        int[] dirs = {-1, 0, 1, 0, -1};
31        
32        while (!q.isEmpty()) {
33            int[] curr = q.poll();
34            int r = curr[0], c = curr[1], e = curr[2], mask = curr[3], steps = curr[4];
35            
36            for (int i = 0; i < 4; i++) {
37                int nr = r + dirs[i];
38                int nc = c + dirs[i + 1];
39                
40                if (nr >= 0 && nr < m && nc >= 0 && nc < n && classroom[nr].charAt(nc) != 'X') {
41                    int nxt_e = e - 1;
42                    int nxt_mask = mask;
43                    char nextCell = classroom[nr].charAt(nc);
44                    
45                    if (nextCell == 'L') {
46                        nxt_mask |= (1 << litterMap[nr][nc]);
47                    }
48                    
49                    if (nxt_mask == targetMask) {
50                        return steps + 1;
51                    }
52                    
53                    if (nextCell == 'R') {
54                        nxt_e = energy;
55                    }
56                    
57                    if (nxt_e == 0 && nextCell != 'R') continue;
58                    
59                    if (!visited[nr][nc][nxt_e][nxt_mask]) {
60                        visited[nr][nc][nxt_e][nxt_mask] = true;
61                        q.offer(new int[]{nr, nc, nxt_e, nxt_mask, steps + 1});
62                    }
63                }
64            }
65        }
66        
67        return -1;
68    }
69}