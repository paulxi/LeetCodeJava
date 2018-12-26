package com.leetcode.algorithm.hard.firstmissingpositive;

class Solution {
  public int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] <= 0 || nums[i] == i + 1 || nums[i] >= nums.length || nums[nums[i] - 1] == nums[i]) {
        i++;
      } else {
        int temp = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = temp;
      }
    }

    int ans = 0;
    while (ans < nums.length && nums[ans] == ans + 1) {
      ans++;
    }

    return ans + 1;
  }
}
