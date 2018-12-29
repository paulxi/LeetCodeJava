package com.leetcode.algorithm.medium.jumpgame;

class Solution {
  public boolean canJump(int[] nums) {
    int currentMax = 0;
    int i = 0;
    int nextMax = 0;

    while (currentMax - i + 1 > 0) {
      for (;i <= currentMax; i++) {
        nextMax = Math.max(nextMax, nums[i] + i);
        if (nextMax >= nums.length - 1) {
          return true;
        }
      }

      if (nextMax == currentMax) {
        return false;
      }

      currentMax = nextMax;
    }

    return false;
  }
}
