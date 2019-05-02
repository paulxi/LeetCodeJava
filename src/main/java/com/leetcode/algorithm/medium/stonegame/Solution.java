package com.leetcode.algorithm.medium.stonegame;

import java.util.Arrays;

class Solution {
//  public boolean stoneGame(int[] piles) {
//    int n = piles.length;
//    int[][] dp = new int[n][n];
//    for (int i = 0; i < n; i++) {
//      dp[i][i] = piles[i];
//    }
//
//    for (int d = 1; d < n; d++) {
//      for (int i = 0; i < n - d; i++) {
//        dp[i][i + d] = Math.max(piles[i] - dp[i + 1][i + d], piles[i + d] - dp[i][i + d - 1]);
//      }
//    }
//
//    return dp[0][n - 1] > 0;
//  }

  public boolean stoneGame(int[] piles) {
    int[] dp = Arrays.copyOf(piles, piles.length);

    for (int d = 1; d < piles.length; d++) {
      for (int i = 0; i < piles.length - d; i++) {
        dp[i] = Math.max(piles[i] - dp[i + 1], piles[i + d] - dp[i]);
      }
    }

    return dp[0] > 0;
  }
}
