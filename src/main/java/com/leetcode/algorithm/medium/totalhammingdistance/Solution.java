package com.leetcode.algorithm.medium.totalhammingdistance;

class Solution {
  public int totalHammingDistance(int[] nums) {
    int total = 0;
    int n = nums.length;

    for (int j = 0; j < 32; j++) {
      int bitCount = 0;

      for (int i = 0; i < n; i++) {
        bitCount += (nums[i] >> j) & 1;
      }

      total += bitCount * (n - bitCount);
    }

    return total;
  }
}
