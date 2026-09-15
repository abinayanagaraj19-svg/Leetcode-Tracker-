// Last updated: 15/09/2026, 16:13:52
class Solution {
    public int minStickers(String[] stickers, String target) {
        int n = target.length();
        int size = 1 << n;

        int[] dp = new int[size];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Precompute frequency of each sticker
        int[][] freq = new int[stickers.length][26];
        for (int i = 0; i < stickers.length; i++) {
            for (char c : stickers[i].toCharArray()) {
                freq[i][c - 'a']++;
            }
        }

        for (int mask = 0; mask < size; mask++) {
            if (dp[mask] == Integer.MAX_VALUE) continue;

            for (int[] sticker : freq) {
                int[] cnt = sticker.clone();
                int newMask = mask;

                for (int i = 0; i < n; i++) {
                    if (((newMask >> i) & 1) == 1) continue;

                    char ch = target.charAt(i);
                    if (cnt[ch - 'a'] > 0) {
                        cnt[ch - 'a']--;
                        newMask |= (1 << i);
                    }
                }

                dp[newMask] = Math.min(dp[newMask], dp[mask] + 1);
            }
        }

        return dp[size - 1] == Integer.MAX_VALUE ? -1 : dp[size - 1];
    }
}