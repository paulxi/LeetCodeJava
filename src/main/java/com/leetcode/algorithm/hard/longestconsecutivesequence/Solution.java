package com.leetcode.algorithm.hard.longestconsecutivesequence;

import java.util.Arrays;

class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int maxLength = 1;
    int last_i = 0;
    int duplicated = 0;
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - nums[i - 1] == 1) {
        maxLength = Math.max(maxLength, i - last_i - duplicated + 1);
      } else if (nums[i] == nums[i - 1]) {
        duplicated += 1;
      } else {
        duplicated = 0;
        last_i = i;
      }
    }

    return maxLength;
  }
}
