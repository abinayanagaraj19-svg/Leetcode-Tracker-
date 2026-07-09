// Last updated: 09/07/2026, 15:09:05
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // remove out-of-window indices
            while (!dq.isEmpty() &&
                   dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // remove smaller elements
            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}