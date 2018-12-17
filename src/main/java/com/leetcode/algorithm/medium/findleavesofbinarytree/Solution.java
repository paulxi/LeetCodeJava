package com.leetcode.algorithm.medium.findleavesofbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> findLeaves(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    height(root, result);
    return result;
  }

  private int height(TreeNode node, List<List<Integer>> result) {
    if (node == null) {
      return -1;
    }

    int level = 1 + Math.max(height(node.left, result), height(node.right, result));
    if (result.size() < level + 1) {
      result.add(new ArrayList<>());
    }

    result.get(level).add(node.val);
    return level;
  }
}
