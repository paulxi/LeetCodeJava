package com.leetcode.algorithm.medium.convertbst;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  TreeNode prev;

  public TreeNode treeToDoublyList(TreeNode root) {
    TreeNode head = new TreeNode();
    if (root == null) {
      return null;
    }

    prev = head;
    helper(root);

    prev.right = head.right;
    head.right.left = prev;

    return head.right;
  }

  private void helper(TreeNode cur) {
    if (cur == null) {
      return;
    }
    helper(cur.left);
    TreeNode node = new TreeNode(cur.val);
    prev.right = node;
    node.left = prev;
    prev = node;
    helper(cur.right);
  }
}
