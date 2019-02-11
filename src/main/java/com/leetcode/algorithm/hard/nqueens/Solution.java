package com.leetcode.algorithm.hard.nqueens;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> ans = new ArrayList<>();

    helper(ans, new ArrayList<>(), n);

    return ans;
  }

  private void helper(List<List<String>> ans, List<Integer> positions, int n) {
    if (positions.size() == n) {
      List<String> list = new ArrayList<>();
      for (int pos: positions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
          if (i == pos) {
            sb.append("Q");
          } else {
            sb.append(".");
          }
        }
        list.add(sb.toString());
      }

      ans.add(list);
    }

    for (int i = 0; i < n; i++) {
      if (!isValid(positions, i)) {
        continue;
      }
      positions.add(i);
      helper(ans, positions, n);
      positions.remove(positions.size() - 1);
    }
  }

  private boolean isValid(List<Integer> positions, int pos) {
    int rows = positions.size();
    for (int rowIndex = 0; rowIndex < positions.size(); rowIndex++) {
      if (positions.get(rowIndex) == pos) {
        return false;
      }

      if (Math.abs(rowIndex - rows) == Math.abs(positions.get(rowIndex) - pos)) {
        return false;
      }
    }

    return true;
  }
}
