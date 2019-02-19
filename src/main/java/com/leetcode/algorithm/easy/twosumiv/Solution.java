package com.leetcode.algorithm.easy.twosumiv;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> set = new HashSet<>();
    return find(root, k, set);
  }

  private boolean find(TreeNode node, int k, Set<Integer> set) {
    if (node == null) {
      return false;
    }

    if (set.contains(k - node.val)) {
      return true;
    }

    set.add(node.val);
    return find(node.left, k, set) || find(node.right, k, set);
  }
}
