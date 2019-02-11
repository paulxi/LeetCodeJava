package com.leetcode.algorithm.hard.findminimuminrotatedsortedarrayii;

class Solution {
  public int findMin(int[] nums) {
    int lo = 0;
    int hi = nums.length - 1;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;

      if (nums[mid] < nums[hi]) {
        hi = mid;
      } else if (nums[mid] > nums[hi]) {
        lo = mid + 1;
      } else {
        hi--;
      }
    }

    return nums[lo];
  }
}
