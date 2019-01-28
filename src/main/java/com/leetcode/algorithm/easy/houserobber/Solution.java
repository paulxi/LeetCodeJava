package com.leetcode.algorithm.easy.houserobber;

class Solution {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    // dp[i][0] means the total rob amount from house 0 to house i, and house i is not robbed
    // dp[i][1] means the total rob amount from house 0 to house i, and house i is robbed
    int[][] dp = new int[nums.length][2];
    dp[0][0] = 0; // not rob house 0
    dp[0][1] = nums[0]; // rob house 0

    for (int i = 1; i < nums.length; i++) {
      // not rob house i, so the max total amount should be dp[i-1][0] or dp[i-1][1]
      dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
      // rob house i, so the max total amount should be dp[i-1][0] + the value of house i
      dp[i][1] = dp[i - 1][0] + nums[i];
    }

    // check the max amount among dp[last house index][0] and dp[last house index][1]
    return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
  }
}
