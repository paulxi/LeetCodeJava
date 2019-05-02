package com.leetcode.algorithm.easy.magicsquaresingrid;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int numMagicSquaresInside(int[][] grid) {
    int r = grid.length;
    int c = grid[0].length;
    int ans = 0;
    for (int i = 0; i < r - 2; i++) {
      for (int j = 0; j < c - 2; j++) {
        if (grid[i + 1][j + 1] != 5) {
          continue;
        }

        if (magic(
            grid[i][j],
            grid[i][j + 1],
            grid[i][j + 2],
            grid[i + 1][j],
            grid[i + 1][j + 1],
            grid[i + 1][j + 2],
            grid[i + 2][j],
            grid[i + 2][j + 1],
            grid[i + 2][j + 2])) {
          ans++;
        }
      }
    }

    return ans;
  }

  private boolean magic(int... vals) {
    Set<Integer> set = new HashSet<>();
    for (int v : vals) {
      if (v < 1 || v > 9) {
        return false;
      }
      if (!set.add(v)) {
        return false;
      }
    }

    return (vals[0] + vals[1] + vals[2] == 15
        && vals[3] + vals[4] + vals[5] == 15
        && vals[6] + vals[7] + vals[8] == 15
        && vals[0] + vals[3] + vals[6] == 15
        && vals[1] + vals[4] + vals[7] == 15
        && vals[2] + vals[5] + vals[8] == 15
        && vals[0] + vals[4] + vals[8] == 15
        && vals[2] + vals[4] + vals[6] == 15);
  }
}
