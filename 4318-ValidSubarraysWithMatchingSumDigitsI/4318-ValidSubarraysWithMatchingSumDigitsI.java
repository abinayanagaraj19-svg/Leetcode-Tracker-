// Last updated: 09/07/2026, 15:06:44
import java.util.*;

class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;

        int n = nums.length;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (isValid(sum, x)) {
                    ans++;
                }
            }
        }

        return (int) ans;
    }

    private boolean isValid(long sum, int x) {
        if (sum < 0) return false;

        int lastDigit = (int)(sum % 10);
        if (lastDigit != x) return false;

        long temp = sum;
        while (temp >= 10) {
            temp /= 10;
        }

        int firstDigit = (int) temp;
        return firstDigit == x;
    }
}