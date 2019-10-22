package com.leetcode.algorithm.medium.pathwithmaximumgold;

class Solution {
  public int getMaximumGold(int[][] grid) {
    int ans = 0;
    int m = grid.length;
    int n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        ans = Math.max(ans, dfs(grid, i, j, 0));
      }
    }
    return ans;
  }

  private int dfs(int[][] g, int i, int j, int sum) {
    if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] == 0 || g[i][j] > 100) {
      return sum;
    }

    sum += g[i][j];
    g[i][j] += 1000;
    int mx = 0;
    int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    for (int[] d: dirs) {
      mx = Math.max(mx, dfs(g, i + d[0], j + d[1], sum));
    }
    g[i][j] -= 1000;
    return mx;
  }
}
