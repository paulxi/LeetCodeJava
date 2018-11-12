package com.leetcode.algorithm.hard.maximalrectangle;

class Solution {
  public int maximalRectangle(char[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }

    int[] heights = new int[matrix[0].length];
    int result = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == '1') {
          heights[j] += 1;
        } else {
          heights[j] = 0;
        }
      }

      result = Math.max(result, largestRectangleArea(heights));
    }

    return result;
  }

  private int largestRectangleArea(int[] heights) {
    if (heights.length == 0) {
      return 0;
    }
    if (heights.length == 1) {
      return heights[0];
    }

    int[] lessFromLeft = new int[heights.length];
    int[] lessFromRight = new int[heights.length];
    lessFromLeft[0] = -1;
    lessFromRight[heights.length - 1] = heights.length;

    for (int i = 1; i < heights.length; i++) {
      int p = i - 1;
      while (p >= 0 && heights[p] >= heights[i]) {
        p = lessFromLeft[p];
      }
      lessFromLeft[i] = p;
    }

    for (int i = heights.length - 2; i >= 0; i--) {
      int p = i + 1;
      while (p < heights.length && heights[p] >= heights[i]) {
        p = lessFromRight[p];
      }
      lessFromRight[i] = p;
    }

    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      maxArea = Math.max(maxArea, heights[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
    }
    return maxArea;
  }
}
