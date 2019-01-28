package com.leetcode.algorithm.easy.pathsumiii;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;

class Solution {
  public int pathSum(TreeNode root, int sum) {
    HashMap<Integer, Integer> preSum = new HashMap<>();
    preSum.put(0, 1);
    return helper(root, 0 , sum, preSum);
  }

  private int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
    if (root == null) {
      return 0;
    }

    currSum += root.val;
    int res = preSum.getOrDefault(currSum - target, 0);
    preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);

    res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
    preSum.put(currSum, preSum.get(currSum) - 1);
    return res;
  }

//  public int pathSum(TreeNode root, int sum) {
//    if (root == null) {
//      return 0;
//    }
//
//    return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
//  }
//
//  private int helper(TreeNode node, int sum) {
//    if (node == null) {
//      return 0;
//    }
//
//    int res = 0;
//    if (node.val == sum) {
//      res++;
//    }
//
//    int left = helper(node.left, sum - node.val);
//    int right = helper(node.right, sum - node.val);
//    res += left;
//    res += right;
//    return res;
//  }
}
