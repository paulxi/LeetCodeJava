package com.leetcode.algorithm.medium.smallestsubtreewithallthedeepest;

import com.leetcode.algorithm.common.TreeNode;

import java.util.*;

class Solution {
  Map<TreeNode, Integer> depth = new HashMap<>();
  int maxDepth;

  public TreeNode subtreeWithAllDeepest(TreeNode root) {
    depth.put(null, -1);
    dfs(root, null);
    maxDepth = -1;
    for (int d: depth.values()) {
      maxDepth = Math.max(maxDepth, d);
    }

    return find(root);
  }

  private void dfs(TreeNode node, TreeNode parent) {
    if (node != null) {
      depth.put(node, depth.get(parent) + 1);
      dfs(node.left, node);
      dfs(node.right, node);
    }
  }

  private TreeNode find(TreeNode node) {
    if (node == null || depth.get(node) == maxDepth) {
      return node;
    }

    TreeNode left = find(node.left);
    TreeNode right = find(node.right);

    if (left != null && right != null) {
      return node;
    }

    if (left == null && right == null) {
      return null;
    }

    return left != null ? left : right;
  }
}
