package com.leetcode.algorithm.easy.findpivotindex;

class Solution {
  public int pivotIndex(int[] nums) {
    int sum = 0;
    int leftsum = 0;
    for (int num: nums) {
      sum += num;
    }

    for (int i = 0; i < nums.length; i++) {
      if (leftsum == sum - leftsum - nums[i]) {
        return i;
      }
      leftsum += nums[i];
    }

    return -1;
  }
}
