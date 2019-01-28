package com.leetcode.algorithm.medium.pathsumii;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    helper(root, sum, new ArrayList<>(), result);
    return result;
  }


  private void helper(TreeNode node, int sum, List<Integer> list, List<List<Integer>> result) {
    if (node == null) {
      return;
    }

    list.add(node.val);
    if (node.left == null && node.right == null && sum == node.val) {
      result.add(new ArrayList<>(list));
    } else {
      helper(node.left, sum - node.val, list, result);
      helper(node.right, sum - node.val, list, result);
    }
    list.remove(list.size() - 1);
  }
}
