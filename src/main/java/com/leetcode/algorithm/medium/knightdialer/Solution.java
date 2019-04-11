package com.leetcode.algorithm.medium.knightdialer;

class Solution {
  public int knightDialer(int n) {
    int[][] dirs = new int[][]{{4,6},{6,8},{7,9},{4,8},{3,9,0},{},{1,7,0},{2,6},{1,3},{2,4}};

    int[][] dp = new int[n][10];

    for (int j = 0; j < 10; j++) {
      dp[0][j] = 1;
    }

    int mod = 1000000007;
    for (int i = 1; i < dp.length; i++) {
      for (int j = 0; j < 10; j++) {
        for (int num: dirs[j]) {
          dp[i][j] += dp[i -1][num];
          dp[i][j] %= mod;
        }
      }
    }

    int count = 0;
    for (int i = 0; i < 10; i++) {
      count += dp[n - 1][i];
      count %= mod;
    }

    return count;
  }
}
