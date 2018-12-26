package com.leetcode.algorithm.medium.threesumsmaller;

import java.util.Arrays;

class Solution {
  public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);

    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = target - nums[i];

      int lo = i + 1;
      int hi = nums.length - 1;
      while (lo < hi) {
        if (sum <= nums[lo] + nums[hi]) {
          hi--;
        } else {
          result += hi - lo;
          lo++;
        }
      }
    }

    return result;
  }
}
