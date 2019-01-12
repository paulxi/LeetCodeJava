package com.leetcode.algorithm.medium.combinationsumii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    helper(result, new ArrayList<>(), candidates, target, 0);

    return result;
  }

  private void helper(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
    if (target < 0) {
      return;
    }

    if (target == 0) {
      result.add(new ArrayList<>(temp));
    }

    for (int i = start; i < candidates.length; i++) {
      if (i > start && candidates[i] == candidates[i - 1]) {
        continue;
      }

      temp.add(candidates[i]);
      helper(result, temp, candidates, target - candidates[i], i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
