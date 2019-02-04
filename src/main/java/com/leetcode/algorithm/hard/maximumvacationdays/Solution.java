package com.leetcode.algorithm.hard.maximumvacationdays;

class Solution {
  public int maxVacationDays(int[][] flights, int[][] days) {
    if (days.length == 0 || flights.length == 0) {
      return 0;
    }

    int[][] dp = new int[days.length][days[0].length + 1];
    for (int week = days[0].length - 1; week >= 0; week--) {
      for (int cur_city = 0; cur_city < days.length; cur_city++) {
        dp[cur_city][week] = days[cur_city][week] + dp[cur_city][week + 1];
        for (int dest_city = 0; dest_city < days.length; dest_city++) {
          if (flights[cur_city][dest_city] == 1) {
            dp[cur_city][week] = Math.max(dp[cur_city][week], days[dest_city][week] + dp[dest_city][week + 1]);
          }
        }
      }
    }

    return dp[0][0];
  }
}
