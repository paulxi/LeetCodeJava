package com.leetcode.algorithm.medium.binarytreerightsideview;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    if (root == null) {
      return Arrays.asList();
    }

    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      result.add(nodes.get(nodes.size() - 1).val);

      ArrayList<TreeNode> children = new ArrayList<>();
      for (TreeNode node: nodes) {
        if (node.left != null) {
          children.add(node.left);
        }
        if (node.right != null) {
          children.add(node.right);
        }
      }
      nodes = children;
    }

    return result;
  }
}
