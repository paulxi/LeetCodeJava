package com.leetcode.algorithm.hard.cherrypickup;

import java.util.Arrays;

class Solution {
  int[][][] memo;
  int[][] grid;
  int n;

  public int cherryPickup(int[][] grid) {
    this.grid = grid;
    this.n = grid.length;
    this.memo = new int[n][n][n];
    for (int[][] layer: memo) {
      for (int[] row: layer) {
        Arrays.fill(row, Integer.MIN_VALUE);
      }
    }

    return Math.max(0, dp(0, 0, 0));
  }

  private int dp(int r1, int c1, int c2) {
    int r2 = r1 + c1 - c2;

    if (r1 == n || c1 == n || r2 == n || c2 == n ||
        grid[r1][c1] == - 1 || grid[r2][c2] == -1) {
      return -99999;
    } else if (r1 == n - 1 && c1 == n - 1) {
      return grid[r1][c1];
    } else if (memo[r1][c1][c2] != Integer.MIN_VALUE) {
      return memo[r1][c1][c2];
    } else {
      int ans = grid[r1][c1];
      if (c1 != c2) {
        ans += grid[r2][c2];
      }

      ans += Math.max(Math.max(dp(r1, c1 + 1, c2 + 1), dp(r1 + 1, c1, c2 + 1)),
          Math.max(dp(r1, c1 + 1, c2), dp(r1 + 1, c1, c2)));
      memo[r1][c1][c2] = ans;

      return ans;
    }
  }
}
