package com.leetcode.algorithm.easy.secondminimumnodeinabinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    if (root == null || root.left == null) {
      return -1;
    }

    int l = root.left.val == root.val ?  findSecondMinimumValue(root.left) : root.left.val;
    int r = root.right.val == root.val ? findSecondMinimumValue(root.right) : root.right.val;

    return l == -1 || r == -1 ? Math.max(l, r) : Math.min(l, r);
  }
}
