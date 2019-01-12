package com.leetcode.algorithm.hard.supereggdrop;

class Solution {
//  public int superEggDrop(int k, int n) {
//    int[][] dp = new int[k + 1][n + 1];
//
//    return helper(dp, k, n);
//  }
//
//  private int helper(int[][] dp, int k, int n) {
//    if (k == 1) {
//      return n;
//    }
//    if (n == 0) {
//      return 0;
//    }
//    if (n == 1) {
//      return 1;
//    }
//    if (dp[k][n] != 0) {
//      return dp[k][n];
//    }
//
//    int min = n;
//    int lo = 1;
//    int hi = n;
//    while (lo <= hi) {
//      int mid = lo + (hi - lo) / 2;
//      int left = helper(dp, k - 1, mid - 1);
//      int right = helper(dp, k, n - mid);
//      min = Math.min(min, Math.max(left, right) + 1);
//
//      if (left == right) {
//        break;
//      } else if (left < right) {
//        lo = mid + 1;
//      } else {
//        hi = mid - 1;
//      }
//    }
//
//    dp[k][n] = min;
//    return dp[k][n];
//  }

  public int superEggDrop(int k, int n) {
    int[] dp = new int[k + 1];
    int step = 0;
    while (dp[k] < n) {
      step++;

      for (int i = k; i > 0; --i) {
        dp[i] += 1 + dp[i - 1];
      }
    }

    return step;
  }
}
