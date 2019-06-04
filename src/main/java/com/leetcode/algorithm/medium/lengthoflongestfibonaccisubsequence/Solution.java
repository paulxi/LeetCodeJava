package com.leetcode.algorithm.medium.lengthoflongestfibonaccisubsequence;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lenLongestFibSubseq(int[] arr) {
    int res = 0;
    int n = arr.length;
    int[][] dp = new int[n][n];
    Map<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j < n; j++) {
      map.put(arr[j], j);
      for (int i = 0; i < j; i++) {
        int k = map.getOrDefault(arr[j] - arr[i], -1);
        dp[i][j] = (k >= 0 && arr[j] - arr[i] < arr[i]) ? dp[k][i] + 1 : 2;
        res = Math.max(res, dp[i][j]);
      }
    }

    return res > 2 ? res : 0;
  }
}
