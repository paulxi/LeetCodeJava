package com.leetcode.algorithm.easy.invertbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode invertTree(TreeNode root) {
    return invert(root);
  }

  private TreeNode invert(TreeNode node) {
    if (node == null) {
      return null;
    }

    TreeNode result = new TreeNode(node.val);
    result.left = invert(node.right);
    result.right = invert(node.left);

    return result;
  }
}