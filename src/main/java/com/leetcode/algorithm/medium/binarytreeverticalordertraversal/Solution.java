package com.leetcode.algorithm.medium.binarytreeverticalordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.*;

class Solution {
  public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    HashMap<Integer, List<Integer>> map = new HashMap<>();
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.offer(root);
    Queue<Integer> cols = new LinkedList<>();
    cols.offer(0);
    int min = 0;
    int max = 0;
    while (!treeNodes.isEmpty()) {
      TreeNode node = treeNodes.poll();
      int col = cols.poll();

      min = Math.min(min, col);
      max = Math.max(max, col);

      List<Integer> list = map.get(col);
      if (list == null) {
        list = new ArrayList<>();
        map.put(col, list);
      }
      list.add(node.val);

      if (node.left != null) {
        treeNodes.offer(node.left);
        cols.offer(col - 1);
      }

      if (node.right != null) {
        treeNodes.offer(node.right);
        cols.offer(col + 1);
      }
    }

    for (int i = min; i <= max; i++) {
      result.add(map.get(i));
    }

    return result;
  }
}
