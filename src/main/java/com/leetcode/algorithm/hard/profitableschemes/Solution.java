package com.leetcode.algorithm.hard.profitableschemes;

class Solution {
  public int profitableSchemes(int g, int p, int[] group, int[] profit) {
    int[][] dp = new int[p + 1][g + 1];
    dp[0][0] = 1;

    int res = 0;
    int mod = 1000000007;
    for (int k = 0; k < group.length; k++) {
      int gr = group[k];
      int pr = profit[k];

      for (int i = p; i >= 0; i--) {
        for (int j = g - gr; j >= 0; j--) {
          dp[Math.min(i + pr, p)][j + gr] = (dp[Math.min(i + pr, p)][j + gr] + dp[i][j]) % mod;
        }
      }
    }

    for (int x: dp[p]) {
      res = (res + x) % mod;
    }

    return res;
  }
}
