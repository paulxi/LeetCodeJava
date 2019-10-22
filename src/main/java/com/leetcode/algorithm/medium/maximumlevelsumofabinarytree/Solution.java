package com.leetcode.algorithm.medium.maximumlevelsumofabinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int maxLevelSum(TreeNode root) {
    int max = Integer.MIN_VALUE;
    int maxLevel = 1;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int level = 1;
    while (!queue.isEmpty()) {
      int sum = 0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        sum += node.val;
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      if (max < sum) {
        max = sum;
        maxLevel = level;
      }

      level++;
    }
    return maxLevel;
  }
}
