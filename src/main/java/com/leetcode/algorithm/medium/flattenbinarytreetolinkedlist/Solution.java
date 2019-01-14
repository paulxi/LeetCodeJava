package com.leetcode.algorithm.medium.flattenbinarytreetolinkedlist;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = null;

    flatten(left);
    flatten(right);
    root.right = left;

    TreeNode cur = root;
    while (cur.right != null) {
      cur = cur.right;
    }

    cur.right = right;
  }
}
