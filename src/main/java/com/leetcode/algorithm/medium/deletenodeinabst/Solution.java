package com.leetcode.algorithm.medium.deletenodeinabst;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }

    if (key < root.val) {
      root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
      root.right = deleteNode(root.right, key);
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      TreeNode minNode = findMin(root.right);
      root.val = minNode.val;
      root.right = deleteNode(root.right, root.val);
    }

    return root;
  }

  private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
      node = node.left;
    }

    return node;
  }
}
