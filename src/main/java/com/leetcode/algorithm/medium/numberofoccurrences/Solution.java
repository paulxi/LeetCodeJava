package com.leetcode.algorithm.medium.numberofoccurrences;

import java.util.Arrays;

class Solution {
  public int getIntCount(int[] nums, int target) {
    return getCount(nums, 0, nums.length, target);
  }

  private int getCount(int[] nums, int start, int end, int target) {
    if (start >= end) {
      return 0;
    }

    if (nums[start] > target || nums[end - 1] < target) {
      return 0;
    }

    int index = Arrays.binarySearch(nums, start, end, target);
    if (index < 0) {
      return 0;
    }

    int leftCount = 0;
    if (nums[start] == target) {
      leftCount = index - start;
    } else {
      leftCount = getCount(nums, start, index, target);
    }

    int rightCount = 0;
    if (nums[end - 1] == target) {
      rightCount = end - index - 1;
    } else {
      rightCount = getCount(nums, index + 1, end, target);
    }


    return 1 + leftCount + rightCount;
  }
}
