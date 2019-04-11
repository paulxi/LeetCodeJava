package com.leetcode.algorithm.medium.diagonaltraverse;

class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
    if (matrix.length == 0) {
      return new int[0];
    }

    int m = matrix.length;
    int n = matrix[0].length;

    int[] result = new int[m * n];
    int row = 0;
    int col = 0;
    int d = 0;
    int[][] dirs = {{-1, 1}, {1, -1}};

    for (int i = 0; i < m * n; i++) {
      result[i] = matrix[row][col];

      row += dirs[d][0];
      col += dirs[d][1];

      if (row >= m) {
        row = m - 1;
        col = col + 2;
        d = 1 - d;
      }

      if (col >= n) {
        row = row + 2;
        col = col - 1;
        d = 1 - d;
      }

      if (row < 0) {
        row = 0;
        d = 1 - d;
      }

      if (col < 0) {
        col = 0;
        d = 1 - d;
      }
    }

    return result;
  }
}
