package com.leetcode.algorithm.medium.maximumaveragesubtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  private double res = 0;

  public double maximumAverageSubtree(TreeNode root) {
    helper(root);
    return res;
  }

  private double[] helper(TreeNode node) {
    if (node == null) {
      return new double[] {0.0, 0.0};
    }

    double[] left = new double[2];
    double[] right = new double[2];
    if (node.left != null) {
      left = helper(node.left);
    }
    if (node.right != null) {
      right = helper(node.right);
    }

    double sum = node.val + left[0] + right[0];
    double n = left[1] + right[1] + 1;
    res = Math.max(res, sum / n);

    return new double[] {sum, n};
  }
}
