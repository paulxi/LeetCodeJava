package com.leetcode.algorithm.medium.containerwithmostwater;

class Solution {
  public int maxArea(int[] height) {
    int result = 0;
    int i = 0;
    int j = height.length - 1;
    while (i < j) {
      result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
      if (height[i] < height[j]) {
        i += 1;
      } else {
        j -= 1;
      }
    }

    return result;
  }
}
