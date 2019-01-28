package com.leetcode.algorithm.medium.foursumii;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        int sum = a[i] + b[j];
        map.put(sum, map.getOrDefault(sum, 0) + 1);
      }
    }

    int ans = 0;
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < d.length; j++) {
        int sum = c[i] + d[j];
        ans += map.getOrDefault(-sum, 0);
      }
    }

    return ans;
  }
}
