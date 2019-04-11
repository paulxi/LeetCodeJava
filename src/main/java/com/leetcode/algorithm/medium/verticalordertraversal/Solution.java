package com.leetcode.algorithm.medium.verticalordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.*;

class Solution {
  Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new HashMap<>();
  int minX = 0;
  int maxX = 0;

  public List<List<Integer>> verticalTraversal(TreeNode root) {
    helper(root, 0, 0);
    List<List<Integer>> vertical = new ArrayList<>();
    for (int i = minX; i <= maxX; i++) {
      List<Integer> level = new ArrayList<>();
      for (int key: map.get(i).keySet()) {
        while (!map.get(i).get(key).isEmpty()) {
          level.add(map.get(i).get(key).poll());
        }
      }

      vertical.add(level);
    }
    return vertical;
  }

  private void helper(TreeNode node, int x, int y) {
    if (node == null) {
      return;
    }

    minX = Math.min(minX, x);
    maxX = Math.max(maxX, x);

    if (map.get(x) == null) {
      map.put(x, new TreeMap<>());
    }
    if (map.get(x).get(y) == null) {
      map.get(x).put(y, new PriorityQueue<>());
    }

    map.get(x).get(y).offer(node.val);
    helper(node.left, x - 1, y + 1);
    helper(node.right, x + 1, y + 1);
  }
}
