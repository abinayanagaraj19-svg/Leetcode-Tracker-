// Last updated: 09/07/2026, 15:08:06
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] arr = new int[10001];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += nums[i];
        }

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i : arr) {
            c = Math.max(a, b + i);
            b = a;
            a = c;
        }

        return c;
    }
}