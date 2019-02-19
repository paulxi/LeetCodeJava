package com.leetcode.algorithm.medium.maximumwidthofbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
  int ans;
  Map<Integer, Integer> left;
  public int widthOfBinaryTree(TreeNode root) {
    ans = 0;
    left = new HashMap<>();
    dfs(root, 0, 0);
    return ans;
  }

  private void dfs(TreeNode node, int depth, int pos) {
    if (node == null) {
      return;
    }
    left.computeIfAbsent(depth, x -> pos);
    ans = Math.max(ans, pos - left.get(depth) + 1);
    dfs(node.left, depth + 1, 2 * pos);
    dfs(node.right, depth + 1, 2 * pos + 1);
  }
}
