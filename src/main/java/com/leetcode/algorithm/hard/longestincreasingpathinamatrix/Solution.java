package com.leetcode.algorithm.hard.longestincreasingpathinamatrix;

class Solution {
  public int longestIncreasingPath(int[][] matrix) {
    if (matrix.length == 0) {
      return 0;
    }

    int m = matrix.length;
    int n = matrix[0].length;
    int[][] cahche = new int[m][n];
    int ans = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        ans = Math.max(ans, dfs(matrix, i, j, m, n, cahche));
      }
    }

    return ans;
  }

  private int dfs(int[][] matrix, int i, int j, int m, int n, int[][] cache) {
    if (cache[i][j] != 0) {
      return cache[i][j];
    }

    int[][] dirs = new int[][] {
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0}
    };

    for (int[] d: dirs) {
      int x = i + d[0];
      int y = j + d[1];
      if (0 <= x && x < m && 0 <= y && y < n && matrix[x][y] > matrix[i][j]) {
        cache[i][j] = Math.max(cache[i][j], dfs(matrix, x, y, m, n, cache));
      }
    }

    cache[i][j] += 1;
    return cache[i][j];
  }
}
