package com.leetcode.algorithm.easy.symmetrictree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    List<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      int low = 0;
      int high = nodes.size() - 1;
      while (low < high) {
        TreeNode lowNode = nodes.get(low);
        TreeNode highNode = nodes.get(high);

        if (lowNode == null && highNode == null) {
          low++;
          high--;
          continue;
        }

        if (lowNode == null || highNode == null) {
          return false;
        }

        if (lowNode.val != highNode.val) {
          return false;
        }

        low++;
        high--;
      }

      List<TreeNode> children = new ArrayList<>();
      for (TreeNode node: nodes) {
        if (node != null) {
          children.add(node.left);
          children.add(node.right);
        }
      }

      nodes = children;
    }

    return true;
  }
}
