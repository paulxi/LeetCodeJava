package com.leetcode.algorithm.easy.balancedbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
//  public boolean isBalanced(TreeNode root) {
//    if (root == null) {
//      return true;
//    }
//
//    int left = depth(root.left);
//    int right = depth(root.right);
//    if (Math.abs(left - right) > 1) {
//      return false;
//    }
//
//    return isBalanced(root.left) && isBalanced(root.right);
//  }
//
//  private int depth(TreeNode node) {
//    if (node == null) {
//      return 0;
//    }
//
//    return 1 + Math.max(depth(node.left), depth(node.right));
//  }

  public boolean isBalanced(TreeNode root) {
    return height(root) != -1;
  }

  private int height(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int left = height(node.left);
    if (left == -1) {
      return -1;
    }

    int right = height(node.right);
    if (right == -1) {
      return -1;
    }

    if (Math.abs(left - right) > 1) {
      return -1;
    }

    return 1 + Math.max(left, right);
  }
}
