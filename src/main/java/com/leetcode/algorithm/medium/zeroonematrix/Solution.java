package com.leetcode.algorithm.medium.zeroonematrix;

import java.util.Arrays;

class Solution {
  public int[][] updateMatrix(int[][] matrix) {
    int rows = matrix.length;
    if (rows == 0) {
      return matrix;
    }
    int cols = matrix[0].length;

    int[][] dp = new int[rows][cols];
    for (int[] row: dp) {
      Arrays.fill(row, Integer.MAX_VALUE - 1);
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          dp[i][j] = 0;
        } else {
          if (i > 0) {
            dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
          }
          if (j > 0) {
            dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
          }
        }
      }
    }

    for (int i = rows - 1; i >= 0; i--) {
      for (int j = cols - 1; j >= 0; j--) {
        if (i < rows - 1) {
          dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
        }
        if (j < cols - 1) {
          dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
        }
      }
    }

    return dp;
  }
}
