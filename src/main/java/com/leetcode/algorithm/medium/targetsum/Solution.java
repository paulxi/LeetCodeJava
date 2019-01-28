package com.leetcode.algorithm.medium.targetsum;

import java.util.Arrays;

class Solution {
//  public int findTargetSumWays(int[] nums, int s) {
//    // https://leetcode.com/problems/target-sum/discuss/97334/Java-(15-ms)-C%2B%2B-(3-ms)-O(ns)-iterative-DP-solution-using-subset-sum-with-explanation
//    int sum = 0;
//    for (int num: nums) {
//      sum += num;
//    }
//
//    if (sum < s || (s + sum) % 2 == 1) {
//      return 0;
//    }
//
//    return subsetSum(nums, (s + sum) / 2);
//  }
//
//  private int subsetSum(int[] nums, int s) {
//    int[] dp = new int[s + 1];
//    dp[0] = 1;
//    for (int num: nums) {
//      for (int i = s; i >= num; i--) {
//        dp[i] += dp[i - num];
//      }
//    }
//    return dp[s];
//  }

  public int findTargetSumWays(int[] nums, int s) {
    int[][] memo = new int[nums.length][2001];
    for (int[] row: memo) {
      Arrays.fill(row, Integer.MIN_VALUE);
    }

    return calcuulate(nums, 0, 0, s, memo);
  }

  private int calcuulate(int[] nums, int i, int sum, int s, int[][] memo) {
    if (i == nums.length) {
      if (sum == s) {
        return 1;
      } else {
        return 0;
      }
    } else {
      if (memo[i][sum + 1000] != Integer.MIN_VALUE) {
        return memo[i][sum + 1000];
      } else {
        int add = calcuulate(nums, i + 1, sum + nums[i], s, memo);
        int subtract = calcuulate(nums, i + 1, sum - nums[i], s, memo);
        memo[i][sum + 1000] = add + subtract;
        return memo[i][sum + 1000];
      }
    }
  }
}
