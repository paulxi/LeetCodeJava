package com.leetcode.algorithm.medium.threesumclosest;

import java.util.Arrays;

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);

    int result = Integer.MAX_VALUE;
    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int sum = target - nums[i];
        int lo = i + 1;
        int hi = nums.length - 1;
        while (lo < hi) {
          int diff = sum - nums[lo] - nums[hi];

          if (Math.abs(diff) < minDiff) {
            minDiff = Math.abs(diff);
            result = nums[i] + nums[lo] + nums[hi];
          }

          if (diff == 0) {
            return target;
          } else if (diff > 0) {
            lo++;
          } else {
            hi--;
          }
        }
      }
    }

    return result;
  }
}
