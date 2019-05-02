package com.leetcode.algorithm.easy.nondecreasingarray;

class Solution {
  public boolean checkPossibility(int[] nums) {
    int count = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) {
        count++;

        if (i < 2 || nums[i - 2] <= nums[i]) {
          nums[i - 1] = nums[i];
        } else {
          nums[i] = nums[i - 1];
        }
      }
    }

    return count <= 1;
  }
}
