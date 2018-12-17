package com.leetcode.algorithm.medium.linereflection;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
  public boolean isReflected(int[][] points) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    HashSet<String> set = new HashSet<>();
    for (int[] point: points) {
      max = Math.max(max, point[0]);
      min = Math.min(min, point[0]);
      set.add(Arrays.toString(point));
    }

    int sum = min + max;
    for (int[] point: points) {
      int mirror = sum - point[0];
      String str = Arrays.toString(new int[] {mirror, point[1]});
      if (!set.contains(str)) {
        return false;
      }
    }
    return true;
  }
}
