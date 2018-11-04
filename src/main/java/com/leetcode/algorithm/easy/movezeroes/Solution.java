package com.leetcode.algorithm.easy.movezeroes;

class Solution {
  public void moveZeroes(int[] nums) {
    int currentPointer = 0;

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] != 0) {
        nums[currentPointer] = nums[i];
        currentPointer++;
      }
    }

    for (int i = currentPointer; i <= nums.length - 1; i++) {
      nums[i] = 0;
    }
  }
}
