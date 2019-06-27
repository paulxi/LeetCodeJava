package com.leetcode.algorithm.medium.binarytreepreordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList();
    helper(root, result);
    return result;
  }

  private void helper(TreeNode node, List<Integer> list) {
    if (node == null) {
      return;
    }

    list.add(node.val);
    helper(node.left, list);
    helper(node.right, list);
  }

  public List<Integer> preorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList();
    if (root == null) {
      return result;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      result.add(node.val);

      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }

    return result;
  }

  public List<Integer> preorderTraversal3(TreeNode root) {
    List<Integer> result = new ArrayList();
    if (root == null) {
      return result;
    }
    TreeNode curr = root;
    while (curr != null) {
      TreeNode node = curr.left;
      if (node != null) {
        while (node.right != null && node.right != curr) {
          node = node.right;
        }

        if (node.right != null) {
          node.right = null;
          curr = curr.right;
        } else {
          result.add(curr.val);
          node.right = curr;
          curr = curr.left;
        }
      } else {
        result.add(curr.val);
        curr = curr.right;
      }
    }
    return result;
  }
}
