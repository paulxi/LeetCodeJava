package com.leetcode.algorithm.medium.maximumproductsubarray;

class Solution {
  public int maxProduct(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int result = nums[0];
    int max = nums[0];
    int min = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int tempMax = max;
      int tempMin = min;
      max = Math.max(nums[i], Math.max(nums[i] * tempMax, nums[i] * tempMin));
      min = Math.min(nums[i], Math.min(nums[i] * tempMax, nums[i] * tempMin));

      result = Math.max(result, max);
    }

    return result;
  }
}
