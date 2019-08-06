package com.leetcode.algorithm.medium.fourkeyskeyboard;

class Solution {
  public int maxA(int n) {
    int[] dp = new int[n + 1];
    for (int k = 1; k <= n; k++) {
      dp[k] = dp[k - 1] + 1;
      // unknown operation,   Ctrl A, Ctrl C, Ctrl V
      // k-3(x might be here)  k-2      k-1      k
      for (int x = 0; x <= k - 3; x++) {
        dp[k] = Math.max(dp[k], dp[x] + dp[x] * (k - x - 2));
      }
    }

    return dp[n];
  }
}
