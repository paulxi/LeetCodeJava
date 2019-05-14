package com.leetcode.algorithm.easy.minimumdepthofbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int ans = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node.left == null && node.right == null) {
          return ans;
        }

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }

      ans++;
    }

    return ans;
  }
}
