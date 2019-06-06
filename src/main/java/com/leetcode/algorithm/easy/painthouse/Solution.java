package com.leetcode.algorithm.easy.painthouse;

class Solution {
  public int minCost(int[][] costs) {
    if (costs.length == 0) {
      return 0;
    }

    int red = 0;
    int blue = 0;
    int green = 0;
    for (int i = 0; i < costs.length; i++) {
      int tempR = red;
      int tempB = blue;
      int tempG = green;

      red = Math.min(tempB, tempG) + costs[i][0];
      blue = Math.min(tempR, tempG) + costs[i][1];
      green = Math.min(tempR, tempB) + costs[i][2];
    }

    return Math.min(red, Math.min(blue, green));
  }
}
