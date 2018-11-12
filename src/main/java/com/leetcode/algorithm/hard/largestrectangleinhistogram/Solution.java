package com.leetcode.algorithm.hard.largestrectangleinhistogram;

class Solution {
  public int largestRectangleArea(int[] heights) {
    return calculateArea(heights, 0, heights.length - 1);
  }

  private int calculateArea(int[] heights, int start, int end) {
    if (start > end) {
      return 0;
    }

    int shortest = heights[start];
    int shortestIndex = start;
    for (int i = start + 1; i <= end; i++) {
      if (heights[i] < shortest) {
        shortest = heights[i];
        shortestIndex = i;
      }
    }

    int area = shortest * (end - start + 1);
    int leftArea = calculateArea(heights, start, shortestIndex - 1);
    int rightArea = calculateArea(heights, shortestIndex + 1, end);

    return Math.max(area, Math.max(leftArea, rightArea));
  }
}
