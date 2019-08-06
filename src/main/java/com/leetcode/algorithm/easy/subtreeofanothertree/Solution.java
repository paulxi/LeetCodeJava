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

  public boolean isSubtree2(TreeNode s, TreeNode t) {
    StringBuilder sbs = new StringBuilder();
    StringBuilder sbt = new StringBuilder();
    preOrder(s, sbs);
    preOrder(t, sbt);

    return sbs.toString().indexOf(sbt.toString()) >= 0;
  }

  private void preOrder(TreeNode node, StringBuilder sb) {
    if (node == null) {
      sb.append(",null");
      return;
    }

    sb.append("," + node.val);
    preOrder(node.left, sb);
    preOrder(node.right, sb);
  }
}
