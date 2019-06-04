package com.leetcode.algorithm.easy.largestnumberatleasttwiceofothers;

class Solution {
  public int dominantIndex(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int idxLargest = -1;
    int idxSecond = -1;

    for (int i = 0; i < nums.length; i++) {
      if (idxLargest == -1) {
        idxLargest = i;
      } else if (idxSecond == -1) {
        if (nums[i] > nums[idxLargest]) {
          idxSecond = idxLargest;
          idxLargest = i;
        } else {
          idxSecond = i;
        }
      } else {
        if (nums[i] > nums[idxLargest]) {
          idxSecond = idxLargest;
          idxLargest = i;
        } else if (nums[i] > nums[idxSecond]) {
          idxSecond = i;
        }
      }
    }

    return nums[idxLargest] >= 2 * nums[idxSecond] ? idxLargest : -1;
  }
}
