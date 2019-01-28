package com.leetcode.algorithm.medium.houserobberii;

class Solution {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
  }

  private int rob(int[] nums, int lo, int hi) {
    int include = 0;
    int exclude = 0;
    for (int j = lo; j <= hi; j++) {
      int i = include;
      int e = exclude;
      include = e + nums[j];
      exclude = Math.max(e, i);
    }

    return Math.max(include, exclude);
  }
}
