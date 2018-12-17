package com.leetcode.algorithm.medium.queuereconstructionbyheight;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, (int[] a, int[] b) -> {
      if (a[0] == b[0]) {
        return a[1] - b[1];
      }
      return b[0] - a[0];
    });


    ArrayList<int[]> list = new ArrayList<>();
    for (int i = 0; i < people.length; i++) {
      list.add(people[i][1], people[i]);
    }

    int[][] result = new int[people.length][2];
    return list.toArray(result);
  }
}
