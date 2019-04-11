package com.leetcode.algorithm.medium.knightprobability;

class Solution {
  public double knightProbability(int n, int k, int r, int c) {
    if (k == 0) {
      return 1;
    }

    double[][] dp = new double[n][n];
    int[][] dirs = {{2, -1}, {2, 1}, {-2, 1}, {-2, -1}, {1, -2}, {1, 2}, {-1, 2}, {-1, -2}};
    dp[r][c] = 1;
    double count = 0;

    for (int z = 0; z < k; z++) {
      double[][] dp2 = new double[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          for (int[] dir: dirs) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x < 0 || x >= n || y < 0 || y >= n) {
              continue;
            }

            dp2[x][y] += dp[i][j];
          }
        }
      }

      dp = dp2;
    }


    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        count += dp[i][j];
      }
    }

    return count / Math.pow(8, k);
  }
}
