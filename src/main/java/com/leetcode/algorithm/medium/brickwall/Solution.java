package com.leetcode.algorithm.medium.brickwall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int leastBricks(List<List<Integer>> wall) {
    Map<Integer, Integer> map = new HashMap<>();
    for (List<Integer> row: wall) {
      int sum = 0;
      for (int i = 0; i < row.size() - 1; i++) {
        sum += row.get(i);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
      }
    }

    int ans = wall.size();
    for (int sum: map.keySet()) {
      ans = Math.min(ans, wall.size() - map.get(sum));
    }

    return ans;
  }
}
