package com.leetcode.algorithm.medium.singlenumberiii;

class Solution {
  public int[] singleNumber(int[] nums) {
    int diff = 0;
    for (int num: nums) {
      diff ^= num;
    }

    diff &= -diff;

    int[] result = new int[] {0, 0};
    for (int num : nums) {
      if ((num & diff) == 0) {
        result[0] ^= num;
      } else {
        result[1] ^= num;
      }
    }

    return result;
  }
}
