package com.leetcode.algorithm.medium.missingelementinsortedarray;

class Solution {
  public int missingElement(int[] nums, int k) {
    int lo = 0;
    int hi = nums.length;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] - mid - k >= nums[0]) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return nums[0] + lo  + k - 1;
  }
}
