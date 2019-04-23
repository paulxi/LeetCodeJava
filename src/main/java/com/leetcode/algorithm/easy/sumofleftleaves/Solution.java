package com.leetcode.algorithm.easy.sumofleftleaves;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
//  int ans;
//  public int sumOfLeftLeaves(TreeNode root) {
//    ans = 0;
//    helper(root);
//
//    return ans;
//  }
//
//  private void helper(TreeNode node) {
//    if (node == null) {
//      return;
//    }
//
//    if (node.left != null) {
//      helper(node.left);
//
//      if (node.left.left == null && node.left.right == null) {
//        ans += node.left.val;
//      }
//    }
//
//    if (node.right != null) {
//      helper(node.right);
//    }
//  }

  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int res = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null && node.left.left == null && node.left.right == null) {
        res += node.left.val;
      }

      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }

    return res;
  }
}
