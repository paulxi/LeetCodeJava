package com.leetcode.algorithm.medium.sortcolors;

class Solution {
  public void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    for (int i = 0; i <= end; i++) {
      if (nums[i] == 0) {
        swap(nums, i, start);
        start++;
      } else if (nums[i] == 2) {
        swap(nums, i, end);
        i--;
        end--;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
