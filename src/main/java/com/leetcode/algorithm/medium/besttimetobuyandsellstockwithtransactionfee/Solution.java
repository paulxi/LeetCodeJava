package com.leetcode.algorithm.medium.besttimetobuyandsellstockwithtransactionfee;

class Solution {
  public int maxProfit(int[] prices, int fee) {
    int n = prices.length;
    if (n <= 1) {
      return 0;
    }

    int sell = 0;
    int buy = -prices[0];
    for (int i = 1; i < n; i++) {
      sell = Math.max(buy + prices[i] - fee, sell);
      buy = Math.max(sell - prices[i], buy);
    }

    return sell;
  }
}
