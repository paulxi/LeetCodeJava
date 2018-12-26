package com.leetcode.algorithm.hard.binarytreemaximumpathsum;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public int maxPathSum(TreeNode root) {
    int[] max = new int[] {Integer.MIN_VALUE};
    helper(root, max);
    return max[0];
  }

  private int helper(TreeNode node, int[] max) {
    if (node == null) {
      return 0;
    }
    int left = Math.max(helper(node.left, max), 0);
    int right = Math.max(helper(node.right, max), 0);
    max[0] = Math.max(max[0], node.val + left + right);
    return Math.max(left, right) + node.val;
  }
}
