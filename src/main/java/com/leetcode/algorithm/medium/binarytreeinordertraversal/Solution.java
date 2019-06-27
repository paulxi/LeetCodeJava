package com.leetcode.algorithm.medium.binarytreeinordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
  //  public List<Integer> inorderTraversal(TreeNode root) {
  //    List<Integer> result = new ArrayList<>();
  //    visit(result, root);
  //
  //    return result;
  //  }
  //
  //  private void visit(List<Integer> list, TreeNode node) {
  //    if (node == null) {
  //      return;
  //    }
  //    visit(list, node.left);
  //    list.add(node.val);
  //    visit(list, node.right);
  //  }

  //  public List<Integer> inorderTraversal(TreeNode root) {
  //    List<Integer> result = new ArrayList<>();
  //    Stack<TreeNode> stack = new Stack<>();
  //    if (root != null) {
  //      stack.push(root);
  //    }
  //
  //    HashSet<TreeNode> visited = new HashSet<>();
  //    visited.add(root);
  //
  //    while (!stack.isEmpty()) {
  //      if (stack.peek().left != null && !visited.contains(stack.peek().left)) {
  //        visited.add(stack.peek().left);
  //        stack.push(stack.peek().left);
  //      } else {
  //        TreeNode node = stack.pop();
  //        result.add(node.val);
  //        if (node.right != null) {
  //          visited.add(node.right);
  //          stack.push(node.right);
  //        }
  //      }
  //    }
  //
  //    return result;
  //  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }

      curr = stack.pop();
      result.add(curr.val);
      curr = curr.right;
    }

    return result;
  }

  public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList();
    TreeNode curr = root;
    while (curr != null) {
      TreeNode node = curr.left;
      if (node != null) {
        while (node.right != null && node.right != curr) {
          node = node.right;
        }

        if (node.right != null) {
          node.right = null;
          result.add(curr.val);
          curr = curr.right;
        } else {
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
