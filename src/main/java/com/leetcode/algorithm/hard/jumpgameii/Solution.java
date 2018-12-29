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
    int n = nums.length;
    if (n < 2) {
      return 0;
    }

    int level = 0;
    int i = 0;
    int currentMax = 0;
    int nextMax = 0;

    while (currentMax - i + 1 > 0) {
      level++;

      for (; i <= currentMax; i++) {
        nextMax = Math.max(nextMax, nums[i] + i);
        if (nextMax >= n - 1) {
          return level;
        }
      }
      currentMax = nextMax;
    }

    return 0;
  }
}
