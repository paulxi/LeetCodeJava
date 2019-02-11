package com.leetcode.algorithm.hard.closestbinarysearchtreevalueii;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<Integer> closestKValues(TreeNode root, double target, int k) {
    Deque<Integer> dq = new LinkedList<>();
    inorder(root, dq);

    while (dq.size() > k) {
      if (Math.abs(dq.peekFirst() - target) > Math.abs(dq.peekLast() - target)) {
        dq.pollFirst();
      } else {
        dq.pollLast();
      }
    }

    return new ArrayList<>(dq);
  }

  private void inorder(TreeNode node, Deque<Integer> dq) {
    if (node == null) {
      return;
    }
    inorder(node.left, dq);
    dq.add(node.val);
    inorder(node.right, dq);
  }
}
