package com.leetcode.algorithm.medium.insertintoabinarysearchtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }

    TreeNode curr = root;
    while (true) {
      if (curr.val <= val) {
        if (curr.right != null) {
          curr = curr.right;
        } else {
          curr.right = new TreeNode(val);
          break;
        }
      } else {
        if (curr.left != null) {
          curr = curr.left;
        } else {
          curr.left = new TreeNode(val);
          break;
        }
      }
    }

    return root;
  }
}
