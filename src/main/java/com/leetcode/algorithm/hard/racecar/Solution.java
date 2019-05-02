package com.leetcode.algorithm.hard.racecar;

class Solution {
  int[] dp = new int[10001];

  public int racecar(int target) {
    if (dp[target] > 0) {
      return dp[target];
    }

    int n = (int) (Math.log(target) / Math.log(2)) + 1;
    if ((1 << n) - 1 == target) {
      return n;
    } else {
      // N times A, and 1 time P
      dp[target] = racecar((1 << n) - 1 - target) + n + 1;
      for (int m = 0; m < n - 1; m++) {
        //N-1 times A, 1 time P, and then Backward M times, and then Change direction 1 time
        dp[target] = Math.min(dp[target], racecar(target - (1 << (n - 1)) + (1 << m)) + n + m + 1);
      }
    }

    return dp[target];
  }
}
