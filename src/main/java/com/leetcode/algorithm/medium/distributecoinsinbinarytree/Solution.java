package com.leetcode.algorithm.medium.distributecoinsinbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;
  public int distributeCoins(TreeNode root) {
    ans = 0;
    dfs(root);
    return ans;
  }

  private int dfs(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int left = dfs(node.left);
    int right = dfs(node.right);
    ans += Math.abs(left) + Math.abs(right);
    return node.val + left + right - 1;
  }
}
