package com.leetcode.algorithm.easy.besttimetobuyandsellstockii;

class Solution {
//  public int maxProfit(int[] prices) {
//    int n = prices.length;
//    int result = 0;
//
//    if (n == 0) {
//      return result;
//    }
//
//    int start = 0;
//    for (int i = 0; i < n; i++) {
//      if (i > 0 && prices[i] < prices[i - 1]) {
//        result += prices[i - 1] - prices[start];
//        start = i;
//      }
//    }
//
//    if (start != n - 1) {
//      result += prices[n - 1] - prices[start];
//    }
//
//    return result;
//  }

  public int maxProfit(int[] prices) {
    int n = prices.length;
    int result = 0;

    if (n == 0) {
      return result;
    }

    for (int i = 1; i < n; i++) {
      if (prices[i] > prices[i - 1]) {
        result += prices[i] - prices[i - 1];
      }
    }

    return result;
  }
}
