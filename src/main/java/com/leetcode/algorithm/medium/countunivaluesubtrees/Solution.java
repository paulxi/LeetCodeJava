package com.leetcode.algorithm.medium.countunivaluesubtrees;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int count;
  public int countUnivalSubtrees(TreeNode root) {
    count = 0;
    helper(root);
    return count;
  }

  private boolean helper(TreeNode node) {
    if (node == null) {
      return true;
    }

    boolean left = helper(node.left);
    boolean right = helper(node.right);

    if (left == right) {
      if (node.left != null && node.left.val != node.val) {
        return false;
      }
      if (node.right != null && node.right.val != node.val) {
        return false;
      }
      count++;
      return true;
    }

    return false;
  }
}
