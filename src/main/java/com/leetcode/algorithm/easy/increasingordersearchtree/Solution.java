package com.leetcode.algorithm.easy.increasingordersearchtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode increasingBST(TreeNode root) {
    return increasingBST(root, null);
  }

  private TreeNode increasingBST(TreeNode node, TreeNode tail) {
    if (node == null) {
      return tail;
    }

    TreeNode left = increasingBST(node.left, node);
    node.left = null;
    node.right = increasingBST(node.right, tail);

    return left;
  }
}
