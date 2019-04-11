package com.leetcode.algorithm.easy.constructstringfrombinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public String tree2str(TreeNode t) {
    if (t == null) {
      return "";
    }

    String ans = "" + t.val;
    if (t.left != null || t.right != null) {
      if (t.left != null) {
        ans += "(" + tree2str(t.left) + ")";
      } else {
        ans += "()";
      }

      if (t.right != null) {
        ans += "(" + tree2str(t.right) + ")";
      }
    }

    return ans;
  }
}
