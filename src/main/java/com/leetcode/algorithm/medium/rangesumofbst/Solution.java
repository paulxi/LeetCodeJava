package com.leetcode.algorithm.medium.rangesumofbst;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public int rangeSumBST(TreeNode root, int l, int r) {
    if (root == null) {
      return 0;
    }

    if (root.val < l) {
      return rangeSumBST(root.right, l, r);
    }

    if (root.val > r) {
      return rangeSumBST(root.left, l, r);
    }

    return root.val + rangeSumBST(root.left, l, r) + rangeSumBST(root.right, l, r);
  }
}
