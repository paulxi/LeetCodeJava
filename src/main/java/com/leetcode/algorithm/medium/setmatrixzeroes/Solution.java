package com.leetcode.algorithm.medium.setmatrixzeroes;

class Solution {
  enum Flag {
    None, RowOnly, ColumnOnly, Both
  }

  public void setZeroes(int[][] matrix) {
    if (matrix.length == 0) {
      return;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    Flag flag = Flag.None;
    if (matrix[0][0] == 0) {
      flag = Flag.Both;
    } else {
      for (int i = 1; i < m; i++) {
        if (matrix[i][0] == 0) {
          flag = Flag.ColumnOnly;
          break;
        }
      }

      for (int j = 1; j < n; j++) {
        if (matrix[0][j] == 0) {
          if (flag == Flag.ColumnOnly) {
            flag = Flag.Both;
          } else {
            flag = Flag.RowOnly;
          }

          break;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      if (matrix[i][0] == 0) {
        for (int j = 1; j < n; j++) {
          matrix[i][j] = 0;
        }
      }
    }

    for (int j = 1; j < n; j++) {
      if (matrix[0][j] == 0) {
        for (int i = 1; i < m; i++) {
          matrix[i][j] = 0;
        }
      }
    }

    if (flag == Flag.ColumnOnly || flag == Flag.Both) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }

    if (flag == Flag.RowOnly || flag == Flag.Both) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }
  }
}
