package com.leetcode.algorithm.medium.imageoverlap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int largestOverlap(int[][] a, int[][] b) {
    List<int[]> list1 = new ArrayList<>();
    List<int[]> list2 = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[i][j] == 1) {
          list1.add(new int[] {i, j});
        }
        if (b[i][j] == 1) {
          list2.add(new int[] {i, j});
        }
      }
    }

    Map<String, Integer> map = new HashMap<>();
    int ans = 0;
    for (int[] p0: list1) {
      for (int[] p1: list2) {
        String diff = "" + (p0[0] - p1[0]) + " " + (p0[1] - p1[1]);
        map.put(diff, map.getOrDefault(diff, 0) + 1);
      }
    }

    for (int value: map.values()) {
      ans = Math.max(ans, value);
    }

    return ans;
  }
}
