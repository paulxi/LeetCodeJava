package com.leetcode.algorithm.medium.uniquebinarysearchtreesii;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<TreeNode> generateTrees(int n) {
    if (n == 0) {
      return new ArrayList<>();
    }

    return helper(1, n);
  }

  private List<TreeNode> helper(int start, int end) {
    List<TreeNode> result = new ArrayList<>();
    if (start > end) {
      result.add(null);
      return result;
    }

    for (int i = start; i <= end; i++) {
      List<TreeNode> left = helper(start, i - 1);
      List<TreeNode> right = helper(i + 1, end);

      for (TreeNode l : left) {
        for (TreeNode r : right) {
          TreeNode node = new TreeNode(i);
          node.left = l;
          node.right = r;
          result.add(node);
        }
      }
    }

    return result;
  }
}
