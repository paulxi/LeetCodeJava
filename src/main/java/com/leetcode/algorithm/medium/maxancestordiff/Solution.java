package com.leetcode.algorithm.medium.maxancestordiff;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public int maxAncestorDiff(TreeNode root) {
    return helper(root, root.val, root.val);
  }

  private int helper(TreeNode node, int min, int max) {
    if (node == null) {
      return 0;
    }

    max = Math.max(max, node.val);
    min = Math.min(min, node.val);
    return Math.max(max - min, Math.max(helper(node.left, min, max), helper(node.right, min, max)));
  }
}
