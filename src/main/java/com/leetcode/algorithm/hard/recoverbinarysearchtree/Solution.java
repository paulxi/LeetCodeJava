package com.leetcode.algorithm.hard.recoverbinarysearchtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  private TreeNode first;
  private TreeNode second;
  private TreeNode prev = new TreeNode(Integer.MIN_VALUE);

  public void recoverTree(TreeNode root) {
    inorder(root);

    int temp = first.val;
    first.val = second.val;
    second.val = temp;
  }

  private void inorder(TreeNode node) {
    if (node == null) {
      return;
    }

    inorder(node.left);

    if (first == null && prev.val >= node.val) {
      first = prev;
    }

    if (first != null && prev.val >= node.val) {
      second = node;
    }

    prev = node;

    inorder(node.right);
  }

  public void recoverTree2(TreeNode root) {
    TreeNode curr = root;
    while (curr != null) {
      TreeNode node = curr.left;
      if (node != null) {
        while (node.right != null && node.right != curr) {
          node = node.right;
        }

        if (node.right != null) {
          if (prev.val > curr.val) {
            if (first == null) {
              first = prev;
            }
            second = curr;
          }
          prev = curr;

          node.right = null;
          curr = curr.right;
        } else {
          node.right = curr;
          curr = curr.left;
        }
      } else {
        if (prev.val > curr.val) {
          if (first == null) {
            first = prev;
          }
          second = curr;
        }
        prev = curr;

        curr = curr.right;
      }
    }

    int temp = first.val;
    first.val = second.val;
    second.val = temp;
  }
}
