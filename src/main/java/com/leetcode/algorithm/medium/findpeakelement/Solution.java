package com.leetcode.algorithm.medium.findpeakelement;

class Solution {
//  public int findPeakElement(int[] nums) {
//    for (int i = 0; i < nums.length; i++) {
//      int prev = i == 0 ? Integer.MIN_VALUE : nums[i - 1];
//      int next = i == nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];
//
//      if (nums[i] >= prev && nums[i] >= next) {
//        return i;
//      }
//    }
//
//    return -1;
//  }

//  public int findPeakElement(int[] nums) {
//    for (int i = 0; i < nums.length - 1; i++) {
//      if (nums[i] > nums[i + 1])
//        return i;
//    }
//    return nums.length - 1;
//  }

  public int findPeakElement(int[] nums) {
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int mid = (l + r) / 2;
      if (nums[mid] > nums[mid + 1]) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }

    return l;
  }
}
