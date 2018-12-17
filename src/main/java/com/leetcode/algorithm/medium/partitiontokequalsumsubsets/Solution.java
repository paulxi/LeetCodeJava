package com.leetcode.algorithm.medium.partitiontokequalsumsubsets;

import java.util.Arrays;

class Solution {
  public boolean canPartitionKSubsets(int[] nums, int k) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % k != 0) {
      return false;
    }
    sum /= k;

    Arrays.sort(nums);

    return possible(nums, sum, new int[k], nums.length - 1);
  }

  private boolean possible(int[] nums, int sum, int[] p, int idx) {
    if (idx == -1) {
      for (int i = 0; i < p.length; i++) {
        if (p[i] != sum) {
          return false;
        }
      }
      return true;
    }

    for (int i = 0; i < p.length; i++) {
      if (p[i] + nums[idx] <= sum) {
        p[i] += nums[idx];
        if (possible(nums, sum, p, idx - 1)) {
          return true;
        }
        p[i] -= nums[idx];
      }
    }

    return false;
  }
}
