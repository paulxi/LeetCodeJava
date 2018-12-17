package com.leetcode.algorithm.medium.binarytreeupsidedown;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode upsideDownBinaryTree(TreeNode root) {
    if(root == null || root.left == null) {
      return root;
    }

    TreeNode newRoot = upsideDownBinaryTree(root.left);
    root.left.left = root.right;   // node 2 left children
    root.left.right = root;         // node 2 right children
    root.left = null;
    root.right = null;
    return newRoot;
  }
}
