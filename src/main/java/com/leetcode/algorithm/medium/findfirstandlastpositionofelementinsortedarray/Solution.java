package com.leetcode.algorithm.medium.findfirstandlastpositionofelementinsortedarray;

class Solution {
  public int[] searchRange(int[] nums, int target) {
    int first = findFirst(nums, target);
    if (first == nums.length || nums[first] != target) {
      return new int[] {-1, -1};
    }

    int end = findFirst(nums, target + 1);
    return new int[] {first, end - 1};
  }

  private int findFirst(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;

      if (nums[mid] < target) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }

    return lo;
  }
}
