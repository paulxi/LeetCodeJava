package com.leetcode.algorithm.hard.trappingrainwater;

class Solution {
  public int trap(int[] height) {
    if (height.length <= 1) {
      return 0;
    }

    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    int[] rightMax = new int[height.length];
    rightMax[rightMax.length - 1] = height[height.length - 1];
    for (int j = rightMax.length - 2; j >= 0; j--) {
      rightMax[j] = Math.max(height[j], rightMax[j + 1]);
    }

    int result = 0;
    for (int i = 1; i < height.length - 1; i++) {
      result += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return result;
  }
}
