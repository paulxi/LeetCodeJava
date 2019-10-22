package com.leetcode.algorithm.medium.binarysearchtreetogreatersumtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int pre = 0;
  public TreeNode bstToGst(TreeNode root) {
    if (root.right != null) {
      bstToGst(root.right);
    }
    root.val += pre;
    pre = root.val;
    if (root.left != null) {
      bstToGst(root.left);
    }
    return root;
  }
}
