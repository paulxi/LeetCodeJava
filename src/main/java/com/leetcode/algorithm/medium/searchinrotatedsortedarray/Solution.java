package com.leetcode.algorithm.medium.searchinrotatedsortedarray;

class Solution {
  public int search(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] >= nums[lo]) {
        if (target >= nums[lo] && nums[mid] > target) {
          hi = mid;
        } else {
          lo = mid + 1;
        }
      } else {
        if (target > nums[mid] && target < nums[lo]) {
          lo = mid + 1;
        } else {
          hi = mid;
        }
      }
    }

    return -1;
  }
}