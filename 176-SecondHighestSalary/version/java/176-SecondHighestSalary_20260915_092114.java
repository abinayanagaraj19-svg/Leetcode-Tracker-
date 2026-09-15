// Last updated: 15/09/2026, 09:21:14
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        for (int i = 1; i < left; i++) {
10            prev = prev.next;
11        }
12
13        ListNode curr = prev.next;
14
15        for (int i = 0; i < right - left; i++) {
16
17            ListNode next = curr.next;
18
19            curr.next = next.next;
20
21            next.next = prev.next;
22
23            prev.next = next;
24        }
25
26        return dummy.next;
27    }
28}