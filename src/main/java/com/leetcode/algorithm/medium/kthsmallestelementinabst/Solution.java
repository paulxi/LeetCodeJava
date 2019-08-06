package com.leetcode.algorithm.medium.kthsmallestelementinabst;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
//  public int kthSmallest(TreeNode root, int k) {
//    List<Integer> list = new ArrayList<>();
//    visit(root, list);
//
//    return list.get(k - 1);
//  }
//
//  private void visit(TreeNode node, List<Integer> list) {
//    if (node == null) {
//      return;
//    }
//
//    visit(node.left, list);
//    list.add(node.val);
//    visit(node.right, list);
//  }

  int num;
  int count;

  public int kthSmallest(TreeNode root, int k) {
    count = k;
    visit(root);
    return num;
  }

  private void visit(TreeNode node) {
    if (node == null) {
      return;
    }

    visit(node.left);

    count--;
    if (count == 0) {
      num = node.val;
      return;
    }
    visit(node.right);
  }

  public int kthSmallest2(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while (!stack.isEmpty() || curr != null) {
      if (curr != null) {
        stack.push(curr);
        curr = curr.left;
      } else {
        TreeNode node = stack.pop();
        k--;
        if (k == 0) {
          return node.val;
        }
        curr = node.right;
      }
    }

    return -1;
  }
}
