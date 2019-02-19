package com.leetcode.algorithm.medium.searcha2dmatrix;

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    int lo = 0;
    int hi = m * n;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int row = mid / n;
      int col = mid % n;

      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] < target) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }

    return false;
  }
}
