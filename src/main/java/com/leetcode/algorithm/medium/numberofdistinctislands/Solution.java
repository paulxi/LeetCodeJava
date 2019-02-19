package com.leetcode.algorithm.medium.numberofdistinctislands;

import java.util.HashSet;
import java.util.Set;

class Solution {
  int[][] grid;
  boolean[][] seen;
  Set<Integer> shape;

  public int numDistinctIslands(int[][] grid) {
    this.grid = grid;
    int m = grid.length;
    int n = grid[0].length;

    seen = new boolean[m][n];
    Set<Set<Integer>> shapes = new HashSet<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        shape = new HashSet<>();
        helper(i, j, i, j);

        if (!shape.isEmpty()) {
          shapes.add(shape);
        }
      }
    }

    return shapes.size();
  }

  private void helper(int r, int c, int r1, int c1) {
    if (0 <= r && r < grid.length && 0 <= c && c < grid[0].length
        && grid[r][c] == 1 && !seen[r][c]) {
      seen[r][c] = true;
      shape.add((r - r1) * 50 * grid[0].length + c - c1);
      helper(r - 1, c, r1, c1);
      helper(r + 1, c, r1, c1);
      helper(r, c - 1, r1, c1);
      helper(r, c + 1, r1, c1);
    }
  }
}
