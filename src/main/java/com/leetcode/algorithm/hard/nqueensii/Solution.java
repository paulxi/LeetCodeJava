package com.leetcode.algorithm.hard.nqueensii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  int count = 0;

  public int totalNQueens(int n) {
    count = 0;
    helper(new ArrayList<>(), n);
    return count;
  }

  private void helper(List<Integer> positions, int n) {
    if (positions.size() == n) {
      count++;
    }

    for (int i = 0; i < n; i++) {
      if (!isValid(positions, i)) {
        continue;
      }
      positions.add(i);
      helper(positions, n);
      positions.remove(positions.size() - 1);
    }
  }

  private boolean isValid(List<Integer> positions, int pos) {
    int row = positions.size();

    for (int rowIndex = 0; rowIndex < positions.size(); rowIndex++) {
      if (positions.get(rowIndex) == pos) {
        return false;
      }

      if (Math.abs(row - rowIndex) == Math.abs(pos - positions.get(rowIndex))) {
        return false;
      }
    }

    return true;
  }
}
