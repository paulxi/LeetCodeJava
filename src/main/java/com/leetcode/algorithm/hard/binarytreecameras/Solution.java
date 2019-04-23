package com.leetcode.algorithm.hard.binarytreecameras;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int res = 0;

  public int minCameraCover(TreeNode root) {
    res = 0;
    return (dfs(root) < 1 ? 1 : 0) + res;
  }

  private int dfs(TreeNode node) {
    if (node == null) {
      return 2;
    }

    int left = dfs(node.left);
    int right = dfs(node.right);

    if (left == 0 || right == 0) {
      res++;
      return 1;
    }

    return left == 1 || right == 1 ? 2 : 0;
  }
}
