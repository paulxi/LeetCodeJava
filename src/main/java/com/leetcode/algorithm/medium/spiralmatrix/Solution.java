package com.leetcode.algorithm.medium.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length > 0) {
      fill(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1,
          result);
    }
    return result;
  }

  private void fill(int[][] matrix, int rowBegin, int rowEnd, int colBegin, int colEnd,
                    List<Integer> list) {
    if (rowBegin <= rowEnd && colBegin <= colEnd) {
      for (int col = colBegin; col <= colEnd; col++) {
        list.add(matrix[rowBegin][col]);
      }

      for (int row = rowBegin + 1; row <= rowEnd; row++) {
        list.add(matrix[row][colEnd]);
      }

      if (colEnd > colBegin && rowEnd > rowBegin) {
        for (int col = colEnd - 1; col >= colBegin; col--) {
          list.add(matrix[rowEnd][col]);
        }

        for (int row = rowEnd - 1; row >= rowBegin + 1; row--) {
          list.add(matrix[row][colBegin]);
        }
      }

      fill(matrix, rowBegin + 1, rowEnd - 1, colBegin + 1, colEnd - 1, list);
    }
  }
}
