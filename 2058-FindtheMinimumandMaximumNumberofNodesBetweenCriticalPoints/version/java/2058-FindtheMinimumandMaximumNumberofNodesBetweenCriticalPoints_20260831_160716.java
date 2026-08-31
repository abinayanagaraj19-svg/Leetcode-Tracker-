// Last updated: 31/08/2026, 16:07:16
1class Solution {
2    public int[] nodesBetweenCriticalPoints(ListNode head) {
3
4        int first = -1;
5        int last = -1;
6
7        int minDistance = Integer.MAX_VALUE;
8        int index = 1;
9
10        ListNode prev = head;
11        ListNode curr = head.next;
12
13        while (curr != null && curr.next != null) {
14
15            ListNode next = curr.next;
16
17            if ((curr.val > prev.val && curr.val > next.val) ||
18                (curr.val < prev.val && curr.val < next.val)) {
19
20                if (first == -1) {
21                    first = index;
22                } else {
23                    minDistance = Math.min(minDistance, index - last);
24                }
25
26                last = index;
27            }
28
29            prev = curr;
30            curr = next;
31            index++;
32        }
33
34        if (first == -1 || first == last) {
35            return new int[]{-1, -1};
36        }
37
38        int maxDistance = last - first;
39
40        return new int[]{minDistance, maxDistance};
41    }
42}