package com.leetcode.algorithm.medium.numberofboomerangs;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int numberOfBoomerangs(int[][] points) {
    int ans = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points.length; j++) {
        if (i != j) {
          int d = dist(points[i], points[j]);
          map.put(d, map.getOrDefault(d, 0) + 1);
        }
      }

      for (int val: map.values()) {
        ans += val * (val - 1);
      }
      map.clear();
    }

    return ans;
  }

  private int dist(int[] point1, int[] point2) {
    int x = point1[0] - point2[0];
    int y = point1[1] - point2[1];

    return x * x + y * y;
  }
}
