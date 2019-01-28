package com.leetcode.algorithm.medium.minimumpathsum;

class Solution {
  public int minPathSum(int[][] grid) {
    if (grid.length == 0 || grid[0].length == 0) {
      return 0;
    }

    int m = grid.length;
    int n = grid[0].length;
    int[] dp = new int[n];

    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        if (i == m - 1 && j != n - 1) {
          dp[j] = grid[i][j] + dp[j + 1];
        } else if (j == n - 1 && i != m - 1) {
          dp[j] = grid[i][j] + dp[j];
        } else if (i != m - 1 && j != n - 1) {
          dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
        } else {
          dp[j] = grid[i][j];
        }
      }
    }
    return dp[0];
  }
}
