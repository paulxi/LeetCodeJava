package com.leetcode.algorithm.easy.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= rowIndex; i++) {
      result.add(1);
      for (int j = i - 1; j > 0; j--) {
        result.set(j, result.get(j) + result.get(j - 1));
      }
    }

    return result;
  }
}
