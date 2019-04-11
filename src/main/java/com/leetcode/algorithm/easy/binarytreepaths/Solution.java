package com.leetcode.algorithm.easy.binarytreepaths;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> ans = new ArrayList<>();
    helper(ans, "", root);

    return ans;
  }

  private void helper(List<String> ans, String curr, TreeNode node) {
    if (node != null) {
      curr += node.val;

      if (node.left == null && node.right == null) {
        ans.add(curr);
      } else {
        helper(ans, curr + "->", node.left);
        helper(ans, curr + "->", node.right);
      }
    }
  }
}
