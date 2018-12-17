package com.leetcode.algorithm.medium.numberofcornerrectangles;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public int countCornerRectangles(int[][] grid) {
    int ans = 0;
    HashMap<String, Integer> map = new HashMap<>();

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        if (grid[row][col] == 1) {
          for (int nextCol = col + 1; nextCol < grid[0].length; nextCol++) {
            if (grid[row][nextCol] == 1) {
              String pos = Arrays.toString(new int[] {col, nextCol});
              int value = map.getOrDefault(pos, 0);
              ans += value;
              map.put(pos, value + 1);
            }
          }
        }
      }
    }

    return ans;
  }
}
