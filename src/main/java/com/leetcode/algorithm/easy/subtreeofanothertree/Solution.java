package com.leetcode.algorithm.easy.subtreeofanothertree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Stack;

class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (s == null) {
      return false;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(s);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      boolean result = isSame(node, t);
      if (result) {
        return true;
      }

      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }

    return false;
  }

  private boolean isSame(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    }

    if (s != null && t != null) {
      return s.val == t.val && isSame(s.left, t.left) && isSame(s.right, t.right);
    } else {
      return false;
    }
  }
}
