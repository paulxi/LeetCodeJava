package com.leetcode.algorithm.hard.bestmeetingpoint;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int minTotalDistance(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    List<Integer> rows = new ArrayList<>();
    List<Integer> cols = new ArrayList<>();

    for (int i = 0; i < m;  i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          rows.add(i);
        }
      }
    }

    for (int j = 0; j < n;  j++) {
      for (int i = 0; i < m;  i++) {
        if (grid[i][j] == 1) {
          cols.add(j);
        }
      }
    }

    return getMin(rows) + getMin(cols);
  }

  private int getMin(List<Integer> list) {
    int i = 0;
    int j = list.size() - 1;

    int result = 0;
    while (i < j) {
      result += list.get(j) - list.get(i);
      j--;
      i++;
    }

    return result;
  }
}
