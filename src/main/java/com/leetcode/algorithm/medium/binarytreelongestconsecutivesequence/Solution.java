package com.leetcode.algorithm.medium.binarytreelongestconsecutivesequence;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;

  public int longestConsecutive(TreeNode root) {
    postorder(root);
    return ans;
  }

  private int postorder(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int left = postorder(node.left);
    int right = postorder(node.right);

    int result = 0;
    if (node.left != null && node.left.val - node.val == 1) {
      result = left;
    }

    if (node.right != null && node.right.val - node.val == 1) {
      result = Math.max(result, right);
    }

    ans = Math.max(ans, result + 1);

    return result + 1;
  }
}
