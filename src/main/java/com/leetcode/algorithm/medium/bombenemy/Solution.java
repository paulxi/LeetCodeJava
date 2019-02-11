package com.leetcode.algorithm.medium.bombenemy;

class Solution {
  public int maxKilledEnemies(char[][] grid) {
    int m = grid.length;
    if (m == 0) {
      return 0;
    }
    int n = grid[0].length;
    int result = 0;
    int rowHits = 0;
    int[] colHits = new int[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (j == 0 || grid[i][j - 1] == 'W') {
          rowHits = 0;
          for (int k = j; k < n && grid[i][k] != 'W'; k++) {
            rowHits += grid[i][k] == 'E' ? 1 : 0;
          }
        }

        if (i == 0 || grid[i - 1][j] == 'W') {
          colHits[j] = 0;
          for (int k = i; k < m && grid[k][j] != 'W'; k++) {
            colHits[j] += grid[k][j] == 'E' ? 1 : 0;
          }
        }

        if (grid[i][j] == '0') {
          result = Math.max(result, rowHits + colHits[j]);
        }
      }
    }

    return result;
  }
}
