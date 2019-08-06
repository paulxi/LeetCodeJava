package com.leetcode.algorithm.hard.splitarraywithsamevverage;

import java.util.Arrays;

class Solution {
  public boolean splitArraySameAverage(int[] nums) {
    if (nums.length == 1) {
      return false;
    }

    int sumA = 0;
    for (int n: nums) {
      sumA += n;
    }
    Arrays.sort(nums);
    for (int lenOfB = 1; lenOfB <= nums.length / 2; lenOfB++) {
      if ((sumA * lenOfB) % nums.length == 0) {
        if (check(nums, (sumA * lenOfB) / nums.length, lenOfB, 0)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean check(int[] nums, int sum, int len, int index) {
    if (len == 0) {
      return sum == 0;
    }

    if (nums[index] > sum / len) {
      return false;
    }

    for (int i = index; i < nums.length - len + 1; i++) {
      if (i > index && nums[i] == nums[i - 1]) {
        continue;
      }

      if (check(nums, sum - nums[i], len - 1, i + 1)) {
        return true;
      }
    }

    return false;
  }
}
