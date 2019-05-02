package com.leetcode.algorithm.easy.heaters;

import java.util.Arrays;

class Solution {
  public int findRadius(int[] houses, int[] heaters) {
    Arrays.sort(houses);
    Arrays.sort(heaters);

    int i = 0, res = 0;
    for (int house : houses) {
      while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2) {
        i++;
      }
      res = Math.max(res, Math.abs(heaters[i] - house));
    }

    return res;
  }
}
