// Last updated: 20/10/2026, 18:37:01
1
2import java.util.*;
3
4class Solution {
5    int[][] rects;
6    int[] prefix;
7    int total;
8    Random random;
9
10    public Solution(int[][] rects) {
11        this.rects = rects;
12        int n = rects.length;
13
14        prefix = new int[n];
15        total = 0;
16        random = new Random();
17
18        for (int i = 0; i < n; i++) {
19            int[] r = rects[i];
20
21            int points = (r[2] - r[0] + 1)
22                       * (r[3] - r[1] + 1);
23
24            total += points;
25            prefix[i] = total;
26        }
27    }
28
29    public int[] pick() {
30        int target = random.nextInt(total) + 1;
31
32        int left = 0;
33        int right = prefix.length - 1;
34
35        while (left < right) {
36            int mid = left + (right - left) / 2;
37
38            if (prefix[mid] < target) {
39                left = mid + 1;
40            } else {
41                right = mid;
42            }
43        }
44
45        int[] r = rects[left];
46
47        int width = r[2] - r[0] + 1;
48        int offset = target - (left == 0 ? 0 : prefix[left - 1]) - 1;
49
50        int x = r[0] + offset % width;
51        int y = r[1] + offset / width;
52
53        return new int[]{x, y};
54    }
55}
56