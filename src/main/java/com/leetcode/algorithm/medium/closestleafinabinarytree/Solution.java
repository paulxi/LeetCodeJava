package com.leetcode.algorithm.medium.closestleafinabinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.*;

class Solution {
  public int findClosestLeaf(TreeNode root, int k) {
    Map<TreeNode, TreeNode> map = new HashMap<>();
    TreeNode kNode = dfs(root, k, map);
    if (kNode == null) {
      return -1;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    Set<TreeNode> visited = new HashSet<>();
    queue.offer(kNode);
    visited.add(kNode);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();

      if (node.left == null && node.right == null) {
        return node.val;
      }

      if (node.left != null && visited.add(node.left)) {
        queue.offer(node.left);
      }

      if (node.right != null && visited.add(node.right)) {
        queue.offer(node.right);
      }

      if (map.containsKey(node) && visited.add(map.get(node))) {
        queue.offer(map.get(node));
      }
    }

    return -1;
  }

  private TreeNode dfs(TreeNode node, int k, Map<TreeNode, TreeNode> map) {
    if (node.val == k) {
      return node;
    }

    if (node.left != null) {
      map.put(node.left, node);
      TreeNode left = dfs(node.left, k, map);
      if (left != null) {
        return left;
      }
    }

    if (node.right != null) {
      map.put(node.right, node);
      TreeNode right = dfs(node.right, k, map);
      if (right != null) {
        return right;
      }
    }

    return null;
  }
}
