package com.leetcode.algorithm.easy.minimumdistancebetweenbstnodes;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int ans;
  Integer prev;

  public int minDiffInBST(TreeNode root) {
    prev = null;
    ans = Integer.MAX_VALUE;
    dfs(root);
    return ans;
  }

  private void dfs(TreeNode node) {
    if (node == null) {
      return;
    }
    dfs(node.left);
    if (prev != null) {
      ans = Math.min(ans, node.val - prev);
    }
    prev = node.val;
    dfs(node.right);
  }
}
