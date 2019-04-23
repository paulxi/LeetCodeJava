package com.leetcode.algorithm.hard.maxsumofrectanglenolargerthank;

import java.util.TreeSet;

class Solution {
  public int maxSumSubmatrix(int[][] matrix, int k) {
    if (matrix.length == 0) {
      return 0;
    }

    int row = matrix.length;
    int col = matrix[0].length;
    int res = Integer.MIN_VALUE;

    for (int l = 0; l < col; l++) {
      int[] sums = new int[row];
      for (int r = l; r < col; r++) {
        for (int i = 0; i < row; i++) {
          sums[i] += matrix[i][r];
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int curSum = 0;
        for (int sum: sums) {
          curSum += sum;
          Integer subres = set.ceiling(curSum - k);
          if (subres != null) {
            res = Math.max(res, curSum - subres);
          }
          set.add(curSum);
        }
      }
    }

    return res;
  }
}
