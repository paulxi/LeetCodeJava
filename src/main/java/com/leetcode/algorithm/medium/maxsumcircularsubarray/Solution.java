package com.leetcode.algorithm.medium.maxsumcircularsubarray;

class Solution {
  public int maxSubarraySumCircular(int[] nums) {
    int sum = 0;
    for (int num: nums) {
      sum += num;
    }

    int max = Integer.MIN_VALUE;
    int tot = 0;
    for (int num: nums) {
      tot += num;
      max = Math.max(max, tot);
      if (tot < 0) {
        tot = 0;
      }
    }

    int min = Integer.MAX_VALUE;
    tot = 0;
    for (int num: nums) {
      tot += num;
      min = Math.min(min, tot);
      if (tot > 0) {
        tot = 0;
      }
    }

    if (max < 0) {
      return max;
    }

    return Math.max(max, sum - min);
  }
}
