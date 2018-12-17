package com.leetcode.algorithm.easy.painthouse;

import java.util.Arrays;

class Solution {
  public int minCost(int[][] costs) {
    if (costs.length == 0) {
      return 0;
    }

    int[] min = costs[0];
    for (int i = 1; i < costs.length; i++) {
      int[] temp = new int[3];
      Arrays.fill(temp, Integer.MAX_VALUE);
      for (int j = 0; j < costs[i].length; j++) {
        for (int k = 0; k < min.length; k++) {
          if (j != k) {
            int value = costs[i][j] + min[k];
            temp[j] = Math.min(value, temp[j]);
          }
        }
      }
      min = temp;
    }

    int result = min[0];
    if (min[1] < result) {
      result = min[1];
    }
    if (min[2] < result) {
      result = min[2];
    }
    return result;
  }
}
