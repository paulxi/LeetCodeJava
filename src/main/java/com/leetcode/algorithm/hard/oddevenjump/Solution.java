package com.leetcode.algorithm.hard.oddevenjump;

import java.util.TreeMap;

class Solution {
  public int oddEvenJumps(int[] arr) {
    int n = arr.length;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    boolean[][] dp = new boolean[n][2];
    dp[n - 1][0] = true;
    dp[n - 1][1] = true;
    map.put(arr[n - 1], n - 1);
    int res = 1;

    for (int i = n - 2; i >= 0; i--) {
      //Odd step
      Integer nextGreater = map.ceilingKey(arr[i]);
      if (nextGreater != null) {
        dp[i][0] = dp[map.get(nextGreater)][1];
      }

      //Even step
      Integer nextSmaller = map.floorKey(arr[i]);
      if (nextSmaller != null) {
        dp[i][1] = dp[map.get(nextSmaller)][0];
      }

      map.put(arr[i], i);

      res += dp[i][0] ? 1 : 0;
    }

    return res;
  }
}
