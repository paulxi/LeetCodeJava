package com.leetcode.algorithm.medium.binarytreelevelordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();

    if (root != null) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      while (!queue.isEmpty()) {
        List<Integer> subList = new LinkedList<>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
          TreeNode node = queue.poll();
          subList.add(node.val);

          if (node.left != null) {
            queue.offer(node.left);
          }
          if (node.right != null) {
            queue.offer(node.right);
          }
        }
        result.add(subList);
      }
    }

    return result;
  }
}
