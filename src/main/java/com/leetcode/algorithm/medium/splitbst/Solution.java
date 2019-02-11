package com.leetcode.algorithm.medium.splitbst;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode[] splitBST(TreeNode root, int v) {
    if (root == null) {
      return new TreeNode[] {null, null};
    } else if (root.val <= v) {
      TreeNode[] bns = splitBST(root.right, v);
      root.right = bns[0];
      bns[0] = root;
      return bns;
    } else {
      TreeNode[] bns = splitBST(root.left, v);
      root.left = bns[1];
      bns[1] = root;
      return bns;
    }
  }
}
