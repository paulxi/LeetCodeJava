package com.leetcode.algorithm.medium.twosumbsts;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Stack;

class Solution {
  public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
    if (root1 == null || root2 == null) {
      return false;
    }

    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    TreeNode t1, t2;

    while (true) {
      while (root1 != null) {
        stack1.push(root1);
        root1 = root1.left;
      }
      while (root2 != null) {
        stack2.push(root2);
        root2 = root2.right;
      }
      if (stack1.isEmpty() || stack2.isEmpty()) {
        break;
      }
      t1 = stack1.peek();
      t2 = stack2.peek();
      if (t1.val + t2.val == target) {
        return true;
      } else if (t1.val + t2.val < target) {
        stack1.pop();
        root1 = t1.right;
      } else {
        stack2.pop();
        root2 = t2.left;
      }
    }

    return false;
  }
}
