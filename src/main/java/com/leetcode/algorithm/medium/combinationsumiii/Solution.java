package com.leetcode.algorithm.medium.combinationsumiii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    int[] nums = new int[9];
    for (int i = 0; i < 9; i++) {
      nums[i] = i + 1;
    }

    List<List<Integer>> result = new ArrayList<>();
    helper(result, new ArrayList<>(), nums, k, n, 0);
    return result;
  }

  void helper(List<List<Integer>> result, List<Integer> temp, int[] nums, int k, int n, int start) {
    if (n < 0) {
      return;
    }

    if (n == 0) {
      if (k == 0) {
        result.add(new ArrayList<>(temp));
      } else {
        return;
      }
    }

    for (int i = start; i < nums.length; i++) {
      temp.add(nums[i]);
      helper(result, temp, nums, k - 1, n - nums[i], i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
