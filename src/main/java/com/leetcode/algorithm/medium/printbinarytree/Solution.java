package com.leetcode.algorithm.medium.printbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<String>> printTree(TreeNode root) {
    List<List<String>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    int height = depth(root);
    String[][] res = new String[height][(1 << height) - 1];
    for (String[] strs : res) {
      Arrays.fill(strs, "");
    }
    fill(res, root, 0, 0, res[0].length);
    for (String[] strs : res) {
      result.add(Arrays.asList(strs));
    }

    return result;
  }


  private void fill(String[][] res, TreeNode node, int i, int l, int r) {
    if (node == null) {
      return;
    }

    res[i][(l + r) / 2] = String.valueOf(node.val);
    fill(res, node.left, i + 1, l, (l + r) / 2);
    fill(res, node.right, i + 1, (1 + l + r) / 2, r);
  }

  private int depth(TreeNode node) {
    if (node == null) {
      return 0;
    }

    return 1 + Math.max(depth(node.left), depth(node.right));
  }
}
