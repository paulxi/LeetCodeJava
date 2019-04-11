package com.leetcode.algorithm.easy.sumofroottoleafbinarynumbers;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int sum;
  public int sumRootToLeaf(TreeNode root) {
    preorder(root, 0);
    return sum;
  }

  private void preorder(TreeNode node, int curr) {
    if (node == null) {
      return;
    }

    curr = node.val + curr * 2;
    if (node.left == null && node.right == null) {
      sum += curr;
      return;
    }

    preorder(node.left, curr);
    preorder(node.right, curr);
  }
}
