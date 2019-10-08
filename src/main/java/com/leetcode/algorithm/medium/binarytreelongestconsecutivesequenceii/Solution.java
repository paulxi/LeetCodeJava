package com.leetcode.algorithm.medium.binarytreelongestconsecutivesequenceii;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  int max = 0;
  public int longestConsecutive(TreeNode root) {
    helper(root);
    return max;
  }

  private int[] helper(TreeNode node) {
    if (node == null) {
      return new int[] {0, 0};
    }

    int[] left = helper(node.left);
    int[] right = helper(node.right);
    int inc = 1;
    int des = 1;
    if (node.left != null) {
      if (node.val - node.left.val == 1) {
        des = left[1] + 1;
      } else if (node.val - node.left.val == -1) {
        inc = left[0] + 1;
      }
    }
    if (node.right != null) {
      if (node.val - node.right.val == 1) {
        des = Math.max(des, right[1] + 1);
      } else if (node.val - node.right.val == -1) {
        inc = Math.max(inc, right[0] + 1);
      }
    }
    max = Math.max(max, inc + des - 1);
    return new int[] {inc, des};
  }
}
