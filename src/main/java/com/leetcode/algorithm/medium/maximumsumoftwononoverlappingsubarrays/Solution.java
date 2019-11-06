package com.leetcode.algorithm.medium.maximumsumoftwononoverlappingsubarrays;

class Solution {
  public int maxSumTwoNoOverlap(int[] nums, int l, int m) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }

    int res = nums[l + m - 1];
    int lMax = nums[l - 1];
    int mMax = nums[m - 1];
    for (int i = l + m; i < nums.length; i++) {
      lMax = Math.max(lMax, nums[i - m] - nums[i - l - m]);
      mMax = Math.max(mMax, nums[i - l] - nums[i - l - m]);
      res = Math.max(res, Math.max(lMax + nums[i] - nums[i - m], mMax + nums[i] - nums[i - l]));
    }
    return res;
  }
}
