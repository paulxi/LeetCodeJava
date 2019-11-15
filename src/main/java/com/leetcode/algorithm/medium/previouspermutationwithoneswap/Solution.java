package com.leetcode.algorithm.medium.previouspermutationwithoneswap;

class Solution {
  public int[] prevPermOpt1(int[] nums) {
    int n = nums.length;
    int left = n - 2;
    int right = n - 1;
    while (left >= 0 && nums[left] <= nums[left + 1]) {
      left--;
    }
    if (left < 0) {
      return nums;
    }
    while (nums[left] <= nums[right]) {
      right--;
    }
    while (nums[right - 1] == nums[right]) {
      right--;
    }
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
    return nums;
  }
}
