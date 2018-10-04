package com.leetcode.algorithm.easy.besttimetobuyandsellstock;

class Solution {
  public int maxProfit(int[] prices) {
    int max = 0;
    int temp = 0;

    for (int i = 1; i < prices.length; i++) {
      temp = temp + prices[i] - prices[i - 1];
      if (temp > max) {
        max = temp;
      }
      if (temp < 0) {
        temp = 0;
      }
    }

    return max;
  }
}
