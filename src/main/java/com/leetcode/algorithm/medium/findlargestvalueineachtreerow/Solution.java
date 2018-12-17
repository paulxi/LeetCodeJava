package com.leetcode.algorithm.medium.findlargestvalueineachtreerow;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<Integer> largestValues(TreeNode root) {
    if (root == null) {
      return Arrays.asList();
    }

    List<Integer> result = new ArrayList<>();
    List<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      int max = Integer.MIN_VALUE;
      List<TreeNode> children = new ArrayList<>();

      for (TreeNode node: nodes) {
        max = Math.max(node.val, max);

        if (node.left != null) {
          children.add(node.left);
        }
        if (node.right != null) {
          children.add(node.right);
        }
      }
      result.add(max);
      nodes = children;
    }

    return result;
  }
}
