package com.leetcode.algorithm.easy.shortestunsortedcontinuoussubarray;

class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low < high) {
      boolean isLowMin = true;
      for (int i = low + 1; i <= high; i++) {
        if (nums[i] < nums[low]) {
          isLowMin = false;
          break;
        }
      }
      if (isLowMin) {
        low++;
      }

      boolean isHighMax = true;
      for (int i = high - 1; i >= low; i--) {
        if (nums[i] > nums[high]) {
          isHighMax = false;
          break;
        }
      }
      if (isHighMax) {
        high--;
      }

      if (!isLowMin && !isHighMax) {
        break;
      }
    }

    return high == low ? 0 : high - low + 1;
  }
}
