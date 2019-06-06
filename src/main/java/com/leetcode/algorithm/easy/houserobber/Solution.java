package com.leetcode.algorithm.easy.houserobber;

class Solution {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int prevMax = 0;
    int currMax = 0;
    for (int x: nums) {
      int temp = currMax;
      currMax = Math.max(prevMax + x, currMax);
      prevMax = temp;
    }

    return currMax;
  }
}
