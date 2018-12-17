package com.leetcode.algorithm.easy.toeplitzmatrix;

class Solution {
  public boolean isToeplitzMatrix(int[][] matrix) {
    int rowCount = matrix.length;
    if (rowCount == 0) {
      return true;
    }
    int colCount = matrix[0].length;

    for (int i = 0; i < colCount - 1; i++) {
      int col = i;
      int row = 0;
      int value = matrix[row][col];
      col++;
      row++;

      while (col < colCount && row < rowCount) {
        if (matrix[row][col] != value) {
          return false;
        }

        col++;
        row++;
      }
    }

    for (int i = 1; i < rowCount - 1; i++) {
      int col = 0;
      int row = i;
      int value = matrix[row][col];
      col++;
      row++;

      while (col < colCount && row < rowCount) {
        if (matrix[row][col] != value) {
          return false;
        }

        col++;
        row++;
      }
    }

    return true;
  }
}
