package com.leetcode.algorithm.hard.numberofmusicplaylists;

class Solution {
  public int numMusicPlaylists(int n, int l, int k) {
    int mod = (int)1e9 + 7;

    long[][] dp = new long[l + 1][n + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= l; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i - 1][j - 1] * (n - (j - 1));
        dp[i][j] += dp[i - 1][j] * Math.max(j - k, 0);
        dp[i][j] %= mod;
      }
    }

    return (int)dp[l][n];
  }
}
