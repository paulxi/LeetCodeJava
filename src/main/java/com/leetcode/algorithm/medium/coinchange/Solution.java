package com.leetcode.algorithm.medium.coinchange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
//  public int coinChange(int[] coins, int amount) {
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for (int coin : coins) {
//      map.put(coin, 1);
//    }
//
//    int value = coinChange(coins, amount, map);
//    if (value == Integer.MAX_VALUE) {
//      value = -1;
//    }
//    return value;
//  }
//
//  private int coinChange(int[] coins, int amount, Map<Integer, Integer> map) {
//    if (amount == 0) {
//      return 0;
//    }
//
//    if (map.containsKey(amount)) {
//      return map.get(amount);
//    }
//
//    int min = Integer.MAX_VALUE;
//
//    for (int i = 0; i < coins.length; i++) {
//      if (amount >= coins[i]) {
//        int value = coinChange(coins, amount - coins[i], map);
//        if (value != Integer.MAX_VALUE) {
//          min = Math.min(min, value + 1);
//        }
//      }
//    }
//
//    map.put(amount, min);
//
//    return min;
//  }

  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 1; i < dp.length; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
          int prev = dp[i - coins[j]] == Integer.MAX_VALUE ? Integer.MAX_VALUE :  dp[i - coins[j]] + 1;
          dp[i] = Math.min(dp[i], prev);
        }
      }
    }

    return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
  }
}
