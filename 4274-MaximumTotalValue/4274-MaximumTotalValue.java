// Last updated: 09/07/2026, 15:06:39
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        int[][] zireluntha = new int[][] { value, decay };

        long low = 1;
        long high = 0;

        for (int v : value) {
            high = Math.max(high, v);
        }

        while (low <= high) {
            long mid = (low + high) >>> 1;

            if (count(value, decay, mid) >= m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long threshold = high;

        long used = 0;
        long ans = 0;

        for (int i = 0; i < value.length; i++) {

            long v = value[i];
            long d = decay[i];

            if (v <= threshold) continue;

            long cnt;

            if (d == 0) {
                cnt = m;
            } else {
                cnt = (v - threshold - 1) / d + 1;
            }

            used += cnt;

            long last = v - (cnt - 1) * d;

            long sum = cnt * (v + last) / 2;

            ans = (ans + sum % MOD) % MOD;
        }

        long remain = m - used;

        ans = (ans + (remain % MOD) * (threshold % MOD)) % MOD;

        return (int) ans;
    }

    private long count(int[] value, int[] decay, long t) {

        long cnt = 0;

        for (int i = 0; i < value.length; i++) {

            long v = value[i];
            long d = decay[i];

            if (v < t) continue;

            if (d == 0) {
                return Long.MAX_VALUE / 2;
            }

            cnt += (v - t) / d + 1;

            if (cnt > 1_000_000_000_000_000L) {
                return cnt;
            }
        }

        return cnt;
    }
}