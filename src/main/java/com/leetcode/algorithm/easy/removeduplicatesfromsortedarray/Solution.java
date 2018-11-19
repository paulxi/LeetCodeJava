package com.leetcode.algorithm.easy.removeduplicatesfromsortedarray;

class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int pos = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[pos] != nums[i]) {
        pos += 1;
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] = temp;
      }
    }

    return pos + 1;
  }
}
