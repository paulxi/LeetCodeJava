package com.leetcode.algorithm.medium.searchinrotatedsortedarray;

class Solution {
  public int search(int[] nums, int target) {
    return search(nums, 0, nums.length - 1, target);
  }

  private int search(int[] nums, int low, int high, int target) {
    if (low <= high) {
      int mid = low + (high - low) / 2;
      if (target == nums[mid]) {
        return mid;
      }

      boolean isLeftSorted = isSorted(nums, low, mid);
      boolean isRightSorted = isSorted(nums, mid, high);
      if (isLeftSorted && nums[low] <= target && target < nums[mid]) {
        return search(nums, low, mid - 1, target);
      } else if (isRightSorted && nums[mid] < target && target <= nums[high]) {
        return search(nums, mid + 1, high, target);
      } else {
        if (isLeftSorted) {
          return search(nums, mid + 1, high, target);
        } else {
          return search(nums, low, mid - 1, target);
        }
      }
    } else {
      return -1;
    }
  }

  private boolean isSorted(int[] nums, int low, int high) {
    return nums[low] < nums[high] || low == high;
  }
}