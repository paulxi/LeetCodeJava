package com.leetcode.algorithm.medium.binarytreezigzaglevelordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    boolean left = true;
    List<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      List<Integer> values = new ArrayList<>();
      List<TreeNode> children = new ArrayList<>();
      for (TreeNode node: nodes) {
        if (left) {
          values.add(node.val);
        } else {
          values.add(0, node.val);
        }

        if (node.left != null) {
          children.add(node.left);
        }

        if (node.right != null) {
          children.add(node.right);
        }
      }

      result.add(values);
      nodes = children;
      left = !left;
    }

    return result;
  }
}
