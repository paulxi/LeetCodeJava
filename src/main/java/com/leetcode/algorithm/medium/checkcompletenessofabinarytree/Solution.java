package com.leetcode.algorithm.medium.checkcompletenessofabinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public boolean isCompleteTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (queue.peek() != null) {
      TreeNode node = queue.poll();
      queue.offer(node.left);
      queue.offer(node.right);
    }

    while (!queue.isEmpty() && queue.peek() == null) {
      queue.poll();
    }

    return queue.isEmpty();
  }
}
