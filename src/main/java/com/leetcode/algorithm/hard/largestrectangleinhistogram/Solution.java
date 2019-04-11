package com.leetcode.algorithm.hard.largestrectangleinhistogram;

import java.util.Stack;

class Solution {
//  public int largestRectangleArea(int[] heights) {
//    return calculateArea(heights, 0, heights.length - 1);
//  }
//
//  private int calculateArea(int[] heights, int start, int end) {
//    if (start > end) {
//      return 0;
//    }
//
//    int shortest = heights[start];
//    int shortestIndex = start;
//    for (int i = start + 1; i <= end; i++) {
//      if (heights[i] < shortest) {
//        shortest = heights[i];
//        shortestIndex = i;
//      }
//    }
//
//    int area = shortest * (end - start + 1);
//    int leftArea = calculateArea(heights, start, shortestIndex - 1);
//    int rightArea = calculateArea(heights, shortestIndex + 1, end);
//
//    return Math.max(area, Math.max(leftArea, rightArea));
//  }

  public int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
        int index = stack.pop();
        maxArea = Math.max(maxArea, heights[index] * (i - stack.peek() - 1));
      }

      stack.push(i);
    }

    while (stack.peek() != -1) {
      int index = stack.pop();
      maxArea = Math.max(maxArea, heights[index] * (heights.length - stack.peek() - 1));
    }

    return maxArea;
  }
}
