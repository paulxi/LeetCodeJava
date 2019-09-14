package com.leetcode.algorithm.medium.binarytreecoloringgame;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int left, right, val;

  public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
    val = x;
    count(root);

    return Math.max(Math.max(left, right), n - left - right - 1) > n / 2;
  }

  private int count(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int l = count(node.left);
    int r = count(node.right);
    if (node.val == val) {
      left = l;
      right = r;
    }

    return l + r + 1;
  }
}
