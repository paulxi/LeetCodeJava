package com.leetcode.algorithm.easy.closestbinarysearchtreevalue;

import com.leetcode.algorithm.common.TreeNode;

public class Solution {
  public int closestValue(TreeNode root, double target) {
    TreeNode node = root;
    int ans = node.val;

    while (node != null) {
      if (Math.abs(target - node.val) < Math.abs(target - ans)) {
        ans = node.val;
      }

      node = node.val > target ? node.left : node.right;
    }

    return ans;
  }
}
