package com.leetcode.algorithm.medium.longestarithmeticsequence;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int longestArithSeqLength(int[] arr) {
    Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();
    int res = 2;
    for (int i = 0; i <arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int diff = arr[j] - arr[i];
        if (!dp.containsKey(diff)) {
          dp.put(diff, new HashMap<>());
        }

        Map<Integer, Integer> map = dp.get(diff);
        map.put(j, map.getOrDefault(i, 1) + 1);
        res = Math.max(res, map.get(j));
      }
    }

    return res;
  }
}
