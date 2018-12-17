package com.leetcode.algorithm.easy.mergetwobinarytrees;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    } else if (t1 != null && t2 != null) {
      TreeNode result = new TreeNode(t1.val + t2.val);
      result.left = mergeTrees(t1.left, t2.left);
      result.right = mergeTrees(t1.right, t2.right);
      return result;
    } else if (t1 != null) {
      return t1;
    } else {
      return t2;
    }
  }
}
