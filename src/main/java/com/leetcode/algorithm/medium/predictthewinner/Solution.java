package com.leetcode.algorithm.medium.predictthewinner;

class Solution {
//  Solution 1
//  public boolean PredictTheWinner(int[] nums) {
//    return win(nums, 0, nums.length - 1, 1) >= 0;
//  }
//
//  private int win(int[] nums, int start, int end, int turn) {
//    if (start == end) {
//      return turn * nums[start];
//    }
//
//    int a = turn * nums[start] + win(nums, start + 1, end, -turn);
//    int b = turn * nums[end] + win(nums, start, end - 1, -turn);
//
//    return turn * Math.max(turn * a, turn * b);
//  }

  /* Solution 2
  public boolean PredictTheWinner(int[] nums) {
    return win(nums, 0, nums.length - 1, new Integer[nums.length][nums.length]) >= 0;
  }

  private int win(int[] nums, int start, int end, Integer[][] memo) {
    if (start == end) {
      return nums[start];
    }

    if (memo[start][end] != null) {
      return memo[start][end];
    }

    int a = nums[start] - win(nums, start + 1, end, memo);
    int b = nums[end] - win(nums, start, end - 1, memo);
    memo[start][end] = Math.max(a, b);

    return memo[start][end];
  }*/

  /* Solution 3
  public boolean PredictTheWinner(int[] nums) {
    int[][] dp = new int[nums.length][nums.length];

    for (int start = nums.length - 1; start >= 0; start--) {
      dp[start][start] = nums[start];
      for (int end = start + 1; end < nums.length; end++) {
        dp[start][end] = Math.max(nums[start] - dp[start + 1][end], nums[end] - dp[start][end - 1]);
      }
    }

    return dp[0][nums.length - 1] >= 0;
  }
  */

  public boolean PredictTheWinner(int[] nums) {
    if (nums.length % 2 == 0) {
      return true;
    }

    int[] dp = new int[nums.length];

    for (int start = nums.length - 1; start >= 0; start--) {
      dp[start] = nums[start];
      for (int end = start + 1; end < nums.length; end++) {
        int a = nums[start] - dp[end];
        int b = nums[end] - dp[end - 1];
        dp[end] = Math.max(a, b);
      }
    }

    return dp[nums.length - 1] >= 0;
  }
}
