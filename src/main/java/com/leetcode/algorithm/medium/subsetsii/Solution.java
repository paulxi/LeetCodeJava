package com.leetcode.algorithm.medium.subsetsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());

    int size = 0;
    for (int i = 0; i < nums.length; i++) {
      int startIndex = 0;
      if (i != 0 && nums[i - 1] == nums[i]) {
        startIndex = size;
      }

      size = result.size();
      for (int j = startIndex; j < size; j++) {
        List<Integer> subset = new ArrayList<>(result.get(j));
        subset.add(nums[i]);
        result.add(subset);
      }
    }

    return result;
  }
}
