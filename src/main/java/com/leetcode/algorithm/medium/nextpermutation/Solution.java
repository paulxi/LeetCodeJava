package com.leetcode.algorithm.medium.nextpermutation;

class Solution {
  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i + 1] <= nums[i]) {
      i -= 1;
    }

    if (i >= 0) {
      int j = nums.length - 1;
      while (j >= 0 && nums[j] <= nums[i]) {
        j -= 1;
      }
      swap(nums, i, j);
    }
    reverse(nums, i + 1);
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private void reverse(int[] nums, int start) {
    int i = start;
    int j = nums.length - 1;
    while (i < j) {
      swap(nums, i, j);
      i += 1;
      j -= 1;
    }
  }
}
