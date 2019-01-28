package com.leetcode.algorithm.medium.kthsmallestelementinasortedmatrix;

class Solution {
  public int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length;
    int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int count = 0;
      int j = n - 1;
      for (int i = 0; i < n; i++) {
        while (j >= 0 && matrix[i][j] > mid) {
          j--;
        }
        count += j + 1;
      }

      if (count < k) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }

    return lo;
  }
}
