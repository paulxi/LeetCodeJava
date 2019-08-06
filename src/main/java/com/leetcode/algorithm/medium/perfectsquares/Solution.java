package com.leetcode.algorithm.medium.perfectsquares;

import java.util.Arrays;

class Solution {
  public int numSquares(int num) {
    int[] dp = new int[num + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j * j <= i; j++) {
        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
      }
    }

    return dp[num];
  }
}
