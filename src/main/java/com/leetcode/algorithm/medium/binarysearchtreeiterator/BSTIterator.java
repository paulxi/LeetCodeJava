package com.leetcode.algorithm.medium.binarysearchtreeiterator;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Stack;

public class BSTIterator {

  private TreeNode root;
  private Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    this.root = root;
    this.stack = new Stack<>();
    pushLeftChildren(this.root);
  }

  public boolean hasNext() {
    return !this.stack.isEmpty();
  }

  public int next() {
    if (this.stack.isEmpty()) {
      return Integer.MIN_VALUE;
    }
    TreeNode node = stack.pop();
    if (node.right != null) {
      this.pushLeftChildren(node.right);
    }

    return node.val;
  }

  private void pushLeftChildren(TreeNode node) {
    TreeNode cur = node;
    while (cur != null) {
      this.stack.push(cur);
      cur = cur.left;
    }
  }
}
