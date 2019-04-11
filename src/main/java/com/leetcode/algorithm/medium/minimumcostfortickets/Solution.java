package com.leetcode.algorithm.medium.minimumcostfortickets;

class Solution {
  public int mincostTickets(int[] days, int[] costs) {
    int[] dp = new int[366];
    boolean[] isDays = new boolean[366];

    for (int day: days) {
      isDays[day] = true;
    }

    for (int i = 1; i <= 365; i++) {
      if (!isDays[i]) {
        dp[i] = dp[i - 1];
        continue;
      }

      int min;
      min = dp[i - 1] + costs[0];
      min = Math.min(min, dp[Math.max(0, i - 7)] + costs[1]);
      min = Math.min(min, dp[Math.max(0, i - 30)] + costs[2]);

      dp[i] = min;
    }

    return dp[365];
  }
}
