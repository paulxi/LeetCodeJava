package com.leetcode.algorithm.hard.jumpgameii;

class Solution {
//  public int jump(int[] nums) {
//    int n = nums.length;
//    int[] dp = new int[n];
//    dp[n - 1] = 0;
//
//    for (int i = n -2; i >= 0; i--) {
//      int step = nums[i];
//      int min = Integer.MAX_VALUE;
//      for (int j = 1; j <= step; j++) {
//        if (i + j > n - 1) {
//          break;
//        }
//
//        if (dp[i + j] != Integer.MAX_VALUE) {
//          min = Math.min(min, dp[i + j] + 1);
//        }
//      }
//      dp[i] = min;
//    }
//
//    return dp[0];
//  }

  public int jump(int[] nums) {
    int curEnd = 0;
    int furtherEnd = 0;
    int ans = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      furtherEnd = Math.max(furtherEnd, i + nums[i]);
      if (i == curEnd) {
        curEnd = furtherEnd;
        ans++;

        if (curEnd >= nums.length - 1) {
          break;
        }
      }
    }

    return ans;
  }
}
