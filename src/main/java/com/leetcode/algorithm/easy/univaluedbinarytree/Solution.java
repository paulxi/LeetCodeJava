package com.leetcode.algorithm.easy.univaluedbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public boolean isUnivalTree(TreeNode root) {
    if (root == null) {
      return true;
    }

    return allSame(root, root.val);
  }

  private boolean allSame(TreeNode node, int value) {
    if (node == null) {
      return true;
    }

    if (node.val != value) {
      return false;
    }

    if (allSame(node.left, value)) {
      return allSame(node.right, value);
    }

    return false;
  }
}
