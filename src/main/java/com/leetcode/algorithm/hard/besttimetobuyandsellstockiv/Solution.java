package com.leetcode.algorithm.hard.besttimetobuyandsellstockiv;

class Solution {
  public int maxProfit(int k, int[] prices) {
    int n = prices.length;
    if (n <= 1) {
      return 0;
    }

    if (k >= n / 2) {
      int max = 0;
      for (int i = 1; i < n; i++) {
        if (prices[i] > prices[i - 1]) {
          max += prices[i] - prices[i - 1];
        }
      }
      return max;
    }

    int[][] buy = new int[n][k + 1];
    int[][] sell = new int[n][k + 1];

    for (int i = 0; i < k + 1; i++) {
      buy[0][i] = -prices[0];
    }

    for (int i = 1; i < n; i++) {
      buy[i][0] = Math.max(buy[i - 1][0], -prices[i]);
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        buy[i][j] = Math.max(sell[i - 1][j] - prices[i], buy[i - 1][j]);
        sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);
      }
    }

    return Math.max(buy[n - 1][k], sell[n - 1][k]);
  }
}
