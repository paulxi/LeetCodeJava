package com.leetcode.algorithm.medium.inordersuccessorinbst;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    if (p.right != null) {
      p = p.right;
      while (p.left != null) {
        p = p.left;
      }
      return p;
    }

    TreeNode res = null;
    while (root != p) {
      if (p.val > root.val) {
        root = root.right;
      } else {
        res = root;
        root = root.left;
      }
    }
    return res;
  }
}
