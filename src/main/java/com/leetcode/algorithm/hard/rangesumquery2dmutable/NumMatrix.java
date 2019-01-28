package com.leetcode.algorithm.hard.rangesumquery2dmutable;

class NumMatrix {
  int[][] tree;
  int[][] nums;
  int m;
  int n;

  public NumMatrix(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return;
    }
    this.m = matrix.length;
    this.n = matrix[0].length;
    nums = new int[m][n];
    tree = new int[m + 1][n + 1];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        update(i, j, matrix[i][j]);
      }
    }
  }

  public void update(int row, int col, int val) {
    if (m == 0 || n == 0) {
      return;
    }

    int delta = val - nums[row][col];
    nums[row][col] = val;
    for (int i = row + 1; i <= m; i += i & (-i)) {
      for (int j = col + 1; j <= n; j += j & (-j)) {
        tree[i][j] += delta;
      }
    }
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    if (m == 0 || n == 0) {
      return 0;
    }

    return getSum(row2, col2) + getSum(row1 - 1, col1 - 1)
        - getSum(row1 - 1, col2) - getSum(row2, col1 - 1);
  }

  private int getSum(int row, int col) {
    int sum = 0;
    for (int i = row + 1; i > 0; i -= (i & -i)) {
      for (int j = col + 1; j > 0; j -= (j & -j)) {
        sum += tree[i][j];
      }
    }

    return sum;
  }
}
