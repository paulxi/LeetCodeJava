package com.leetcode.algorithm.hard.recoveratreefrompreordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Stack;

class Solution {
  public TreeNode recoverFromPreorder(String str) {
    int level = 0;
    int value = 0;
    Stack<TreeNode> stack = new Stack<>();
    for (int i = 0; i < str.length();) {
      level = 0;
      while (i < str.length() && str.charAt(i) == '-') {
        level++;
        i++;
      }

      value = 0;
      while (i < str.length() && str.charAt(i) != '-') {
        value = value * 10 + (str.charAt(i) - '0');
        i++;
      }

      while (stack.size() > level) {
        stack.pop();
      }

      TreeNode node = new TreeNode(value);
      if (!stack.isEmpty()) {
        if (stack.peek().left == null) {
          stack.peek().left = node;
        } else {
          stack.peek().right = node;
        }
      }

      stack.push(node);
    }

    while (stack.size() > 1) {
      stack.pop();
    }

    return stack.pop();
  }
}
