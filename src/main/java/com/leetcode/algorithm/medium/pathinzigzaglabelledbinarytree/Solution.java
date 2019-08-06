package com.leetcode.algorithm.medium.pathinzigzaglabelledbinarytree;

import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<Integer> pathInZigZagTree(int label) {
    LinkedList<Integer> ans = new LinkedList<>();
    ans.addFirst(label);
    int parent = label;

    while (parent != 1) {
      int d = (int) (Math.log(parent) / Math.log(2));
      int offset = (int)Math.pow(2, d + 1) - 1 - parent;
      parent = ((int)Math.pow(2, d) + offset) / 2;
      ans.addFirst(parent);
    }

    return ans;
  }
}
