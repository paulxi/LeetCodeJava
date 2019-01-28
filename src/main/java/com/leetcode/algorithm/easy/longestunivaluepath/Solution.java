package com.leetcode.algorithm.easy.longestunivaluepath;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;

  public int longestUnivaluePath(TreeNode root) {
    ans = 0;
    helper(root);
    return ans;
  }

  private int helper(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int left = helper(node.left);
    int right = helper(node.right);
    int arrowLeft = 0;
    int arrowRight = 0;
    if (node.left != null && node.left.val == node.val) {
      arrowLeft += left + 1;
    }
    if (node.right != null && node.right.val == node.val) {
      arrowRight += right + 1;
    }
    ans = Math.max(ans, arrowLeft + arrowRight);
    return Math.max(arrowLeft, arrowRight);
  }
}
