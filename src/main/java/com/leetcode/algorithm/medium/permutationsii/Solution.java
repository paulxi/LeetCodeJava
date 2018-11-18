package com.leetcode.algorithm.medium.permutationsii;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> result = Arrays.asList(Arrays.asList());

    for (int n = 0; n < nums.length;n++) {
      int num = nums[n];
      List<List<Integer>> newResult = new LinkedList<>();
      for (int i = 0; i < result.size(); i++) {
        List<Integer> list = result.get(i);
        for (int j = 0; j <= list.size(); j++) {
          if (j > 0 && list.get(j - 1) == num) break;
          LinkedList<Integer> newList = new LinkedList<>(list);
          newList.add(j, num);
          newResult.add(newList);
        }
      }
      result = newResult;

    }
    return result;
  }
}
