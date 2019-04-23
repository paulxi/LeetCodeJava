package com.leetcode.algorithm.medium.mostfrequentsubtreesum;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int[] findFrequentTreeSum(TreeNode root) {
    Map<Integer, Integer> map = new HashMap<>();
    helper(root, map);

    List<Integer> list = new ArrayList<>();
    int highest = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > highest) {
        list.clear();
        list.add(entry.getKey());
        highest = entry.getValue();
      } else if (entry.getValue() == highest) {
        list.add(entry.getKey());
      }
    }

    int[] ans = new int[list.size()];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = list.get(i);
    }

    return ans;
  }

  private int helper(TreeNode node, Map<Integer, Integer> map) {
    if (node == null) {
      return 0;
    }

    int res = node.val;
    res += helper(node.left, map);
    res += helper(node.right, map);
    map.put(res, map.getOrDefault(res, 0) + 1);
    return res;
  }
}
