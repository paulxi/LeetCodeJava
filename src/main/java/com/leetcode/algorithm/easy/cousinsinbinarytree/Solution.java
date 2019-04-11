package com.leetcode.algorithm.easy.cousinsinbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
  private Map<Integer, Integer> depth;
  private Map<Integer, TreeNode> parent;

  public boolean isCousins(TreeNode root, int x, int y) {
    depth = new HashMap<>();
    parent = new HashMap<>();

    dfs(root, null);
    return depth.get(x).intValue() == depth.get(y).intValue() && parent.get(x) != parent.get(y);
  }

  private void dfs(TreeNode node, TreeNode par) {
    if (node != null) {
      depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
      parent.put(node.val, par);
      dfs(node.left, node);
      dfs(node.right, node);
    }
  }
}
