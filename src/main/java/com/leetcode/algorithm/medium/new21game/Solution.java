package com.leetcode.algorithm.medium.new21game;

class Solution {
  public double new21Game(int n, int k, int w) {
    if (k == 0 || n >= k + w) {
      return 1.0;
    }
    double[] dp = new double[n + 1];
    double wsum = 1;
    double res = 0;
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      dp[i] = wsum / w;

      if (i < k) {
        wsum += dp[i];
      } else {
        res += dp[i];
      }

      if (i - w >= 0) {
        wsum -= dp[i - w];
      }
    }

    return res;
  }
}
