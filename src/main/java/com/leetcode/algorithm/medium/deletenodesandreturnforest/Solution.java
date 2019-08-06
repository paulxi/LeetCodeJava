package com.leetcode.algorithm.medium.deletenodesandreturnforest;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    List<TreeNode> res = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int val: to_delete) {
      set.add(val);
    }

    helper(root, true, set, res);

    return res;
  }

  private TreeNode helper(TreeNode node, boolean isRoot, Set<Integer> set, List<TreeNode> res) {
    if (node == null) {
      return null;
    }
    boolean isDeleted = set.contains(node.val);
    if (isRoot && !isDeleted) {
      res.add(node);
    }

    node.left = helper(node.left, isDeleted, set, res);
    node.right = helper(node.right, isDeleted, set, res);
    return isDeleted ? null : node;
  }
}
