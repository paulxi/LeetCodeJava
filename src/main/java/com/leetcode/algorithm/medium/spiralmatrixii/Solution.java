package com.leetcode.algorithm.medium.spiralmatrixii;

class Solution {
  public int[][] generateMatrix(int n) {
    int[][] ans = new int[n][n];
    fill(ans, 0, n - 1, 1);

    return ans;
  }

  private void fill(int[][] ans, int from, int to, int num) {
    if (from <= to) {
      for (int col = from; col <= to; col++) {
        ans[from][col] = num;
        num++;
      }

      for (int row = from + 1; row <= to; row++) {
        ans[row][to] = num;
        num++;
      }

      for (int col = to - 1; col >= from; col--) {
        ans[to][col] = num;
        num++;
      }

      for (int row = to - 1; row >= from + 1; row--) {
        ans[row][from] = num;
        num++;
      }

      fill(ans, from + 1, to - 1, num);
    }
  }
}
