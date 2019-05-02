package com.leetcode.algorithm.medium.champagnetower;

class Solution {
  public double champagneTower(int poured, int query_row, int query_glass) {
    double[][] res = new double[101][101];
    res[0][0] = poured;
    for (int r = 0; r <= query_row; r++) {
      for (int c = 0; c <= r; c++) {
        double q = Math.max(0, (res[r][c] - 1.0) / 2);
        res[r + 1][c] += q;
        res[r + 1][c + 1] += q;
      }
    }

    return Math.min(1.0, res[query_row][query_glass]);
  }
}
