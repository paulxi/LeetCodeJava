package com.leetcode.algorithm.medium.sumroottoleafnumbers;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;

  public int sumNumbers(TreeNode root) {
    ans = 0;
    dfs(root, 0);
    return ans;
  }

  private void dfs(TreeNode node, int value) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      ans += value * 10 + node.val;
      return;
    }

    if (node.left != null) {
      dfs(node.left, value * 10 + node.val);
    }

    if (node.right != null) {
      dfs(node.right, value * 10 + node.val);
    }
  }
}
