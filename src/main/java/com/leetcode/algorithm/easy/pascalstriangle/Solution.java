package com.leetcode.algorithm.easy.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      nums.add(1);
      for (int j = i - 1; j > 0; j--) {
        nums.set(j, nums.get(j) + nums.get(j - 1));
      }
      result.add(new ArrayList<>(nums));
    }

    return result;
  }
}
