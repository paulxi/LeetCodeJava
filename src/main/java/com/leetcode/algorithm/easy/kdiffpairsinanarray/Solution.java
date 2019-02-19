package com.leetcode.algorithm.easy.kdiffpairsinanarray;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int findPairs(int[] nums, int k) {
    int ans = 0;
    if (nums.length == 0 || k < 0) {
      return ans;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int num: nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
      if (k == 0) {
        if (entry.getValue() >= 2) {
          ans++;
        }
      } else {
        if (map.containsKey(entry.getKey() + k)) {
          ans++;
        }
      }
    }

    return ans;
  }
}
