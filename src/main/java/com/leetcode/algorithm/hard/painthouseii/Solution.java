package com.leetcode.algorithm.hard.painthouseii;

class Solution {
  public int minCostII(int[][] costs) {
    if (costs.length == 0) {
      return 0;
    }
    int min1 = 0;
    int min2 = 0;
    int index1 = -1;

    for (int i = 0; i < costs.length; i++) {
      int m1 = Integer.MAX_VALUE;
      int m2 = Integer.MAX_VALUE;
      int idx1 = -1;

      for (int j = 0; j < costs[i].length; j++) {
        int cost = costs[i][j] + (j != index1 ? min1 : min2);
        if (cost < m1) {
          m2 = m1;
          m1 = cost;
          idx1 = j;
        } else if (cost < m2) {
          m2 = cost;
        }
      }

      min1 = m1;
      min2 = m2;
      index1 = idx1;
    }

    return min1;
  }
}
