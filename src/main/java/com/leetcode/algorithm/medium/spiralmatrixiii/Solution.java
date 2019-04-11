package com.leetcode.algorithm.medium.spiralmatrixiii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[][] spiralMatrixIII(int rows, int cols, int r, int c) {
    List<int[]> ans = new ArrayList<>();
    int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    int len = 0;
    int d = 0;

    ans.add(new int[] {r, c});

    while (ans.size() < rows * cols) {
      if (d == 0 || d == 2) {
        len++;
      }

      for (int i = 0; i < len; i++) {
        r += dirs[d][0];
        c += dirs[d][1];

        if (r >= 0 && r < rows && c >= 0 && c < cols) {
          ans.add(new int[] {r, c});
        }
      }
      d = (d + 1) % 4;
    }

    return ans.toArray(new int[rows * cols][2]);
  }
}
