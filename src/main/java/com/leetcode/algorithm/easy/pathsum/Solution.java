package com.leetcode.algorithm.easy.pathsum;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    return helper(root, sum);
  }

  private boolean helper(TreeNode node, int sum) {
    if (node.left == null && node.right == null) {
      return node.val == sum;
    }

    boolean result = false;
    if (node.left != null) {
      result = helper(node.left, sum - node.val);
    }
    if (!result && node.right != null) {
      result = helper(node.right, sum - node.val);
    }

    return result;
  }
}
