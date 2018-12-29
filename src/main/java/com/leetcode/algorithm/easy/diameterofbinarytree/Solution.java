package com.leetcode.algorithm.easy.diameterofbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;
  public int diameterOfBinaryTree(TreeNode root) {
    ans = 0;
    depth(root);
    return ans;
  }

  private int depth(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int left = depth(node.left);
    int right = depth(node.right);
    ans = Math.max(ans, left + right);

    return Math.max(left, right) + 1;
  }
}
