package com.leetcode.algorithm.easy.convertsortedarraytobinarysearchtree;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    TreeNode result = convert(nums, 0, nums.length - 1);

    return result;
  }

  public TreeNode convert(int[] nums, int from, int to) {
    if (from > to) {
      return null;
    }

    int mid = from + (to - from) / 2;

    TreeNode node = new TreeNode(nums[mid]);

    TreeNode left = convert(nums, from, mid - 1);
    TreeNode right = convert(nums, mid + 1, to);

    node.left = left;
    node.right = right;

    return node;
  }
}
