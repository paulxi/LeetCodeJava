package com.leetcode.algorithm.hard.stickerstospellword;

class Solution {
  public int minStickers(String[] stickers, String target) {
    int n = target.length();
    int m = 1 << n;
    int[] dp = new int[m];
    for (int i = 0; i < m; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < m; i++) {
      if (dp[i] == Integer.MAX_VALUE) {
        continue;
      }
      for (String s: stickers) {
        int sup = i;
        for (char c: s.toCharArray()) {
          for (int r = 0; r < n; r++) {
            if (target.charAt(r) == c && ((sup >> r) & 1) == 0) {
              sup |= 1 << r;
              break;
            }
          }
        }
        dp[sup] = Math.min(dp[sup], dp[i] + 1);
      }
    }

    return dp[m - 1] != Integer.MAX_VALUE ? dp[m - 1] : -1;
  }
}
