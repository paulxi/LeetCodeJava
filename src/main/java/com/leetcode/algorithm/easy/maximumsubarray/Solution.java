package com.leetcode.algorithm.easy.maximumsubarray;

class Solution {
  public int maxSubArray(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int max = Integer.MIN_VALUE;
    int temp = Integer.MIN_VALUE;
    for (int num : nums) {
      if (temp < 0) {
        temp = num;
      } else {
        temp += num;
      }

      max = Math.max(max, temp);
    }

    return max;
  }
}
