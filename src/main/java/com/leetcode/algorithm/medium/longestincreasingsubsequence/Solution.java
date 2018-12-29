package com.leetcode.algorithm.medium.longestincreasingsubsequence;

class Solution {
//  public int lengthOfLIS(int[] nums) {
//    int n = nums.length;
//    if (n == 0) {
//      return 0;
//    }
//    int[] dp = new int[n];
//    dp[0] = 1;
//    int ans = 1;
//    for (int i = 1; i < n; i++) {
//      int max = 0;
//
//      for (int j = 0; j < i; j++) {
//        if (nums[i] > nums[j]) {
//          max = Math.max(max, dp[j]);
//        }
//      }
//
//      dp[i] = max + 1;
//      ans = Math.max(ans, dp[i]);
//    }
//
//    return ans;
//  }

  public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return 0;
    }

    int[] tails = new int[n];
    int size = 0;
    for (int x: nums) {
      int i = 0;
      int j = size;
      while (i != j) {
        int m = (i + j) / 2;
        if (tails[m] < x) {
          i = m + 1;
        } else {
          j = m;
        }
      }
      tails[i] = x;
      if (i == size) {
        size++;
      }
    }

    return size;
  }
}
