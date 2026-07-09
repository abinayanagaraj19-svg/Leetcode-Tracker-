// Last updated: 09/07/2026, 15:08:10
class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int tot = 0;
        for (int num : nums) {
            tot += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int right = tot - left - nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}