package com.leetcode.algorithm.medium.pathsumiv;

import java.util.*;

class Solution {
//  public int pathSum(int[] nums) {
//    // https://leetcode.com/problems/path-sum-iv/discuss/198341/Simple-Java-Smart-Solution-(Map-tree-greater-Find-leaves-greater-Calc-Path-for-leaves)
//    if (nums.length == 0) {
//      return 0;
//    }
//
//    // store the values of the tree nodes;
//    // there are at most 4 levels so there could be at most 15 nodes in the tree, root has index 1
//    int[] tree = new int[16];
//    Arrays.fill(tree, 10); // since values are less than 10
//    Set<Integer> leaves = new HashSet<>();
//
//    // map the tree
//    for (int num : nums) {
//      int h = num / 100;
//      int t = (num - h * 100) / 10;
//      int u = num - h * 100 - t * 10;
//      int idx = (int) Math.pow(2, h - 1) + t - 1;
//      tree[idx] = u;
//    }
//
//    // find leaves
//    for (int i = 1; i < tree.length; i++) {
//      if (tree[i] == 10) {
//        continue; // not a node, pass
//      }
//      if (2 * i >= tree.length || (tree[2 * i] == 10 && tree[2 * i + 1] == 10)) { // is node, and also is leaf
//        leaves.add(i);
//      }
//    }
//
//    // calculate path for leaves
//    int re = 0;
//    for (int i : leaves) {
//      int sub = 0;
//      int temp = i;
//      while (temp != 0) {
//        sub += tree[temp];
//        temp /= 2;
//      }
//      re += sub;
//    }
//    return re;
//  }

  int ans;
  Map<Integer, Integer> values;

  public int pathSum(int[] nums) {
    values = new HashMap<>();
    for (int num: nums) {
      values.put(num / 10, num % 10);
    }
    helper(nums[0] / 10, 0);
    return ans;
  }

  private void helper(int node, int sum) {
    if (!values.containsKey(node)) {
      return;
    }

    int depth = node / 10;
    int pos = node % 10;

    int left = (depth + 1) * 10 + 2 * pos - 1;
    int right = left + 1;
    if (!values.containsKey(left) && !values.containsKey(right)) {
      ans += sum + values.get(node);
    } else {
      helper(left, sum + values.get(node));
      helper(right, sum + values.get(node));
    }
  }
}
