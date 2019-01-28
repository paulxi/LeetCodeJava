package com.leetcode.algorithm.medium.houserobberiii;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
//  public int rob(TreeNode root) {
//    if (root == null) {
//      return 0;
//    }
//
//    return rob(root, true);
//  }
//
//  private int rob(TreeNode node, boolean flag) {
//    if (node == null) {
//      return 0;
//    }
//
//    if (flag) {
//      int value1 = node.val + rob(node.left, false) + rob(node.right, false);
//      int value2 = rob(node.left, true) + rob(node.right, true);
//      return Math.max(value1, value2);
//    } else {
//      return rob(node.left, true) + rob(node.right, true);
//    }
//  }

  public int rob(TreeNode root) {
    int[] res = robSub(root);

    return Math.max(res[0], res[1]);
  }

  private int[] robSub(TreeNode node) {
    if (node == null) {
      return new int[2];
    }

    int[] left = robSub(node.left);
    int[] right = robSub(node.right);

    int[] res = new int[2];
    res[0] = node.val + left[1] + right[1];
    res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    return res;
  }
}
