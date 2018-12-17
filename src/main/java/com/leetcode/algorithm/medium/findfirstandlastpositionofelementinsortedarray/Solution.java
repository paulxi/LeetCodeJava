package com.leetcode.algorithm.medium.findfirstandlastpositionofelementinsortedarray;

class Solution {
  public int[] searchRange(int[] nums, int target) {
    return searchRange(nums, target, 0, nums.length - 1);
  }

  public int[] searchRange(int[] nums, int target, int low, int high) {
    if (low > high) {
      return new int[] {-1, -1};
    }

    int mid = low + (high - low) / 2;
    if (nums[mid] == target) {
      int[] lowRange;
      if (nums[low] == target) {
        if (low < mid) {
          lowRange = new int[] {low, mid - 1};
        } else {
          lowRange = new int[] {low, low};
        }
      } else {
        lowRange = searchRange(nums, target, low, mid - 1);
      }

      int[] highRange;
      if (nums[high] == target) {
        if (high > mid) {
          highRange = new int[] {mid + 1, high};
        } else {
          highRange = new int[] {high, high};
        }
      } else {
        highRange = searchRange(nums, target, mid + 1, high);
      }

      int[] result = new int[2];
      result[0] = mid;
      result[1] = mid;

      if (lowRange[0] != -1) {
        result[0] = lowRange[0];
      }
      if (highRange[0] != -1) {
        result[1] = highRange[1];
      }
      return result;
    } else if (nums[mid] > target) {
      return searchRange(nums, target, low, mid - 1);
    } else {
      return searchRange(nums, target, mid + 1, high);
    }
  }
}
