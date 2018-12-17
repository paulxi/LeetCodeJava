package com.leetcode.algorithm.easy.secondminimumnodeinabinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    if (root == null) {
      return -1;
    }
    int min = root.val;
    int secondMin = -1;
    List<TreeNode> list = new ArrayList<>();
    list.add(root);

    while (!list.isEmpty()) {
      List<TreeNode> children = new ArrayList<>();

      for (TreeNode node: list) {
        if (node.left != null) {
          if (node.left.val != min && (node.left.val < secondMin || secondMin == -1)) {
            secondMin = node.left.val;
          }

          if (node.left.val == min) {
            children.add(node.left);
          }
        }

        if (node.right != null) {
          if (node.right.val != min && (node.right.val < secondMin || secondMin == -1)) {
            secondMin = node.right.val;
          }

          if (node.right.val == min) {
            children.add(node.right);
          }
        }
      }

      list = children;
    }

    return secondMin;
  }
}
