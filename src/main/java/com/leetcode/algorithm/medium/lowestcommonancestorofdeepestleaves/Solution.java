package com.leetcode.algorithm.medium.lowestcommonancestorofdeepestleaves;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  private static final class Pair {
    TreeNode node;
    int d;
    Pair(TreeNode node, int d) {
      this.node = node;
      this.d = d;
    }
  }
  public TreeNode lcaDeepestLeaves(TreeNode root) {
    Pair p = getLca(root, 0);
    return p.node;
  }

  private Pair getLca(TreeNode node, int d) {
    if (node == null) {
      return new Pair(null, d);
    }
    Pair l = getLca(node.left, d + 1);
    Pair r = getLca(node.right, d + 1);
    if (l.d == r.d) {
      return new Pair(node, l.d);
    } else {
      return l.d > r.d ? l : r;
    }
  }
}
