package com.leetcode.algorithm.easy.lowestcommonancestor;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }

    TreeNode small = p.val < q.val ? p : q;
    TreeNode big = small == p ? q : p;

    if (big.val < root.val) {
      return lowestCommonAncestor(root.left, small, big);
    }

    if (small.val > root.val) {
      return lowestCommonAncestor(root.right, small, big);
    }

    return root;
  }
}
