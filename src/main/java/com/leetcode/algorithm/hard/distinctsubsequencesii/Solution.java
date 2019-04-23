package com.leetcode.algorithm.hard.distinctsubsequencesii;

import java.util.Arrays;

class Solution {
  public int distinctSubseqII(String str) {
    int mod = (int)1e9 + 7;
    int n = str.length();
    int[] dp = new int[n + 1];
    dp[0] = 1;

    int[] last = new int[26];
    Arrays.fill(last, -1);

    for (int i = 0; i < n; i++) {
      int x = str.charAt(i) - 'a';
      dp[i + 1] = 2 * dp[i] % mod;
      if (last[x] >= 0) {
        dp[i + 1] -= dp[last[x]];
      }

      dp[i + 1] %= mod;
      last[x] = i;
    }

    dp[n]--;
    if (dp[n] < 0) {
      dp[n] += mod;
    }

    return dp[n];
  }
}
