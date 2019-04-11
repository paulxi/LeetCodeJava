package com.leetcode.algorithm.easy.searchinsertposition;

class Solution {
  public int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return 0;
    }

    int lo = 0;
    int hi = nums.length;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return lo;
  }
}
