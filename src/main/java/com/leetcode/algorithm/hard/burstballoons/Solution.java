package com.leetcode.algorithm.hard.burstballoons;

class Solution {
//  public int maxCoins(int[] nums) {
//    int[] copy = new int[nums.length + 2];
//    copy[0] = 1;
//    copy[copy.length - 1] = 1;
//
//    System.arraycopy(nums, 0, copy, 1, nums.length);
//
//    int[][] memo = new int[copy.length][copy.length];
//
//    return burst(memo, copy, 0, copy.length - 1);
//  }
//
//  private int burst(int[][] memo, int[] nums, int left, int right) {
//    if (left + 1 == right) {
//      return 0;
//    }
//    if (memo[left][right] > 0) {
//      return memo[left][right];
//    }
//    int ans = 0;
//    for (int i = left + 1; i < right; i++) {
//      ans = Math.max(ans, nums[left] * nums[i] * nums[right]
//          + burst(memo, nums, left, i)
//          + burst(memo, nums, i, right));
//    }
//    memo[left][right] = ans;
//    return ans;
//  }

  public int maxCoins(int[] nums) {
    int[] copy = new int[nums.length + 2];
    int len = copy.length;
    copy[0] = 1;
    copy[len - 1] = 1;

    System.arraycopy(nums, 0, copy, 1, nums.length);

    int[][] dp = new int[len][len];
    for (int k = 2; k < len; k++) {
      for (int left = 0; left < len - k; left++) {
        int right = left + k;
        for (int i = left + 1; i < right; i++) {
          dp[left][right] = Math.max(dp[left][right], copy[left] * copy[i] * copy[right]
          + dp[left][i] + dp[i][right]);
        }
      }
    }

    return dp[0][len - 1];
  }
}
