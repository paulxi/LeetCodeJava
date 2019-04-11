package com.leetcode.algorithm.medium.countcompletetreenodes;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public int countNodes(TreeNode root) {
    int h = height(root);
    if (h == -1) {
      return 0;
    }

    int hRight = height(root.right);
    if (h - 1 == hRight) {
      return (1 << h) + countNodes(root.right);
    } else {
      return (1  << (h - 1)) + countNodes(root.left);
    }
  }

  private int height(TreeNode root) {
    if (root == null) {
      return -1;
    } else {
      return 1 + height(root.left);
    }
  }
}
