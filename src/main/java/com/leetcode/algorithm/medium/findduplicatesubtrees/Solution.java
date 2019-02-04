package com.leetcode.algorithm.medium.findduplicatesubtrees;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> result = new ArrayList<>();
    helper(root, new HashMap<>(), result);

    return result;
  }

  private String helper(TreeNode node, Map<String, Integer> map, List<TreeNode> list) {
    if (node == null) {
      return "#";
    }

    String key = node.val + helper(node.left, map, list) + helper(node.right, map, list);
    if (map.getOrDefault(key, 0) == 1) {
      list.add(node);
    }
    map.put(key, map.getOrDefault(key, 0) + 1);
    return key;
  }
}
