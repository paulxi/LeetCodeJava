package com.leetcode.algorithm.medium.combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ans = new ArrayList<>();
    helper(ans, new ArrayList<>(), n, k, 0);
    return ans;
  }

  private void helper(List<List<Integer>> ans, List<Integer> list, int n, int k, int start) {
    if (list.size() == k) {
      ans.add(new ArrayList<>(list));
    }

    for (int i = start; i < n; i++) {
      list.add(i + 1);
      helper(ans, list, n, k, i + 1);
      list.remove(list.size() - 1);
    }
  }
}
