package com.leetcode.algorithm.medium.maximumbinarytree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    return constructMaximumBinaryTree(nums, 0, nums.length - 1);
  }


  private TreeNode constructMaximumBinaryTree(int[] nums, int from, int to) {
    if (to - from < 0) {
      return null;
    }

    int max = Integer.MIN_VALUE;
    int maxIndex = -1;
    for (int i = from; i <= to; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIndex = i;
      }
    }

    TreeNode node = new TreeNode(max);
    node.left = constructMaximumBinaryTree(nums, from, maxIndex - 1);
    node.right = constructMaximumBinaryTree(nums,maxIndex + 1, to);

    return node;
  }
}
