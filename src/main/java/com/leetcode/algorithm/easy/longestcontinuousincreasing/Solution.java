package com.leetcode.algorithm.easy.longestcontinuousincreasing;

class Solution {
  public int findLengthOfLCIS(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int pos = 0;
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] <= nums[i - 1]) {
        pos = i;
      }
      ans = Math.max(ans, i - pos + 1);
    }

    return ans;
  }
}
