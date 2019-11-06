package com.leetcode.algorithm.medium.findthederangementofanarray;

class Solution {
  public int findDerangement(int n) {
    if (n <= 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }

    long prevPrev = 0;
    long prev = 1;
    long curr = 0;
    long mod = 1000000007;
    for (int i = 3; i <= n; i++) {
      curr = (i - 1) * (prevPrev + prev) % mod;
      prevPrev = prev;
      prev = curr;
    }
    return (int)curr;
  }

  public int findDerangement2(int n) {
    if (n <= 1) {
      return 0;
    }

    long[] dp = new long[n + 1];
    long mod = 1000000007;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]) % mod;
    }
    return (int)dp[n];
  }
}
